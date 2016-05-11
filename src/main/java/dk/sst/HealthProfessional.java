
package dk.sst;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for HealthProfessional complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="HealthProfessional">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AuthorizationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="BirthDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="FirstName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="LastName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProfessionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProfessionCodeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="AuthorizationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="BAuthorizationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="CAuthorizationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="TempAuthorizationBegin" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="TempAuthorizationEnd" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="AuthorizationValid" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="SeventyFiveYearsRuleStatus" type="{http://sst.dk/}SeventyFiveYearsRuleStatus"/>
 *         &lt;element name="AutonomousFunctionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="ContactLensOptometristAuthorizationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="Specialities" type="{http://sst.dk/}ArrayOfHealthProfessionalSpeciality" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HealthProfessional", propOrder = {
    "authorizationID",
    "birthDate",
    "firstName",
    "lastName",
    "professionCode",
    "professionCodeName",
    "authorizationDate",
    "bAuthorizationDate",
    "cAuthorizationDate",
    "tempAuthorizationBegin",
    "tempAuthorizationEnd",
    "authorizationValid",
    "seventyFiveYearsRuleStatus",
    "autonomousFunctionDate",
    "contactLensOptometristAuthorizationDate",
    "specialities"
})
public class HealthProfessional {

    @XmlElement(name = "AuthorizationID")
    protected String authorizationID;
    @XmlElement(name = "BirthDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthDate;
    @XmlElement(name = "FirstName")
    protected String firstName;
    @XmlElement(name = "LastName")
    protected String lastName;
    @XmlElement(name = "ProfessionCode")
    protected String professionCode;
    @XmlElement(name = "ProfessionCodeName")
    protected String professionCodeName;
    @XmlElement(name = "AuthorizationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar authorizationDate;
    @XmlElement(name = "BAuthorizationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar bAuthorizationDate;
    @XmlElement(name = "CAuthorizationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cAuthorizationDate;
    @XmlElement(name = "TempAuthorizationBegin", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tempAuthorizationBegin;
    @XmlElement(name = "TempAuthorizationEnd", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar tempAuthorizationEnd;
    @XmlElement(name = "AuthorizationValid")
    protected boolean authorizationValid;
    @XmlElement(name = "SeventyFiveYearsRuleStatus", required = true)
    protected SeventyFiveYearsRuleStatus seventyFiveYearsRuleStatus;
    @XmlElement(name = "AutonomousFunctionDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar autonomousFunctionDate;
    @XmlElement(name = "ContactLensOptometristAuthorizationDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar contactLensOptometristAuthorizationDate;
    @XmlElement(name = "Specialities")
    protected ArrayOfHealthProfessionalSpeciality specialities;

    /**
     * Gets the value of the authorizationID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAuthorizationID() {
        return authorizationID;
    }

    /**
     * Sets the value of the authorizationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAuthorizationID(String value) {
        this.authorizationID = value;
    }

    /**
     * Gets the value of the birthDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthDate() {
        return birthDate;
    }

    /**
     * Sets the value of the birthDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthDate(XMLGregorianCalendar value) {
        this.birthDate = value;
    }

    /**
     * Gets the value of the firstName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Sets the value of the firstName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFirstName(String value) {
        this.firstName = value;
    }

    /**
     * Gets the value of the lastName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * Sets the value of the lastName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastName(String value) {
        this.lastName = value;
    }

    /**
     * Gets the value of the professionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfessionCode() {
        return professionCode;
    }

    /**
     * Sets the value of the professionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfessionCode(String value) {
        this.professionCode = value;
    }

    /**
     * Gets the value of the professionCodeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfessionCodeName() {
        return professionCodeName;
    }

    /**
     * Sets the value of the professionCodeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfessionCodeName(String value) {
        this.professionCodeName = value;
    }

    /**
     * Gets the value of the authorizationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAuthorizationDate() {
        return authorizationDate;
    }

    /**
     * Sets the value of the authorizationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAuthorizationDate(XMLGregorianCalendar value) {
        this.authorizationDate = value;
    }

    /**
     * Gets the value of the bAuthorizationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBAuthorizationDate() {
        return bAuthorizationDate;
    }

    /**
     * Sets the value of the bAuthorizationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBAuthorizationDate(XMLGregorianCalendar value) {
        this.bAuthorizationDate = value;
    }

    /**
     * Gets the value of the cAuthorizationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCAuthorizationDate() {
        return cAuthorizationDate;
    }

    /**
     * Sets the value of the cAuthorizationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCAuthorizationDate(XMLGregorianCalendar value) {
        this.cAuthorizationDate = value;
    }

    /**
     * Gets the value of the tempAuthorizationBegin property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTempAuthorizationBegin() {
        return tempAuthorizationBegin;
    }

    /**
     * Sets the value of the tempAuthorizationBegin property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTempAuthorizationBegin(XMLGregorianCalendar value) {
        this.tempAuthorizationBegin = value;
    }

    /**
     * Gets the value of the tempAuthorizationEnd property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTempAuthorizationEnd() {
        return tempAuthorizationEnd;
    }

    /**
     * Sets the value of the tempAuthorizationEnd property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTempAuthorizationEnd(XMLGregorianCalendar value) {
        this.tempAuthorizationEnd = value;
    }

    /**
     * Gets the value of the authorizationValid property.
     * 
     */
    public boolean isAuthorizationValid() {
        return authorizationValid;
    }

    /**
     * Sets the value of the authorizationValid property.
     * 
     */
    public void setAuthorizationValid(boolean value) {
        this.authorizationValid = value;
    }

    /**
     * Gets the value of the seventyFiveYearsRuleStatus property.
     * 
     * @return
     *     possible object is
     *     {@link SeventyFiveYearsRuleStatus }
     *     
     */
    public SeventyFiveYearsRuleStatus getSeventyFiveYearsRuleStatus() {
        return seventyFiveYearsRuleStatus;
    }

    /**
     * Sets the value of the seventyFiveYearsRuleStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeventyFiveYearsRuleStatus }
     *     
     */
    public void setSeventyFiveYearsRuleStatus(SeventyFiveYearsRuleStatus value) {
        this.seventyFiveYearsRuleStatus = value;
    }

    /**
     * Gets the value of the autonomousFunctionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAutonomousFunctionDate() {
        return autonomousFunctionDate;
    }

    /**
     * Sets the value of the autonomousFunctionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAutonomousFunctionDate(XMLGregorianCalendar value) {
        this.autonomousFunctionDate = value;
    }

    /**
     * Gets the value of the contactLensOptometristAuthorizationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getContactLensOptometristAuthorizationDate() {
        return contactLensOptometristAuthorizationDate;
    }

    /**
     * Sets the value of the contactLensOptometristAuthorizationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setContactLensOptometristAuthorizationDate(XMLGregorianCalendar value) {
        this.contactLensOptometristAuthorizationDate = value;
    }

    /**
     * Gets the value of the specialities property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHealthProfessionalSpeciality }
     *     
     */
    public ArrayOfHealthProfessionalSpeciality getSpecialities() {
        return specialities;
    }

    /**
     * Sets the value of the specialities property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHealthProfessionalSpeciality }
     *     
     */
    public void setSpecialities(ArrayOfHealthProfessionalSpeciality value) {
        this.specialities = value;
    }

}
