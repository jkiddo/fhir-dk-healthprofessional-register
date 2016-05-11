
package dk.sst;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for ArrayOfHealthProfessionalSpeciality complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfHealthProfessionalSpeciality">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HealthProfessionalSpeciality" type="{http://sst.dk/}HealthProfessionalSpeciality" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHealthProfessionalSpeciality", propOrder = {
    "healthProfessionalSpeciality"
})
public class ArrayOfHealthProfessionalSpeciality {

    @XmlElement(name = "HealthProfessionalSpeciality", nillable = true)
    protected List<HealthProfessionalSpeciality> healthProfessionalSpeciality;

    /**
     * Gets the value of the healthProfessionalSpeciality property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the healthProfessionalSpeciality property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHealthProfessionalSpeciality().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HealthProfessionalSpeciality }
     * 
     * 
     */
    public List<HealthProfessionalSpeciality> getHealthProfessionalSpeciality() {
        if (healthProfessionalSpeciality == null) {
            healthProfessionalSpeciality = new ArrayList<HealthProfessionalSpeciality>();
        }
        return this.healthProfessionalSpeciality;
    }

}
