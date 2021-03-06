/*
 * Copyright 2011 JBoss Inc
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.drools.pmml.pmml_4_1.predictive.models;


import org.drools.KnowledgeBase;
import org.drools.KnowledgeBaseFactory;
import org.drools.RuleBaseConfiguration;
import org.drools.builder.KnowledgeBuilder;
import org.drools.builder.KnowledgeBuilderFactory;
import org.drools.builder.ResourceType;
import org.drools.conf.EventProcessingOption;
import org.drools.definition.type.FactType;
import org.drools.io.ResourceFactory;
import org.drools.io.impl.ByteArrayResource;
import org.drools.pmml.pmml_4_1.DroolsAbstractPMMLTest;
import org.drools.pmml.pmml_4_1.PMML4Compiler;
import org.dmg.pmml.pmml_4_1.descr.*;
import org.drools.runtime.ClassObjectFilter;
import org.drools.runtime.StatefulKnowledgeSession;
import org.junit.After;
import org.junit.Test;

import java.util.Collection;

import static org.junit.Assert.*;

public class DecisionTreeTest extends DroolsAbstractPMMLTest {


    private static final boolean VERBOSE = true;
    private static final String source1 = "org/drools/pmml/pmml_4_1/test_tree_simple.xml";
    private static final String source2 = "org/drools/pmml/pmml_4_1/test_tree_missing.xml";
    private static final String packageName = "org.drools.pmml.pmml_4_1.test";



    @After
    public void tearDown() {
        getKSession().dispose();
    }

    @Test
    public void testSimpleTree() throws Exception {
        setKSession( getModelSession( source1, VERBOSE ) );
        setKbase( getKSession().getKnowledgeBase() );
        StatefulKnowledgeSession kSession = getKSession();

//        kSession.addEventListener( new org.drools.event.rule.DebugAgendaEventListener() );

        kSession.fireAllRules();  //init model

        FactType tgt = kSession.getKnowledgeBase().getFactType( packageName, "Fld5" );
        
        kSession.getWorkingMemoryEntryPoint( "in_Fld1" ).insert( 30.0 );
        kSession.getWorkingMemoryEntryPoint( "in_Fld2" ).insert( 60.0 );
        kSession.getWorkingMemoryEntryPoint( "in_Fld3" ).insert( "false" );
        kSession.getWorkingMemoryEntryPoint( "in_Fld4" ).insert( "optA" );

        kSession.fireAllRules();



        System.err.println( reportWMObjects( kSession ) );

        checkFirstDataFieldOfTypeStatus( tgt, true, false, "Missing", "tgtY" );
    }
    
    
    
    protected Object getToken( StatefulKnowledgeSession kSession ) {
        FactType tok = kSession.getKnowledgeBase().getFactType( packageName, "TreeToken" );
        assertNotNull( tok );
        Collection c = kSession.getObjects( new ClassObjectFilter( tok.getFactClass() ) );
        assertEquals( 1, c.size() );
        return c.iterator().next();
    }


    @Test
    public void testMissingTree() throws Exception {
        setKSession( getModelSession( source2, VERBOSE ) );
        setKbase( getKSession().getKnowledgeBase() );
        StatefulKnowledgeSession kSession = getKSession();

        kSession.fireAllRules();  //init model

        FactType tgt = kSession.getKnowledgeBase().getFactType( packageName, "Fld9" );
        FactType tok = kSession.getKnowledgeBase().getFactType( packageName, "TreeToken" );

        kSession.getWorkingMemoryEntryPoint( "in_Fld1" ).insert( 45.0 );
        kSession.getWorkingMemoryEntryPoint( "in_Fld2" ).insert( 60.0 );
        kSession.getWorkingMemoryEntryPoint( "in_Fld3" ).insert( "optA" );

        kSession.fireAllRules();

        System.err.println( reportWMObjects( kSession ) );

        Object token = getToken( kSession );
        assertEquals( 0.6, tok.get( token, "confidence" ) );
        assertEquals( "null", tok.get( token, "current" ) );

        checkFirstDataFieldOfTypeStatus( tgt, true, false, "Missing", "tgtZ" );
        
        
    }



    @Test
    public void testMissingTreeWeighted1() throws Exception {
        setKSession( getModelSession( source2, VERBOSE ) );
        setKbase( getKSession().getKnowledgeBase() );
        StatefulKnowledgeSession kSession = getKSession();

        kSession.fireAllRules();  //init model

        FactType tgt = kSession.getKnowledgeBase().getFactType( packageName, "Fld9" );
        FactType tok = kSession.getKnowledgeBase().getFactType( packageName, "TreeToken" );

        kSession.getWorkingMemoryEntryPoint( "in_Fld1" ).insert( -1.0 );
        kSession.getWorkingMemoryEntryPoint( "in_Fld2" ).insert( -1.0 );
        kSession.getWorkingMemoryEntryPoint( "in_Fld3" ).insert( "optA" );

        kSession.fireAllRules();

        System.err.println( reportWMObjects( kSession ) );

        Object token = getToken( kSession );
        assertEquals( 0.8, tok.get( token, "confidence" ) );
        assertEquals( "null", tok.get( token, "current" ) );
        assertEquals( 50.0, tok.get( token, "totalCount" ) );

        checkFirstDataFieldOfTypeStatus(tgt, true, false, "Missing", "tgtX" );


    }




    @Test
    public void testMissingTreeWeighted2() throws Exception {
        setKSession( getModelSession( source2, VERBOSE ) );
        setKbase( getKSession().getKnowledgeBase() );
        StatefulKnowledgeSession kSession = getKSession();

        kSession.fireAllRules();  //init model

        FactType tgt = kSession.getKnowledgeBase().getFactType( packageName, "Fld9" );
        FactType tok = kSession.getKnowledgeBase().getFactType( packageName, "TreeToken" );

        kSession.getWorkingMemoryEntryPoint( "in_Fld1" ).insert( -1.0 );
        kSession.getWorkingMemoryEntryPoint( "in_Fld2" ).insert( -1.0 );
        kSession.getWorkingMemoryEntryPoint( "in_Fld3" ).insert( "miss" );

        kSession.fireAllRules();

        System.err.println( reportWMObjects( kSession ) );

        Object token = getToken( kSession );
        assertEquals( 0.6, tok.get( token, "confidence" ) );
        assertEquals( "null", tok.get( token, "current" ) );
        assertEquals( 100.0, tok.get( token, "totalCount" ) );

        checkFirstDataFieldOfTypeStatus(tgt, true, false, "Missing", "tgtX" );
    }





    private StatefulKnowledgeSession compile( String drl ) {
        KnowledgeBuilder kbuilder = KnowledgeBuilderFactory.newKnowledgeBuilder();
        kbuilder.add( new ByteArrayResource( drl.getBytes() ), ResourceType.DRL );
        if ( kbuilder.hasErrors() ) {
            fail( kbuilder.getErrors().toString() );
        }        
        RuleBaseConfiguration conf = new RuleBaseConfiguration();
        conf.setEventProcessingMode( EventProcessingOption.STREAM );
        KnowledgeBase kBase = KnowledgeBaseFactory.newKnowledgeBase( conf );
        kBase.addKnowledgePackages( kbuilder.getKnowledgePackages() );
        return kBase.newStatefulKnowledgeSession();
    }
    


    @Test
    public void testMissingTreeDefault() throws Exception {
        PMML4Compiler compiler = new PMML4Compiler(); 
        PMML pmml = compiler.loadModel( PMML, ResourceFactory.newClassPathResource( source2 ).getInputStream() );

        for ( Object o : pmml.getAssociationModelsAndBaselineModelsAndClusteringModels() ) {
            if ( o instanceof TreeModel ) {
                TreeModel tree = (TreeModel) o;
                tree.setMissingValueStrategy( MISSINGVALUESTRATEGY.DEFAULT_CHILD );
            }
        }
        
        String theory = compiler.generateTheory( pmml );
        if ( VERBOSE ) {
            System.out.println( theory );
        }
        StatefulKnowledgeSession kSession = compile( theory );
        setKSession( kSession );
        setKbase( getKSession().getKnowledgeBase() );

        
        
        kSession.fireAllRules();  //init model

        FactType tgt = kSession.getKnowledgeBase().getFactType( packageName, "Fld9" );
        FactType tok = kSession.getKnowledgeBase().getFactType( packageName, "TreeToken" );

        kSession.getWorkingMemoryEntryPoint( "in_Fld1" ).insert( 70.0 );
        kSession.getWorkingMemoryEntryPoint( "in_Fld2" ).insert( 40.0 );
        kSession.getWorkingMemoryEntryPoint( "in_Fld3" ).insert( "miss" );

        kSession.fireAllRules();

        System.err.println( reportWMObjects( kSession ) );

        Object token = getToken( kSession );
        assertEquals( 0.72, (Double) tok.get( token, "confidence" ), 1e-6 );
        assertEquals( "null", tok.get( token, "current" ) );
        assertEquals( 40.0, tok.get( token, "totalCount" ) );

        checkFirstDataFieldOfTypeStatus(tgt, true, false, "Missing", "tgtX" );
    }


    @Test
    public void testMissingTreeAllMissingDefault() throws Exception {
        PMML4Compiler compiler = new PMML4Compiler();
        PMML pmml = compiler.loadModel( PMML, ResourceFactory.newClassPathResource( source2 ).getInputStream() );

        for ( Object o : pmml.getAssociationModelsAndBaselineModelsAndClusteringModels() ) {
            if ( o instanceof TreeModel ) {
                TreeModel tree = (TreeModel) o;
                tree.setMissingValueStrategy( MISSINGVALUESTRATEGY.DEFAULT_CHILD );
            }
        }

        String theory = compiler.generateTheory( pmml );
        if ( VERBOSE ) {
            System.out.println( theory );
        }
        StatefulKnowledgeSession kSession = compile( theory );
        setKSession( kSession );
        setKbase( getKSession().getKnowledgeBase() );



        kSession.fireAllRules();  //init model

        FactType tgt = kSession.getKnowledgeBase().getFactType( packageName, "Fld9" );
        FactType tok = kSession.getKnowledgeBase().getFactType( packageName, "TreeToken" );

        kSession.getWorkingMemoryEntryPoint( "in_Fld1" ).insert( -1.0 );
        kSession.getWorkingMemoryEntryPoint( "in_Fld2" ).insert( -1.0 );
        kSession.getWorkingMemoryEntryPoint( "in_Fld3" ).insert( "miss" );

        kSession.fireAllRules();

        System.err.println( reportWMObjects( kSession ) );

        Object token = getToken( kSession );
        assertEquals( 1.0, (Double) tok.get( token, "confidence" ), 1e-6 );
        assertEquals( "null", tok.get( token, "current" ) );
        assertEquals( 0.0, tok.get( token, "totalCount" ) );

//        checkFirstDataFieldOfTypeStatus(tgt, true, false, "Missing", "tgtX" );
    }




    @Test
    public void testMissingTreeLastChoice() throws Exception {
        PMML4Compiler compiler = new PMML4Compiler();
        PMML pmml = compiler.loadModel( PMML, ResourceFactory.newClassPathResource( source2 ).getInputStream() );

        for ( Object o : pmml.getAssociationModelsAndBaselineModelsAndClusteringModels() ) {
            if ( o instanceof TreeModel ) {
                TreeModel tree = (TreeModel) o;
                tree.setMissingValueStrategy( MISSINGVALUESTRATEGY.LAST_PREDICTION );
            }
        }

        String theory = compiler.generateTheory( pmml );
        if ( VERBOSE ) {
            System.out.println( theory );
        }
        StatefulKnowledgeSession kSession = compile( theory );
        setKSession( kSession );
        setKbase( getKSession().getKnowledgeBase() );



        kSession.fireAllRules();  //init model

        FactType tgt = kSession.getKnowledgeBase().getFactType( packageName, "Fld9" );
        FactType tok = kSession.getKnowledgeBase().getFactType( packageName, "TreeToken" );

        kSession.getWorkingMemoryEntryPoint( "in_Fld1" ).insert( -1.0 );
        kSession.getWorkingMemoryEntryPoint( "in_Fld2" ).insert( -1.0 );
        kSession.getWorkingMemoryEntryPoint( "in_Fld3" ).insert( "optA" );

        kSession.fireAllRules();

        System.err.println( reportWMObjects( kSession ) );

        Object token = getToken( kSession );
        assertEquals( 0.8, (Double) tok.get( token, "confidence" ), 1e-6 );
        assertEquals( "null", tok.get( token, "current" ) );
        assertEquals( 50.0, tok.get( token, "totalCount" ) );

        checkFirstDataFieldOfTypeStatus( tgt, true, false, "Missing", "tgtX" );
    }




    @Test
    public void testMissingTreeNull() throws Exception {
        PMML4Compiler compiler = new PMML4Compiler();
        PMML pmml = compiler.loadModel( PMML, ResourceFactory.newClassPathResource( source2 ).getInputStream() );

        for ( Object o : pmml.getAssociationModelsAndBaselineModelsAndClusteringModels() ) {
            if ( o instanceof TreeModel ) {
                TreeModel tree = (TreeModel) o;
                tree.setMissingValueStrategy( MISSINGVALUESTRATEGY.NULL_PREDICTION );
            }
        }

        String theory = compiler.generateTheory( pmml );
        if ( VERBOSE ) {
            System.out.println( theory );
        }
        StatefulKnowledgeSession kSession = compile( theory );
        setKSession( kSession );
        setKbase( getKSession().getKnowledgeBase() );



        kSession.fireAllRules();  //init model

        FactType tgt = kSession.getKnowledgeBase().getFactType( packageName, "Fld9" );
        FactType tok = kSession.getKnowledgeBase().getFactType( packageName, "TreeToken" );

        kSession.getWorkingMemoryEntryPoint( "in_Fld1" ).insert( -1.0 );
        kSession.getWorkingMemoryEntryPoint( "in_Fld2" ).insert( -1.0 );
        kSession.getWorkingMemoryEntryPoint( "in_Fld3" ).insert( "optA" );

        kSession.fireAllRules();

        System.err.println( reportWMObjects( kSession ) );

        Object token = getToken( kSession );
        assertEquals( 0.0, (Double) tok.get( token, "confidence" ), 1e-6 );
        assertEquals( "null", tok.get( token, "current" ) );
        assertEquals( 0.0, tok.get( token, "totalCount" ) );

        assertEquals( 0, getKSession().getObjects( new ClassObjectFilter( tgt.getFactClass() ) ).size() );
    }



    @Test
    public void testMissingAggregate() throws Exception {
        PMML4Compiler compiler = new PMML4Compiler();
        PMML pmml = compiler.loadModel( PMML, ResourceFactory.newClassPathResource( source2 ).getInputStream() );

        for ( Object o : pmml.getAssociationModelsAndBaselineModelsAndClusteringModels() ) {
            if ( o instanceof TreeModel ) {
                TreeModel tree = (TreeModel) o;
                tree.setMissingValueStrategy( MISSINGVALUESTRATEGY.AGGREGATE_NODES );
            }
        }

        String theory = compiler.generateTheory( pmml );
        if ( VERBOSE ) {
            System.out.println( theory );
        }
        StatefulKnowledgeSession kSession = compile( theory );
        setKSession( kSession );
        setKbase( getKSession().getKnowledgeBase() );



        kSession.fireAllRules();  //init model

        FactType tgt = kSession.getKnowledgeBase().getFactType( packageName, "Fld9" );
        FactType tok = kSession.getKnowledgeBase().getFactType( packageName, "TreeToken" );

        kSession.getWorkingMemoryEntryPoint( "in_Fld1" ).insert( 45.0 );
        kSession.getWorkingMemoryEntryPoint( "in_Fld2" ).insert( 90.0 );
        kSession.getWorkingMemoryEntryPoint( "in_Fld3" ).insert( "miss" );

        kSession.fireAllRules();

        System.err.println( reportWMObjects( kSession ) );

        Object token = getToken( kSession );
        assertEquals( 0.47, (Double) tok.get( token, "confidence" ), 1e-2 );
        assertEquals( "null", tok.get( token, "current" ) );
        assertEquals( 60.0, tok.get( token, "totalCount" ) );

        checkFirstDataFieldOfTypeStatus( tgt, true, false, "Missing", "tgtY" );
    }



    @Test
    public void testMissingTreeNone() throws Exception {
        PMML4Compiler compiler = new PMML4Compiler();
        PMML pmml = compiler.loadModel( PMML, ResourceFactory.newClassPathResource( source2 ).getInputStream() );

        for ( Object o : pmml.getAssociationModelsAndBaselineModelsAndClusteringModels() ) {
            if ( o instanceof TreeModel ) {
                TreeModel tree = (TreeModel) o;
                tree.setMissingValueStrategy( MISSINGVALUESTRATEGY.NONE );
            }
        }

        String theory = compiler.generateTheory( pmml );
        if ( VERBOSE ) {
            System.out.println( theory );
        }
        StatefulKnowledgeSession kSession = compile( theory );
        setKSession( kSession );
        setKbase( getKSession().getKnowledgeBase() );



        kSession.fireAllRules();  //init model

        FactType tgt = kSession.getKnowledgeBase().getFactType( packageName, "Fld9" );
        FactType tok = kSession.getKnowledgeBase().getFactType( packageName, "TreeToken" );

        kSession.getWorkingMemoryEntryPoint( "in_Fld1" ).insert( -1.0 );
        kSession.getWorkingMemoryEntryPoint( "in_Fld2" ).insert( -1.0 );
        kSession.getWorkingMemoryEntryPoint( "in_Fld3" ).insert( "miss" );

        kSession.fireAllRules();

        System.err.println( reportWMObjects( kSession ) );

        Object token = getToken( kSession );
        assertEquals( 0.6, (Double) tok.get( token, "confidence" ), 1e-6 );
        assertEquals( "null", tok.get( token, "current" ) );
        assertEquals( 100.0, tok.get( token, "totalCount" ) );

        checkFirstDataFieldOfTypeStatus( tgt, true, false, "Missing", "tgtX" );
    }


    @Test
    public void testSimpleTreeOutput() throws Exception {
        setKSession( getModelSession( source2, VERBOSE ) );
        setKbase( getKSession().getKnowledgeBase() );
        StatefulKnowledgeSession kSession = getKSession();

        kSession.fireAllRules();  //init model

        FactType tgt = kSession.getKnowledgeBase().getFactType( packageName, "Fld9" );
        FactType tok = kSession.getKnowledgeBase().getFactType( packageName, "TreeToken" );

        kSession.getWorkingMemoryEntryPoint( "in_Fld1" ).insert( -1.0 );
        kSession.getWorkingMemoryEntryPoint( "in_Fld2" ).insert( -1.0 );
        kSession.getWorkingMemoryEntryPoint( "in_Fld3" ).insert( "optA" );

        kSession.fireAllRules();

        System.err.println( reportWMObjects( kSession ) );

        Object token = getToken( kSession );
        assertEquals( 0.8, tok.get( token, "confidence" ) );
        assertEquals( "null", tok.get( token, "current" ) );
        assertEquals( 50.0, tok.get( token, "totalCount" ) );

        checkFirstDataFieldOfTypeStatus(tgt, true, false, "Missing", "tgtX" );

        checkFirstDataFieldOfTypeStatus( kSession.getKnowledgeBase().getFactType( packageName, "OutClass" ),
                    true, false, "Missing", "tgtX" );
        checkFirstDataFieldOfTypeStatus( kSession.getKnowledgeBase().getFactType( packageName, "OutProb" ),
                    true, false, "Missing", 0.8 );


    }

}
