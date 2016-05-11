
package dk.sst;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for Speciality complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="Speciality">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Arrangement" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecialityCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="SpecialityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Speciality", propOrder = {
    "arrangement",
    "specialityCode",
    "specialityName"
})
public class Speciality {

    @XmlElement(name = "Arrangement")
    protected String arrangement;
    @XmlElement(name = "SpecialityCode")
    protected String specialityCode;
    @XmlElement(name = "SpecialityName")
    protected String specialityName;

    /**
     * Gets the value of the arrangement property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getArrangement() {
        return arrangement;
    }

    /**
     * Sets the value of the arrangement property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setArrangement(String value) {
        this.arrangement = value;
    }

    /**
     * Gets the value of the specialityCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialityCode() {
        return specialityCode;
    }

    /**
     * Sets the value of the specialityCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialityCode(String value) {
        this.specialityCode = value;
    }

    /**
     * Gets the value of the specialityName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSpecialityName() {
        return specialityName;
    }

    /**
     * Sets the value of the specialityName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSpecialityName(String value) {
        this.specialityName = value;
    }

}
