
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
 *         &lt;element name="GetHealthProfessionalResult" type="{http://sst.dk/}HealthProfessional" minOccurs="0"/>
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
    "getHealthProfessionalResult"
})
@XmlRootElement(name = "GetHealthProfessionalResponse")
public class GetHealthProfessionalResponse {

    @XmlElement(name = "GetHealthProfessionalResult")
    protected HealthProfessional getHealthProfessionalResult;

    /**
     * Gets the value of the getHealthProfessionalResult property.
     * 
     * @return
     *     possible object is
     *     {@link HealthProfessional }
     *     
     */
    public HealthProfessional getGetHealthProfessionalResult() {
        return getHealthProfessionalResult;
    }

    /**
     * Sets the value of the getHealthProfessionalResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link HealthProfessional }
     *     
     */
    public void setGetHealthProfessionalResult(HealthProfessional value) {
        this.getHealthProfessionalResult = value;
    }

}
