
package dk.sst;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="name" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authorizationID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="birthdayFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="birthdayTo" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="authorizationDateFrom" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="authorizationDateTo" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="professionGroup" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="specialityName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="authorizationStatus" type="{http://sst.dk/}AuthorizationStatus"/>
 *         &lt;element name="seventyFiveYearsRule" type="{http://sst.dk/}SeventyFiveYearsRule"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "name",
    "authorizationID",
    "birthdayFrom",
    "birthdayTo",
    "authorizationDateFrom",
    "authorizationDateTo",
    "professionGroup",
    "specialityName",
    "authorizationStatus",
    "seventyFiveYearsRule"
})
@XmlRootElement(name = "GetHealthProfessionalsCount")
public class GetHealthProfessionalsCount {

    protected String name;
    protected String authorizationID;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthdayFrom;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar birthdayTo;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar authorizationDateFrom;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar authorizationDateTo;
    protected String professionGroup;
    protected String specialityName;
    @XmlElement(required = true)
    protected AuthorizationStatus authorizationStatus;
    @XmlElement(required = true)
    protected SeventyFiveYearsRule seventyFiveYearsRule;

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
     * Gets the value of the birthdayFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthdayFrom() {
        return birthdayFrom;
    }

    /**
     * Sets the value of the birthdayFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthdayFrom(XMLGregorianCalendar value) {
        this.birthdayFrom = value;
    }

    /**
     * Gets the value of the birthdayTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBirthdayTo() {
        return birthdayTo;
    }

    /**
     * Sets the value of the birthdayTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBirthdayTo(XMLGregorianCalendar value) {
        this.birthdayTo = value;
    }

    /**
     * Gets the value of the authorizationDateFrom property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAuthorizationDateFrom() {
        return authorizationDateFrom;
    }

    /**
     * Sets the value of the authorizationDateFrom property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAuthorizationDateFrom(XMLGregorianCalendar value) {
        this.authorizationDateFrom = value;
    }

    /**
     * Gets the value of the authorizationDateTo property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAuthorizationDateTo() {
        return authorizationDateTo;
    }

    /**
     * Sets the value of the authorizationDateTo property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAuthorizationDateTo(XMLGregorianCalendar value) {
        this.authorizationDateTo = value;
    }

    /**
     * Gets the value of the professionGroup property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfessionGroup() {
        return professionGroup;
    }

    /**
     * Sets the value of the professionGroup property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfessionGroup(String value) {
        this.professionGroup = value;
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

    /**
     * Gets the value of the authorizationStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AuthorizationStatus }
     *     
     */
    public AuthorizationStatus getAuthorizationStatus() {
        return authorizationStatus;
    }

    /**
     * Sets the value of the authorizationStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AuthorizationStatus }
     *     
     */
    public void setAuthorizationStatus(AuthorizationStatus value) {
        this.authorizationStatus = value;
    }

    /**
     * Gets the value of the seventyFiveYearsRule property.
     * 
     * @return
     *     possible object is
     *     {@link SeventyFiveYearsRule }
     *     
     */
    public SeventyFiveYearsRule getSeventyFiveYearsRule() {
        return seventyFiveYearsRule;
    }

    /**
     * Sets the value of the seventyFiveYearsRule property.
     * 
     * @param value
     *     allowed object is
     *     {@link SeventyFiveYearsRule }
     *     
     */
    public void setSeventyFiveYearsRule(SeventyFiveYearsRule value) {
        this.seventyFiveYearsRule = value;
    }

}
