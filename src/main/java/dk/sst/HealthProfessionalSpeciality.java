
package dk.sst;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for HealthProfessionalSpeciality complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HealthProfessionalSpeciality">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Speciality" type="{http://sst.dk/}Speciality" minOccurs="0"/>
 *         &lt;element name="ApprovedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HealthProfessionalSpeciality", propOrder = {
    "speciality",
    "approvedDate"
})
public class HealthProfessionalSpeciality {

    @XmlElement(name = "Speciality")
    protected Speciality speciality;
    @XmlElement(name = "ApprovedDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar approvedDate;

    /**
     * Gets the value of the speciality property.
     * 
     * @return
     *     possible object is
     *     {@link Speciality }
     *     
     */
    public Speciality getSpeciality() {
        return speciality;
    }

    /**
     * Sets the value of the speciality property.
     * 
     * @param value
     *     allowed object is
     *     {@link Speciality }
     *     
     */
    public void setSpeciality(Speciality value) {
        this.speciality = value;
    }

    /**
     * Gets the value of the approvedDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getApprovedDate() {
        return approvedDate;
    }

    /**
     * Sets the value of the approvedDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setApprovedDate(XMLGregorianCalendar value) {
        this.approvedDate = value;
    }

}
