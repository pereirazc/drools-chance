
package org.drools.pmml_4_0.descr;

import java.io.Serializable;
import java.math.BigInteger;
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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}SetReference"/>
 *         &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *           &lt;group ref="{http://www.dmg.org/PMML-4_0}FOLLOW-SET"/>
 *         &lt;/sequence>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}Time" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" use="required" type="{http://www.dmg.org/PMML-4_0}ELEMENT-ID" />
 *       &lt;attribute name="numberOfSets" type="{http://www.dmg.org/PMML-4_0}INT-NUMBER" />
 *       &lt;attribute name="occurrence" type="{http://www.dmg.org/PMML-4_0}INT-NUMBER" />
 *       &lt;attribute name="support" type="{http://www.dmg.org/PMML-4_0}REAL-NUMBER" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "extensionsAndSetReferencesAndDelimiters"
})
@XmlRootElement(name = "Sequence")
public class Sequence implements Serializable
{

    private final static long serialVersionUID = 145235L;
    @XmlElements({
        @XmlElement(name = "SetReference", required = true, type = SetReference.class),
        @XmlElement(name = "Delimiter", required = true, type = Delimiter.class),
        @XmlElement(name = "Extension", required = true, type = Extension.class),
        @XmlElement(name = "Time", required = true, type = Time.class)
    })
    protected List<Object> extensionsAndSetReferencesAndDelimiters;
    @XmlAttribute(required = true)
    protected String id;
    @XmlAttribute
    protected BigInteger numberOfSets;
    @XmlAttribute
    protected BigInteger occurrence;
    @XmlAttribute
    protected Double support;

    /**
     * Gets the value of the extensionsAndSetReferencesAndDelimiters property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extensionsAndSetReferencesAndDelimiters property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtensionsAndSetReferencesAndDelimiters().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SetReference }
     * {@link Delimiter }
     * {@link Extension }
     * {@link Time }
     * 
     * 
     */
    public List<Object> getExtensionsAndSetReferencesAndDelimiters() {
        if (extensionsAndSetReferencesAndDelimiters == null) {
            extensionsAndSetReferencesAndDelimiters = new ArrayList<Object>();
        }
        return this.extensionsAndSetReferencesAndDelimiters;
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
     * Gets the value of the numberOfSets property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberOfSets() {
        return numberOfSets;
    }

    /**
     * Sets the value of the numberOfSets property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberOfSets(BigInteger value) {
        this.numberOfSets = value;
    }

    /**
     * Gets the value of the occurrence property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getOccurrence() {
        return occurrence;
    }

    /**
     * Sets the value of the occurrence property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setOccurrence(BigInteger value) {
        this.occurrence = value;
    }

    /**
     * Gets the value of the support property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getSupport() {
        return support;
    }

    /**
     * Sets the value of the support property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setSupport(Double value) {
        this.support = value;
    }

}
