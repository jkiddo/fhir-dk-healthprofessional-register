
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
 *         &lt;element name="GetHealthProfessionalsResult" type="{http://sst.dk/}ArrayOfHealthProfessional" minOccurs="0"/>
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
    "getHealthProfessionalsResult"
})
@XmlRootElement(name = "GetHealthProfessionalsResponse")
public class GetHealthProfessionalsResponse {

    @XmlElement(name = "GetHealthProfessionalsResult")
    protected ArrayOfHealthProfessional getHealthProfessionalsResult;

    /**
     * Gets the value of the getHealthProfessionalsResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfHealthProfessional }
     *     
     */
    public ArrayOfHealthProfessional getGetHealthProfessionalsResult() {
        return getHealthProfessionalsResult;
    }

    /**
     * Sets the value of the getHealthProfessionalsResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfHealthProfessional }
     *     
     */
    public void setGetHealthProfessionalsResult(ArrayOfHealthProfessional value) {
        this.getHealthProfessionalsResult = value;
    }

}
