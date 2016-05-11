
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
 *         &lt;element name="GetAllSpecialitiesResult" type="{http://sst.dk/}ArrayOfSpeciality" minOccurs="0"/>
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
    "getAllSpecialitiesResult"
})
@XmlRootElement(name = "GetAllSpecialitiesResponse")
public class GetAllSpecialitiesResponse {

    @XmlElement(name = "GetAllSpecialitiesResult")
    protected ArrayOfSpeciality getAllSpecialitiesResult;

    /**
     * Gets the value of the getAllSpecialitiesResult property.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfSpeciality }
     *     
     */
    public ArrayOfSpeciality getGetAllSpecialitiesResult() {
        return getAllSpecialitiesResult;
    }

    /**
     * Sets the value of the getAllSpecialitiesResult property.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfSpeciality }
     *     
     */
    public void setGetAllSpecialitiesResult(ArrayOfSpeciality value) {
        this.getAllSpecialitiesResult = value;
    }

}
