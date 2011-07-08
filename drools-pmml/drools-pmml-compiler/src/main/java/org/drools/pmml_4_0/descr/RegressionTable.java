
package org.drools.pmml_4_0.descr;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}NumericPredictor" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}CategoricalPredictor" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}PredictorTerm" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="intercept" use="required" type="{http://www.dmg.org/PMML-4_0}REAL-NUMBER" />
 *       &lt;attribute name="targetCategory" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "extensions",
    "numericPredictors",
    "categoricalPredictors",
    "predictorTerms"
})
@XmlRootElement(name = "RegressionTable")
public class RegressionTable implements Serializable
{

    private final static long serialVersionUID = 145235L;
    @XmlElement(name = "Extension")
    protected List<Extension> extensions;
    @XmlElement(name = "NumericPredictor")
    protected List<NumericPredictor> numericPredictors;
    @XmlElement(name = "CategoricalPredictor")
    protected List<CategoricalPredictor> categoricalPredictors;
    @XmlElement(name = "PredictorTerm")
    protected List<PredictorTerm> predictorTerms;
    @XmlAttribute(required = true)
    protected double intercept;
    @XmlAttribute
    protected String targetCategory;

    /**
     * Gets the value of the extensions property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extensions property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtensions().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extension }
     * 
     * 
     */
    public List<Extension> getExtensions() {
        if (extensions == null) {
            extensions = new ArrayList<Extension>();
        }
        return this.extensions;
    }

    /**
     * Gets the value of the numericPredictors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the numericPredictors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNumericPredictors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link NumericPredictor }
     * 
     * 
     */
    public List<NumericPredictor> getNumericPredictors() {
        if (numericPredictors == null) {
            numericPredictors = new ArrayList<NumericPredictor>();
        }
        return this.numericPredictors;
    }

    /**
     * Gets the value of the categoricalPredictors property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the categoricalPredictors property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCategoricalPredictors().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CategoricalPredictor }
     * 
     * 
     */
    public List<CategoricalPredictor> getCategoricalPredictors() {
        if (categoricalPredictors == null) {
            categoricalPredictors = new ArrayList<CategoricalPredictor>();
        }
        return this.categoricalPredictors;
    }

    /**
     * Gets the value of the predictorTerms property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the predictorTerms property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPredictorTerms().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PredictorTerm }
     * 
     * 
     */
    public List<PredictorTerm> getPredictorTerms() {
        if (predictorTerms == null) {
            predictorTerms = new ArrayList<PredictorTerm>();
        }
        return this.predictorTerms;
    }

    /**
     * Gets the value of the intercept property.
     * 
     */
    public double getIntercept() {
        return intercept;
    }

    /**
     * Sets the value of the intercept property.
     * 
     */
    public void setIntercept(double value) {
        this.intercept = value;
    }

    /**
     * Gets the value of the targetCategory property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTargetCategory() {
        return targetCategory;
    }

    /**
     * Sets the value of the targetCategory property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTargetCategory(String value) {
        this.targetCategory = value;
    }

}
