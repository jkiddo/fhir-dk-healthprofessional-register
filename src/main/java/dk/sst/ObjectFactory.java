
package dk.sst;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the dk.sst package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Int_QNAME = new QName("http://sst.dk/", "int");
    private final static QName _ArrayOfSpeciality_QNAME = new QName("http://sst.dk/", "ArrayOfSpeciality");
    private final static QName _Speciality_QNAME = new QName("http://sst.dk/", "Speciality");
    private final static QName _HealthProfessional_QNAME = new QName("http://sst.dk/", "HealthProfessional");
    private final static QName _ArrayOfHealthProfessional_QNAME = new QName("http://sst.dk/", "ArrayOfHealthProfessional");
    private final static QName _ProfessionGroup_QNAME = new QName("http://sst.dk/", "ProfessionGroup");
    private final static QName _ArrayOfProfessionGroup_QNAME = new QName("http://sst.dk/", "ArrayOfProfessionGroup");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: dk.sst
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetAllProfessionGroups }
     * 
     */
    public GetAllProfessionGroups createGetAllProfessionGroups() {
        return new GetAllProfessionGroups();
    }

    /**
     * Create an instance of {@link GetAllProfessionGroupsResponse }
     * 
     */
    public GetAllProfessionGroupsResponse createGetAllProfessionGroupsResponse() {
        return new GetAllProfessionGroupsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfProfessionGroup }
     * 
     */
    public ArrayOfProfessionGroup createArrayOfProfessionGroup() {
        return new ArrayOfProfessionGroup();
    }

    /**
     * Create an instance of {@link Speciality }
     * 
     */
    public Speciality createSpeciality() {
        return new Speciality();
    }

    /**
     * Create an instance of {@link GetHealthProfessionalsCount }
     * 
     */
    public GetHealthProfessionalsCount createGetHealthProfessionalsCount() {
        return new GetHealthProfessionalsCount();
    }

    /**
     * Create an instance of {@link ProfessionGroup }
     * 
     */
    public ProfessionGroup createProfessionGroup() {
        return new ProfessionGroup();
    }

    /**
     * Create an instance of {@link GetHealthProfessionalsCountResponse }
     * 
     */
    public GetHealthProfessionalsCountResponse createGetHealthProfessionalsCountResponse() {
        return new GetHealthProfessionalsCountResponse();
    }

    /**
     * Create an instance of {@link GetSpecialityResponse }
     * 
     */
    public GetSpecialityResponse createGetSpecialityResponse() {
        return new GetSpecialityResponse();
    }

    /**
     * Create an instance of {@link GetAllSpecialities }
     * 
     */
    public GetAllSpecialities createGetAllSpecialities() {
        return new GetAllSpecialities();
    }

    /**
     * Create an instance of {@link GetProfessionGroupResponse }
     * 
     */
    public GetProfessionGroupResponse createGetProfessionGroupResponse() {
        return new GetProfessionGroupResponse();
    }

    /**
     * Create an instance of {@link GetHealthProfessionalsResponse }
     * 
     */
    public GetHealthProfessionalsResponse createGetHealthProfessionalsResponse() {
        return new GetHealthProfessionalsResponse();
    }

    /**
     * Create an instance of {@link ArrayOfHealthProfessional }
     * 
     */
    public ArrayOfHealthProfessional createArrayOfHealthProfessional() {
        return new ArrayOfHealthProfessional();
    }

    /**
     * Create an instance of {@link GetHealthProfessionalResponse }
     * 
     */
    public GetHealthProfessionalResponse createGetHealthProfessionalResponse() {
        return new GetHealthProfessionalResponse();
    }

    /**
     * Create an instance of {@link HealthProfessional }
     * 
     */
    public HealthProfessional createHealthProfessional() {
        return new HealthProfessional();
    }

    /**
     * Create an instance of {@link GetHealthProfessionals }
     * 
     */
    public GetHealthProfessionals createGetHealthProfessionals() {
        return new GetHealthProfessionals();
    }

    /**
     * Create an instance of {@link GetSpeciality }
     * 
     */
    public GetSpeciality createGetSpeciality() {
        return new GetSpeciality();
    }

    /**
     * Create an instance of {@link GetAllSpecialitiesResponse }
     * 
     */
    public GetAllSpecialitiesResponse createGetAllSpecialitiesResponse() {
        return new GetAllSpecialitiesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfSpeciality }
     * 
     */
    public ArrayOfSpeciality createArrayOfSpeciality() {
        return new ArrayOfSpeciality();
    }

    /**
     * Create an instance of {@link GetHealthProfessional }
     * 
     */
    public GetHealthProfessional createGetHealthProfessional() {
        return new GetHealthProfessional();
    }

    /**
     * Create an instance of {@link GetProfessionGroup }
     * 
     */
    public GetProfessionGroup createGetProfessionGroup() {
        return new GetProfessionGroup();
    }

    /**
     * Create an instance of {@link HealthProfessionalSpeciality }
     * 
     */
    public HealthProfessionalSpeciality createHealthProfessionalSpeciality() {
        return new HealthProfessionalSpeciality();
    }

    /**
     * Create an instance of {@link ArrayOfHealthProfessionalSpeciality }
     * 
     */
    public ArrayOfHealthProfessionalSpeciality createArrayOfHealthProfessionalSpeciality() {
        return new ArrayOfHealthProfessionalSpeciality();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sst.dk/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<Integer>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfSpeciality }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sst.dk/", name = "ArrayOfSpeciality")
    public JAXBElement<ArrayOfSpeciality> createArrayOfSpeciality(ArrayOfSpeciality value) {
        return new JAXBElement<ArrayOfSpeciality>(_ArrayOfSpeciality_QNAME, ArrayOfSpeciality.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Speciality }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sst.dk/", name = "Speciality")
    public JAXBElement<Speciality> createSpeciality(Speciality value) {
        return new JAXBElement<Speciality>(_Speciality_QNAME, Speciality.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HealthProfessional }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sst.dk/", name = "HealthProfessional")
    public JAXBElement<HealthProfessional> createHealthProfessional(HealthProfessional value) {
        return new JAXBElement<HealthProfessional>(_HealthProfessional_QNAME, HealthProfessional.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfHealthProfessional }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sst.dk/", name = "ArrayOfHealthProfessional")
    public JAXBElement<ArrayOfHealthProfessional> createArrayOfHealthProfessional(ArrayOfHealthProfessional value) {
        return new JAXBElement<ArrayOfHealthProfessional>(_ArrayOfHealthProfessional_QNAME, ArrayOfHealthProfessional.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ProfessionGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sst.dk/", name = "ProfessionGroup")
    public JAXBElement<ProfessionGroup> createProfessionGroup(ProfessionGroup value) {
        return new JAXBElement<ProfessionGroup>(_ProfessionGroup_QNAME, ProfessionGroup.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfProfessionGroup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://sst.dk/", name = "ArrayOfProfessionGroup")
    public JAXBElement<ArrayOfProfessionGroup> createArrayOfProfessionGroup(ArrayOfProfessionGroup value) {
        return new JAXBElement<ArrayOfProfessionGroup>(_ArrayOfProfessionGroup_QNAME, ArrayOfProfessionGroup.class, null, value);
    }

}
