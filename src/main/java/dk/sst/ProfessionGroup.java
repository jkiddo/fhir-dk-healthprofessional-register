
package dk.sst;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ProfessionGroup complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ProfessionGroup">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ProfessionCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="ProfessionCodeName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfessionGroup", propOrder = {
    "professionCode",
    "professionCodeName"
})
public class ProfessionGroup {

    @XmlElement(name = "ProfessionCode")
    protected String professionCode;
    @XmlElement(name = "ProfessionCodeName")
    protected String professionCodeName;

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

}
