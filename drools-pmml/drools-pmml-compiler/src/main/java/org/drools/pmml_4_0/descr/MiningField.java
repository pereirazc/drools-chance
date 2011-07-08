
package org.drools.pmml_4_0.descr;

import java.io.Serializable;
import java.math.BigDecimal;
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
 *       &lt;attribute name="name" use="required" type="{http://www.dmg.org/PMML-4_0}FIELD-NAME" />
 *       &lt;attribute name="usageType" type="{http://www.dmg.org/PMML-4_0}FIELD-USAGE-TYPE" default="active" />
 *       &lt;attribute name="optype" type="{http://www.dmg.org/PMML-4_0}OPTYPE" />
 *       &lt;attribute name="importance" type="{http://www.dmg.org/PMML-4_0}PROB-NUMBER" />
 *       &lt;attribute name="outliers" type="{http://www.dmg.org/PMML-4_0}OUTLIER-TREATMENT-METHOD" default="asIs" />
 *       &lt;attribute name="lowValue" type="{http://www.dmg.org/PMML-4_0}NUMBER" />
 *       &lt;attribute name="highValue" type="{http://www.dmg.org/PMML-4_0}NUMBER" />
 *       &lt;attribute name="missingValueReplacement" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="missingValueTreatment" type="{http://www.dmg.org/PMML-4_0}MISSING-VALUE-TREATMENT-METHOD" />
 *       &lt;attribute name="invalidValueTreatment" type="{http://www.dmg.org/PMML-4_0}INVALID-VALUE-TREATMENT-METHOD" default="returnInvalid" />
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
@XmlRootElement(name = "MiningField")
public class MiningField
    implements Serializable
{

    private final static long serialVersionUID = 145235L;
    @XmlElement(name = "Extension")
    protected List<Extension> extensions;
    @XmlAttribute(required = true)
    protected String name;
    @XmlAttribute
    protected FIELDUSAGETYPE usageType;
    @XmlAttribute
    protected OPTYPE optype;
    @XmlAttribute
    protected BigDecimal importance;
    @XmlAttribute
    protected OUTLIERTREATMENTMETHOD outliers;
    @XmlAttribute
    protected Double lowValue;
    @XmlAttribute
    protected Double highValue;
    @XmlAttribute
    protected String missingValueReplacement;
    @XmlAttribute
    protected MISSINGVALUETREATMENTMETHOD missingValueTreatment;
    @XmlAttribute
    protected INVALIDVALUETREATMENTMETHOD invalidValueTreatment;

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
     * Gets the value of the name property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the value of the name property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * Gets the value of the usageType property.
     * 
     * @return
     *     possible object is
     *     {@link FIELDUSAGETYPE }
     *     
     */
    public FIELDUSAGETYPE getUsageType() {
        if (usageType == null) {
            return FIELDUSAGETYPE.ACTIVE;
        } else {
            return usageType;
        }
    }

    /**
     * Sets the value of the usageType property.
     * 
     * @param value
     *     allowed object is
     *     {@link FIELDUSAGETYPE }
     *     
     */
    public void setUsageType(FIELDUSAGETYPE value) {
        this.usageType = value;
    }

    /**
     * Gets the value of the optype property.
     * 
     * @return
     *     possible object is
     *     {@link OPTYPE }
     *     
     */
    public OPTYPE getOptype() {
        return optype;
    }

    /**
     * Sets the value of the optype property.
     * 
     * @param value
     *     allowed object is
     *     {@link OPTYPE }
     *     
     */
    public void setOptype(OPTYPE value) {
        this.optype = value;
    }

    /**
     * Gets the value of the importance property.
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getImportance() {
        return importance;
    }

    /**
     * Sets the value of the importance property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setImportance(BigDecimal value) {
        this.importance = value;
    }

    /**
     * Gets the value of the outliers property.
     * 
     * @return
     *     possible object is
     *     {@link OUTLIERTREATMENTMETHOD }
     *     
     */
    public OUTLIERTREATMENTMETHOD getOutliers() {
        if (outliers == null) {
            return OUTLIERTREATMENTMETHOD.AS_IS;
        } else {
            return outliers;
        }
    }

    /**
     * Sets the value of the outliers property.
     * 
     * @param value
     *     allowed object is
     *     {@link OUTLIERTREATMENTMETHOD }
     *     
     */
    public void setOutliers(OUTLIERTREATMENTMETHOD value) {
        this.outliers = value;
    }

    /**
     * Gets the value of the lowValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getLowValue() {
        return lowValue;
    }

    /**
     * Sets the value of the lowValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setLowValue(Double value) {
        this.lowValue = value;
    }

    /**
     * Gets the value of the highValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getHighValue() {
        return highValue;
    }

    /**
     * Sets the value of the highValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setHighValue(Double value) {
        this.highValue = value;
    }

    /**
     * Gets the value of the missingValueReplacement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMissingValueReplacement() {
        return missingValueReplacement;
    }

    /**
     * Sets the value of the missingValueReplacement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMissingValueReplacement(String value) {
        this.missingValueReplacement = value;
    }

    /**
     * Gets the value of the missingValueTreatment property.
     * 
     * @return
     *     possible object is
     *     {@link MISSINGVALUETREATMENTMETHOD }
     *     
     */
    public MISSINGVALUETREATMENTMETHOD getMissingValueTreatment() {
        return missingValueTreatment;
    }

    /**
     * Sets the value of the missingValueTreatment property.
     * 
     * @param value
     *     allowed object is
     *     {@link MISSINGVALUETREATMENTMETHOD }
     *     
     */
    public void setMissingValueTreatment(MISSINGVALUETREATMENTMETHOD value) {
        this.missingValueTreatment = value;
    }

    /**
     * Gets the value of the invalidValueTreatment property.
     * 
     * @return
     *     possible object is
     *     {@link INVALIDVALUETREATMENTMETHOD }
     *     
     */
    public INVALIDVALUETREATMENTMETHOD getInvalidValueTreatment() {
        if (invalidValueTreatment == null) {
            return INVALIDVALUETREATMENTMETHOD.RETURN_INVALID;
        } else {
            return invalidValueTreatment;
        }
    }

    /**
     * Sets the value of the invalidValueTreatment property.
     * 
     * @param value
     *     allowed object is
     *     {@link INVALIDVALUETREATMENTMETHOD }
     *     
     */
    public void setInvalidValueTreatment(INVALIDVALUETREATMENTMETHOD value) {
        this.invalidValueTreatment = value;
    }

}
