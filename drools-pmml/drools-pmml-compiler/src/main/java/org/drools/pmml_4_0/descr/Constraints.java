
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
 *       &lt;attribute name="minimumNumberOfItems" type="{http://www.dmg.org/PMML-4_0}INT-NUMBER" default="1" />
 *       &lt;attribute name="maximumNumberOfItems" type="{http://www.dmg.org/PMML-4_0}INT-NUMBER" />
 *       &lt;attribute name="minimumNumberOfAntecedentItems" type="{http://www.dmg.org/PMML-4_0}INT-NUMBER" default="1" />
 *       &lt;attribute name="maximumNumberOfAntecedentItems" type="{http://www.dmg.org/PMML-4_0}INT-NUMBER" />
 *       &lt;attribute name="minimumNumberOfConsequentItems" type="{http://www.dmg.org/PMML-4_0}INT-NUMBER" default="1" />
 *       &lt;attribute name="maximumNumberOfConsequentItems" type="{http://www.dmg.org/PMML-4_0}INT-NUMBER" />
 *       &lt;attribute name="minimumSupport" type="{http://www.dmg.org/PMML-4_0}REAL-NUMBER" default="0" />
 *       &lt;attribute name="minimumConfidence" type="{http://www.dmg.org/PMML-4_0}REAL-NUMBER" default="0" />
 *       &lt;attribute name="minimumLift" type="{http://www.dmg.org/PMML-4_0}REAL-NUMBER" default="0" />
 *       &lt;attribute name="minimumTotalSequenceTime" type="{http://www.dmg.org/PMML-4_0}REAL-NUMBER" default="0" />
 *       &lt;attribute name="maximumTotalSequenceTime" type="{http://www.dmg.org/PMML-4_0}REAL-NUMBER" />
 *       &lt;attribute name="minimumItemsetSeparationTime" type="{http://www.dmg.org/PMML-4_0}REAL-NUMBER" default="0" />
 *       &lt;attribute name="maximumItemsetSeparationTime" type="{http://www.dmg.org/PMML-4_0}REAL-NUMBER" />
 *       &lt;attribute name="minimumAntConsSeparationTime" type="{http://www.dmg.org/PMML-4_0}REAL-NUMBER" default="0" />
 *       &lt;attribute name="maximumAntConsSeparationTime" type="{http://www.dmg.org/PMML-4_0}REAL-NUMBER" />
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
@XmlRootElement(name = "Constraints")
public class Constraints implements Serializable
{

    private final static long serialVersionUID = 145235L;
    @XmlElement(name = "Extension")
    protected List<Extension> extensions;
    @XmlAttribute
    protected BigInteger minimumNumberOfItems;
    @XmlAttribute
    protected BigInteger maximumNumberOfItems;
    @XmlAttribute
    protected BigInteger minimumNumberOfAntecedentItems;
    @XmlAttribute
    protected BigInteger maximumNumberOfAntecedentItems;
    @XmlAttribute
    protected BigInteger minimumNumberOfConsequentItems;
    @XmlAttribute
    protected BigInteger maximumNumberOfConsequentItems;
    @XmlAttribute
    protected Double minimumSupport;
    @XmlAttribute
    protected Double minimumConfidence;
    @XmlAttribute
    protected Double minimumLift;
    @XmlAttribute
    protected Double minimumTotalSequenceTime;
    @XmlAttribute
    protected Double maximumTotalSequenceTime;
    @XmlAttribute
    protected Double minimumItemsetSeparationTime;
    @XmlAttribute
    protected Double maximumItemsetSeparationTime;
    @XmlAttribute
    protected Double minimumAntConsSeparationTime;
    @XmlAttribute
    protected Double maximumAntConsSeparationTime;

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
     * Gets the value of the minimumNumberOfItems property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinimumNumberOfItems() {
        if (minimumNumberOfItems == null) {
            return new BigInteger("1");
        } else {
            return minimumNumberOfItems;
        }
    }

    /**
     * Sets the value of the minimumNumberOfItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinimumNumberOfItems(BigInteger value) {
        this.minimumNumberOfItems = value;
    }

    /**
     * Gets the value of the maximumNumberOfItems property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumNumberOfItems() {
        return maximumNumberOfItems;
    }

    /**
     * Sets the value of the maximumNumberOfItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumNumberOfItems(BigInteger value) {
        this.maximumNumberOfItems = value;
    }

    /**
     * Gets the value of the minimumNumberOfAntecedentItems property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinimumNumberOfAntecedentItems() {
        if (minimumNumberOfAntecedentItems == null) {
            return new BigInteger("1");
        } else {
            return minimumNumberOfAntecedentItems;
        }
    }

    /**
     * Sets the value of the minimumNumberOfAntecedentItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinimumNumberOfAntecedentItems(BigInteger value) {
        this.minimumNumberOfAntecedentItems = value;
    }

    /**
     * Gets the value of the maximumNumberOfAntecedentItems property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumNumberOfAntecedentItems() {
        return maximumNumberOfAntecedentItems;
    }

    /**
     * Sets the value of the maximumNumberOfAntecedentItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumNumberOfAntecedentItems(BigInteger value) {
        this.maximumNumberOfAntecedentItems = value;
    }

    /**
     * Gets the value of the minimumNumberOfConsequentItems property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinimumNumberOfConsequentItems() {
        if (minimumNumberOfConsequentItems == null) {
            return new BigInteger("1");
        } else {
            return minimumNumberOfConsequentItems;
        }
    }

    /**
     * Sets the value of the minimumNumberOfConsequentItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinimumNumberOfConsequentItems(BigInteger value) {
        this.minimumNumberOfConsequentItems = value;
    }

    /**
     * Gets the value of the maximumNumberOfConsequentItems property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumNumberOfConsequentItems() {
        return maximumNumberOfConsequentItems;
    }

    /**
     * Sets the value of the maximumNumberOfConsequentItems property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumNumberOfConsequentItems(BigInteger value) {
        this.maximumNumberOfConsequentItems = value;
    }

    /**
     * Gets the value of the minimumSupport property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getMinimumSupport() {
        if (minimumSupport == null) {
            return  0.0D;
        } else {
            return minimumSupport;
        }
    }

    /**
     * Sets the value of the minimumSupport property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinimumSupport(Double value) {
        this.minimumSupport = value;
    }

    /**
     * Gets the value of the minimumConfidence property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getMinimumConfidence() {
        if (minimumConfidence == null) {
            return  0.0D;
        } else {
            return minimumConfidence;
        }
    }

    /**
     * Sets the value of the minimumConfidence property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinimumConfidence(Double value) {
        this.minimumConfidence = value;
    }

    /**
     * Gets the value of the minimumLift property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getMinimumLift() {
        if (minimumLift == null) {
            return  0.0D;
        } else {
            return minimumLift;
        }
    }

    /**
     * Sets the value of the minimumLift property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinimumLift(Double value) {
        this.minimumLift = value;
    }

    /**
     * Gets the value of the minimumTotalSequenceTime property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getMinimumTotalSequenceTime() {
        if (minimumTotalSequenceTime == null) {
            return  0.0D;
        } else {
            return minimumTotalSequenceTime;
        }
    }

    /**
     * Sets the value of the minimumTotalSequenceTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinimumTotalSequenceTime(Double value) {
        this.minimumTotalSequenceTime = value;
    }

    /**
     * Gets the value of the maximumTotalSequenceTime property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaximumTotalSequenceTime() {
        return maximumTotalSequenceTime;
    }

    /**
     * Sets the value of the maximumTotalSequenceTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaximumTotalSequenceTime(Double value) {
        this.maximumTotalSequenceTime = value;
    }

    /**
     * Gets the value of the minimumItemsetSeparationTime property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getMinimumItemsetSeparationTime() {
        if (minimumItemsetSeparationTime == null) {
            return  0.0D;
        } else {
            return minimumItemsetSeparationTime;
        }
    }

    /**
     * Sets the value of the minimumItemsetSeparationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinimumItemsetSeparationTime(Double value) {
        this.minimumItemsetSeparationTime = value;
    }

    /**
     * Gets the value of the maximumItemsetSeparationTime property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaximumItemsetSeparationTime() {
        return maximumItemsetSeparationTime;
    }

    /**
     * Sets the value of the maximumItemsetSeparationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaximumItemsetSeparationTime(Double value) {
        this.maximumItemsetSeparationTime = value;
    }

    /**
     * Gets the value of the minimumAntConsSeparationTime property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getMinimumAntConsSeparationTime() {
        if (minimumAntConsSeparationTime == null) {
            return  0.0D;
        } else {
            return minimumAntConsSeparationTime;
        }
    }

    /**
     * Sets the value of the minimumAntConsSeparationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinimumAntConsSeparationTime(Double value) {
        this.minimumAntConsSeparationTime = value;
    }

    /**
     * Gets the value of the maximumAntConsSeparationTime property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaximumAntConsSeparationTime() {
        return maximumAntConsSeparationTime;
    }

    /**
     * Sets the value of the maximumAntConsSeparationTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaximumAntConsSeparationTime(Double value) {
        this.maximumAntConsSeparationTime = value;
    }

}
