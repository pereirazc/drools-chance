
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
 *         &lt;choice>
 *           &lt;element ref="{http://www.dmg.org/PMML-4_0}euclidean"/>
 *           &lt;element ref="{http://www.dmg.org/PMML-4_0}squaredEuclidean"/>
 *           &lt;element ref="{http://www.dmg.org/PMML-4_0}chebychev"/>
 *           &lt;element ref="{http://www.dmg.org/PMML-4_0}cityBlock"/>
 *           &lt;element ref="{http://www.dmg.org/PMML-4_0}minkowski"/>
 *           &lt;element ref="{http://www.dmg.org/PMML-4_0}simpleMatching"/>
 *           &lt;element ref="{http://www.dmg.org/PMML-4_0}jaccard"/>
 *           &lt;element ref="{http://www.dmg.org/PMML-4_0}tanimoto"/>
 *           &lt;element ref="{http://www.dmg.org/PMML-4_0}binarySimilarity"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="kind" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="distance"/>
 *             &lt;enumeration value="similarity"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="compareFunction" type="{http://www.dmg.org/PMML-4_0}COMPARE-FUNCTION" default="absDiff" />
 *       &lt;attribute name="minimum" type="{http://www.dmg.org/PMML-4_0}NUMBER" />
 *       &lt;attribute name="maximum" type="{http://www.dmg.org/PMML-4_0}NUMBER" />
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
    "binarySimilarity",
    "tanimoto",
    "jaccard",
    "simpleMatching",
    "minkowski",
    "cityBlock",
    "chebychev",
    "squaredEuclidean",
    "euclidean"
})
@XmlRootElement(name = "ComparisonMeasure")
public class ComparisonMeasure implements Serializable
{

    private final static long serialVersionUID = 145235L;
    @XmlElement(name = "Extension")
    protected List<Extension> extensions;
    protected BinarySimilarity binarySimilarity;
    protected Tanimoto tanimoto;
    protected Jaccard jaccard;
    protected SimpleMatching simpleMatching;
    protected Minkowski minkowski;
    protected CityBlock cityBlock;
    protected Chebychev chebychev;
    protected SquaredEuclidean squaredEuclidean;
    protected Euclidean euclidean;
    @XmlAttribute(required = true)
    protected String kind;
    @XmlAttribute
    protected COMPAREFUNCTION compareFunction;
    @XmlAttribute
    protected Double minimum;
    @XmlAttribute
    protected Double maximum;

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
     * Gets the value of the binarySimilarity property.
     * 
     * @return
     *     possible object is
     *     {@link BinarySimilarity }
     *     
     */
    public BinarySimilarity getBinarySimilarity() {
        return binarySimilarity;
    }

    /**
     * Sets the value of the binarySimilarity property.
     * 
     * @param value
     *     allowed object is
     *     {@link BinarySimilarity }
     *     
     */
    public void setBinarySimilarity(BinarySimilarity value) {
        this.binarySimilarity = value;
    }

    /**
     * Gets the value of the tanimoto property.
     * 
     * @return
     *     possible object is
     *     {@link Tanimoto }
     *     
     */
    public Tanimoto getTanimoto() {
        return tanimoto;
    }

    /**
     * Sets the value of the tanimoto property.
     * 
     * @param value
     *     allowed object is
     *     {@link Tanimoto }
     *     
     */
    public void setTanimoto(Tanimoto value) {
        this.tanimoto = value;
    }

    /**
     * Gets the value of the jaccard property.
     * 
     * @return
     *     possible object is
     *     {@link Jaccard }
     *     
     */
    public Jaccard getJaccard() {
        return jaccard;
    }

    /**
     * Sets the value of the jaccard property.
     * 
     * @param value
     *     allowed object is
     *     {@link Jaccard }
     *     
     */
    public void setJaccard(Jaccard value) {
        this.jaccard = value;
    }

    /**
     * Gets the value of the simpleMatching property.
     * 
     * @return
     *     possible object is
     *     {@link SimpleMatching }
     *     
     */
    public SimpleMatching getSimpleMatching() {
        return simpleMatching;
    }

    /**
     * Sets the value of the simpleMatching property.
     * 
     * @param value
     *     allowed object is
     *     {@link SimpleMatching }
     *     
     */
    public void setSimpleMatching(SimpleMatching value) {
        this.simpleMatching = value;
    }

    /**
     * Gets the value of the minkowski property.
     * 
     * @return
     *     possible object is
     *     {@link Minkowski }
     *     
     */
    public Minkowski getMinkowski() {
        return minkowski;
    }

    /**
     * Sets the value of the minkowski property.
     * 
     * @param value
     *     allowed object is
     *     {@link Minkowski }
     *     
     */
    public void setMinkowski(Minkowski value) {
        this.minkowski = value;
    }

    /**
     * Gets the value of the cityBlock property.
     * 
     * @return
     *     possible object is
     *     {@link CityBlock }
     *     
     */
    public CityBlock getCityBlock() {
        return cityBlock;
    }

    /**
     * Sets the value of the cityBlock property.
     * 
     * @param value
     *     allowed object is
     *     {@link CityBlock }
     *     
     */
    public void setCityBlock(CityBlock value) {
        this.cityBlock = value;
    }

    /**
     * Gets the value of the chebychev property.
     * 
     * @return
     *     possible object is
     *     {@link Chebychev }
     *     
     */
    public Chebychev getChebychev() {
        return chebychev;
    }

    /**
     * Sets the value of the chebychev property.
     * 
     * @param value
     *     allowed object is
     *     {@link Chebychev }
     *     
     */
    public void setChebychev(Chebychev value) {
        this.chebychev = value;
    }

    /**
     * Gets the value of the squaredEuclidean property.
     * 
     * @return
     *     possible object is
     *     {@link SquaredEuclidean }
     *     
     */
    public SquaredEuclidean getSquaredEuclidean() {
        return squaredEuclidean;
    }

    /**
     * Sets the value of the squaredEuclidean property.
     * 
     * @param value
     *     allowed object is
     *     {@link SquaredEuclidean }
     *     
     */
    public void setSquaredEuclidean(SquaredEuclidean value) {
        this.squaredEuclidean = value;
    }

    /**
     * Gets the value of the euclidean property.
     * 
     * @return
     *     possible object is
     *     {@link Euclidean }
     *     
     */
    public Euclidean getEuclidean() {
        return euclidean;
    }

    /**
     * Sets the value of the euclidean property.
     * 
     * @param value
     *     allowed object is
     *     {@link Euclidean }
     *     
     */
    public void setEuclidean(Euclidean value) {
        this.euclidean = value;
    }

    /**
     * Gets the value of the kind property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKind() {
        return kind;
    }

    /**
     * Sets the value of the kind property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKind(String value) {
        this.kind = value;
    }

    /**
     * Gets the value of the compareFunction property.
     * 
     * @return
     *     possible object is
     *     {@link COMPAREFUNCTION }
     *     
     */
    public COMPAREFUNCTION getCompareFunction() {
        if (compareFunction == null) {
            return COMPAREFUNCTION.ABS_DIFF;
        } else {
            return compareFunction;
        }
    }

    /**
     * Sets the value of the compareFunction property.
     * 
     * @param value
     *     allowed object is
     *     {@link COMPAREFUNCTION }
     *     
     */
    public void setCompareFunction(COMPAREFUNCTION value) {
        this.compareFunction = value;
    }

    /**
     * Gets the value of the minimum property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMinimum() {
        return minimum;
    }

    /**
     * Sets the value of the minimum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMinimum(Double value) {
        this.minimum = value;
    }

    /**
     * Gets the value of the maximum property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getMaximum() {
        return maximum;
    }

    /**
     * Sets the value of the maximum property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setMaximum(Double value) {
        this.maximum = value;
    }

}
