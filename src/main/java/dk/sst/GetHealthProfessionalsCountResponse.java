
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
 *         &lt;element name="GetHealthProfessionalsCountResult" type="{http://www.w3.org/2001/XMLSchema}int"/>
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
    "getHealthProfessionalsCountResult"
})
@XmlRootElement(name = "GetHealthProfessionalsCountResponse")
public class GetHealthProfessionalsCountResponse {

    @XmlElement(name = "GetHealthProfessionalsCountResult")
    protected int getHealthProfessionalsCountResult;

    /**
     * Gets the value of the getHealthProfessionalsCountResult property.
     * 
     */
    public int getGetHealthProfessionalsCountResult() {
        return getHealthProfessionalsCountResult;
    }

    /**
     * Sets the value of the getHealthProfessionalsCountResult property.
     * 
     */
    public void setGetHealthProfessionalsCountResult(int value) {
        this.getHealthProfessionalsCountResult = value;
    }

}
