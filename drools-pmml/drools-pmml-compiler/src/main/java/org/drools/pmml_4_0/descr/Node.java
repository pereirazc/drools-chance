
package org.drools.pmml_4_0.descr;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElements;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}Extension" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;group ref="{http://www.dmg.org/PMML-4_0}PREDICATE"/>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element ref="{http://www.dmg.org/PMML-4_0}Partition" minOccurs="0"/>
 *             &lt;element ref="{http://www.dmg.org/PMML-4_0}ScoreDistribution" maxOccurs="unbounded" minOccurs="0"/>
 *             &lt;element ref="{http://www.dmg.org/PMML-4_0}Node" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;/sequence>
 *           &lt;group ref="{http://www.dmg.org/PMML-4_0}EmbeddedModel"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="score" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="recordCount" type="{http://www.dmg.org/PMML-4_0}NUMBER" />
 *       &lt;attribute name="defaultChild" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "extensionsAndSimplePredicatesAndCompoundPredicates",
    "decisionTree",
    "regression",
    "partition",
    "scoreDistributions",
    "nodes"
})
@XmlRootElement(name = "Node")
public class Node implements Serializable
{

    private final static long serialVersionUID = 145235L;
    @XmlElements({
        @XmlElement(name = "CompoundPredicate", type = CompoundPredicate.class),
        @XmlElement(name = "Extension", type = Extension.class),
        @XmlElement(name = "True", type = True.class),
        @XmlElement(name = "False", type = False.class),
        @XmlElement(name = "SimplePredicate", type = SimplePredicate.class),
        @XmlElement(name = "SimpleSetPredicate", type = SimpleSetPredicate.class)
    })
    protected List<Object> extensionsAndSimplePredicatesAndCompoundPredicates;
    @XmlElement(name = "DecisionTree")
    protected DecisionTree decisionTree;
    @XmlElement(name = "Regression")
    protected Regression regression;
    @XmlElement(name = "Partition")
    protected Partition partition;
    @XmlElement(name = "ScoreDistribution")
    protected List<ScoreDistribution> scoreDistributions;
    @XmlElement(name = "Node")
    protected List<Node> nodes;
    @XmlAttribute
    protected String id;
    @XmlAttribute
    protected String score;
    @XmlAttribute
    protected Double recordCount;
    @XmlAttribute
    protected String defaultChild;

    /**
     * Gets the value of the extensionsAndSimplePredicatesAndCompoundPredicates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extensionsAndSimplePredicatesAndCompoundPredicates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtensionsAndSimplePredicatesAndCompoundPredicates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompoundPredicate }
     * {@link Extension }
     * {@link True }
     * {@link False }
     * {@link SimplePredicate }
     * {@link SimpleSetPredicate }
     * 
     * 
     */
    public List<Object> getExtensionsAndSimplePredicatesAndCompoundPredicates() {
        if (extensionsAndSimplePredicatesAndCompoundPredicates == null) {
            extensionsAndSimplePredicatesAndCompoundPredicates = new ArrayList<Object>();
        }
        return this.extensionsAndSimplePredicatesAndCompoundPredicates;
    }

    /**
     * Gets the value of the decisionTree property.
     * 
     * @return
     *     possible object is
     *     {@link DecisionTree }
     *     
     */
    public DecisionTree getDecisionTree() {
        return decisionTree;
    }

    /**
     * Sets the value of the decisionTree property.
     * 
     * @param value
     *     allowed object is
     *     {@link DecisionTree }
     *     
     */
    public void setDecisionTree(DecisionTree value) {
        this.decisionTree = value;
    }

    /**
     * Gets the value of the regression property.
     * 
     * @return
     *     possible object is
     *     {@link Regression }
     *     
     */
    public Regression getRegression() {
        return regression;
    }

    /**
     * Sets the value of the regression property.
     * 
     * @param value
     *     allowed object is
     *     {@link Regression }
     *     
     */
    public void setRegression(Regression value) {
        this.regression = value;
    }

    /**
     * Gets the value of the partition property.
     * 
     * @return
     *     possible object is
     *     {@link Partition }
     *     
     */
    public Partition getPartition() {
        return partition;
    }

    /**
     * Sets the value of the partition property.
     * 
     * @param value
     *     allowed object is
     *     {@link Partition }
     *     
     */
    public void setPartition(Partition value) {
        this.partition = value;
    }

    /**
     * Gets the value of the scoreDistributions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the scoreDistributions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getScoreDistributions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ScoreDistribution }
     * 
     * 
     */
    public List<ScoreDistribution> getScoreDistributions() {
        if (scoreDistributions == null) {
            scoreDistributions = new ArrayList<ScoreDistribution>();
        }
        return this.scoreDistributions;
    }

    /**
     * Gets the value of the nodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Node }
     * 
     * 
     */
    public List<Node> getNodes() {
        if (nodes == null) {
            nodes = new ArrayList<Node>();
        }
        return this.nodes;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the score property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScore() {
        return score;
    }

    /**
     * Sets the value of the score property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScore(String value) {
        this.score = value;
    }

    /**
     * Gets the value of the recordCount property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getRecordCount() {
        return recordCount;
    }

    /**
     * Sets the value of the recordCount property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setRecordCount(Double value) {
        this.recordCount = value;
    }

    /**
     * Gets the value of the defaultChild property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDefaultChild() {
        return defaultChild;
    }

    /**
     * Sets the value of the defaultChild property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDefaultChild(String value) {
        this.defaultChild = value;
    }

}
