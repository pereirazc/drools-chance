
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
 *       &lt;/sequence>
 *       &lt;attribute name="localTermWeights" default="termFrequency">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="termFrequency"/>
 *             &lt;enumeration value="binary"/>
 *             &lt;enumeration value="logarithmic"/>
 *             &lt;enumeration value="augmentedNormalizedTermFrequency"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="globalTermWeights" default="inverseDocumentFrequency">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="inverseDocumentFrequency"/>
 *             &lt;enumeration value="none"/>
 *             &lt;enumeration value="GFIDF"/>
 *             &lt;enumeration value="normal"/>
 *             &lt;enumeration value="probabilisticInverse"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="documentNormalization" default="none">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="none"/>
 *             &lt;enumeration value="cosine"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
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
@XmlRootElement(name = "TextModelNormalization")
public class TextModelNormalization implements Serializable
{

    private final static long serialVersionUID = 145235L;
    @XmlElement(name = "Extension")
    protected List<Extension> extensions;
    @XmlAttribute
    protected String localTermWeights;
    @XmlAttribute
    protected String globalTermWeights;
    @XmlAttribute
    protected String documentNormalization;

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
     * Gets the value of the localTermWeights property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocalTermWeights() {
        if (localTermWeights == null) {
            return "termFrequency";
        } else {
            return localTermWeights;
        }
    }

    /**
     * Sets the value of the localTermWeights property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocalTermWeights(String value) {
        this.localTermWeights = value;
    }

    /**
     * Gets the value of the globalTermWeights property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalTermWeights() {
        if (globalTermWeights == null) {
            return "inverseDocumentFrequency";
        } else {
            return globalTermWeights;
        }
    }

    /**
     * Sets the value of the globalTermWeights property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalTermWeights(String value) {
        this.globalTermWeights = value;
    }

    /**
     * Gets the value of the documentNormalization property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentNormalization() {
        if (documentNormalization == null) {
            return "none";
        } else {
            return documentNormalization;
        }
    }

    /**
     * Sets the value of the documentNormalization property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentNormalization(String value) {
        this.documentNormalization = value;
    }

}
