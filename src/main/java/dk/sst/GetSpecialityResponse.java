
package dk.sst;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element name="GetSpecialityResult" type="{http://sst.dk/}Speciality" minOccurs="0"/>
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
    "getSpecialityResult"
})
@XmlRootElement(name = "GetSpecialityResponse")
public class GetSpecialityResponse {

    @XmlElement(name = "GetSpecialityResult")
    protected Speciality getSpecialityResult;

    /**
     * Gets the value of the getSpecialityResult property.
     * 
     * @return
     *     possible object is
     *     {@link Speciality }
     *     
     */
    public Speciality getGetSpecialityResult() {
        return getSpecialityResult;
    }

    /**
     * Sets the value of the getSpecialityResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link Speciality }
     *     
     */
    public void setGetSpecialityResult(Speciality value) {
        this.getSpecialityResult = value;
    }

}
