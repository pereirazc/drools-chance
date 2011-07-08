
package org.drools.pmml_4_0.descr;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlList;
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
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}Indices" minOccurs="0"/>
 *         &lt;element ref="{http://www.dmg.org/PMML-4_0}REAL-Entries" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="n" type="{http://www.dmg.org/PMML-4_0}INT-NUMBER" />
 *       &lt;attribute name="defaultValue" type="{http://www.dmg.org/PMML-4_0}REAL-NUMBER" default="0" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "indices",
    "realEntries"
})
@XmlRootElement(name = "REAL-SparseArray")
public class REALSparseArray
    implements Serializable
{

    private final static long serialVersionUID = 145235L;
    @XmlList
    @XmlElement(name = "Indices", type = Integer.class)
    protected List<Integer> indices;
    @XmlList
    @XmlElement(name = "REAL-Entries", type = Double.class)
    protected List<Double> realEntries;
    @XmlAttribute
    protected BigInteger n;
    @XmlAttribute
    protected Double defaultValue;

    /**
     * Gets the value of the indices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the indices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getIndices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Integer }
     * 
     * 
     */
    public List<Integer> getIndices() {
        if (indices == null) {
            indices = new ArrayList<Integer>();
        }
        return this.indices;
    }

    /**
     * Gets the value of the realEntries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the realEntries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getREALEntries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Double }
     * 
     * 
     */
    public List<Double> getREALEntries() {
        if (realEntries == null) {
            realEntries = new ArrayList<Double>();
        }
        return this.realEntries;
    }

    /**
     * Gets the value of the n property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getN() {
        return n;
    }

    /**
     * Sets the value of the n property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setN(BigInteger value) {
        this.n = value;
    }

    /**
     * Gets the value of the defaultValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public double getDefaultValue() {
        if (defaultValue == null) {
            return  0.0D;
        } else {
            return defaultValue;
        }
    }

    /**
     * Sets the value of the defaultValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setDefaultValue(Double value) {
        this.defaultValue = value;
    }

}
