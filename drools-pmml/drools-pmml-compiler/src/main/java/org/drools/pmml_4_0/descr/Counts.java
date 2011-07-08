
package org.drools.pmml_4_0.descr;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *       &lt;/sequence>
 *       &lt;attribute name="totalFreq" use="required" type="{http://www.dmg.org/PMML-4_0}NUMBER" />
 *       &lt;attribute name="missingFreq" type="{http://www.dmg.org/PMML-4_0}NUMBER" />
 *       &lt;attribute name="invalidFreq" type="{http://www.dmg.org/PMML-4_0}NUMBER" />
 *       &lt;attribute name="cardinality" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "extensions"
})
@XmlRootElement(name = "Counts")
public class Counts
    implements Serializable
{

    private final static long serialVersionUID = 145235L;
    @XmlElement(name = "Extension")
    protected List<Extension> extensions;
    @XmlAttribute(required = true)
    protected double totalFreq;
    @XmlAttribute
    protected Double missingFreq;
    @XmlAttribute
    protected Double invalidFreq;
    @XmlAttribute
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger cardinality;

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
     * Gets the value of the totalFreq property.
     * 
     */
    public double getTotalFreq() {
        return totalFreq;
    }

    /**
     * Sets the value of the totalFreq property.
     * 
     */
    public void setTotalFreq(double value) {
        this.totalFreq = value;
    }

    /**
     * Gets the value of the missingFreq property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMissingFreq() {
        return missingFreq;
    }

    /**
     * Sets the value of the missingFreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMissingFreq(Double value) {
        this.missingFreq = value;
    }

    /**
     * Gets the value of the invalidFreq property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getInvalidFreq() {
        return invalidFreq;
    }

    /**
     * Sets the value of the invalidFreq property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setInvalidFreq(Double value) {
        this.invalidFreq = value;
    }

    /**
     * Gets the value of the cardinality property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCardinality() {
        return cardinality;
    }

    /**
     * Sets the value of the cardinality property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCardinality(BigInteger value) {
        this.cardinality = value;
    }

}
