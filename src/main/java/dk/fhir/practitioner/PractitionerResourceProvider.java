package dk.fhir.practitioner;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.core.Context;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.hl7.fhir.dstu3.model.CodeableConcept;
import org.hl7.fhir.dstu3.model.Coding;
import org.hl7.fhir.dstu3.model.HumanName;
import org.hl7.fhir.dstu3.model.IdType;
import org.hl7.fhir.dstu3.model.Practitioner;
import org.hl7.fhir.dstu3.model.Practitioner.PractitionerPractitionerRoleComponent;
import org.hl7.fhir.dstu3.model.StringType;
import org.hl7.fhir.dstu3.model.UriType;
import org.joda.time.DateTime;

import com.google.common.base.Function;
import com.google.common.base.Strings;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.Lists;

import ca.uhn.fhir.rest.annotation.IdParam;
import ca.uhn.fhir.rest.annotation.Read;
import ca.uhn.fhir.rest.annotation.RequiredParam;
import ca.uhn.fhir.rest.annotation.Search;
import ca.uhn.fhir.rest.server.IResourceProvider;
import ca.uhn.fhir.rest.server.exceptions.UnprocessableEntityException;
import dk.sst.AutRegService;
import dk.sst.AutRegServiceSoap;
import dk.sst.AuthorizationStatus;
import dk.sst.HealthProfessional;
import dk.sst.HealthProfessionalSpeciality;
import dk.sst.SeventyFiveYearsRule;

/**
 * This is a resource provider which stores Patient resources in memory using a HashMap. This is obviously not a production-ready solution for many reasons, but it is useful to help illustrate how to build a fully-functional server.
 */
public class PractitionerResourceProvider implements IResourceProvider
{

	final AutRegServiceSoap soapService = new AutRegService().getAutRegServiceSoap();
	final XMLGregorianCalendar from = DatatypeFactory.newInstance().newXMLGregorianCalendar(DateTime.now().withYear(1920).toGregorianCalendar());
	final XMLGregorianCalendar to = DatatypeFactory.newInstance().newXMLGregorianCalendar(DateTime.now().withYear(2060).toGregorianCalendar());

	/**
	 * Constructor, which pre-populates the provider with one resource instance.
	 */
	public PractitionerResourceProvider() throws DatatypeConfigurationException
	{}

	/**
	 * The "@Search" annotation indicates that this method supports the search operation. You may have many different method annotated with this annotation, to support many different search criteria. This example searches by family name.
	 * 
	 * @param theFamilyName
	 *            This operation takes one parameter which is the search criteria. It is annotated with the "@Required" annotation. This annotation takes one argument, a string containing the name of the search criteria. The datatype here is StringDt, but there are other possible parameter types depending on the specific search criteria.
	 * @return This method returns a list of Patients. This list may contain multiple matching resources, or it may also be empty.
	 */
	
	@Context HttpServletRequest request;
	
	@Search()
	public List<Practitioner> findPractitionersByName(@RequiredParam(name = Practitioner.SP_NAME) final StringType theName)
	{
		if(theName.getValueAsString().length() > 4)
		{
			try
			{
				return getPersonnel(soapService.getHealthProfessionals(theName.getValueAsString(), null, from, to, from, to, null, null, AuthorizationStatus.NOT_SPECIFIED, SeventyFiveYearsRule.NOT_SPECIFIED).getHealthProfessional());
			}
			catch(final Exception e)
			{
				throw new UnprocessableEntityException("Unknown error");
			}
		}
		throw new UnprocessableEntityException("Please provide more than 4 characters for the name");
	}

	/**
	 * The getResourceType method comes from IResourceProvider, and must be overridden to indicate what type of resource this provider supplies.
	 */
	@Override
	public Class<Practitioner> getResourceType()
	{
		return Practitioner.class;
	}

	/**
	 * This is the "read" operation. The "@Read" annotation indicates that this method supports the read and/or vread operation.
	 * <p>
	 * Read operations take a single parameter annotated with the {@link IdParam} paramater, and should return a single resource instance.
	 * </p>
	 * 
	 * @param theId
	 *            The read operation takes one parameter, which must be of type IdDt and must be annotated with the "@Read.IdParam" annotation.
	 * @return Returns a resource matching this identifier, or null if none exists.
	 */
	@Read(version = false)
	public Practitioner readPractitioner(@IdParam final IdType theId)
	{
		if(theId.getIdPart().length() == 5)
		{
			final List<Practitioner> personnel = getPersonnel(Lists.newArrayList(soapService.getHealthProfessional(theId.getIdPart())));
			if(personnel.size() == 1)
			{
				return personnel.iterator().next();
			}
		}
		throw new UnprocessableEntityException("Authorization Id can only be of length 5");
	}

	private List<Practitioner> getPersonnel(final List<HealthProfessional> healthProfessionals)
	{

		if(!healthProfessionals.isEmpty())
		{
			return FluentIterable.from(healthProfessionals).transform(new Function<HealthProfessional, Practitioner>() {

				@Override
				public Practitioner apply(final HealthProfessional input)
				{
					final Practitioner practitioner = new Practitioner();
					practitioner.addIdentifier();
					practitioner.getIdentifierFirstRep().setSystemElement(new UriType("http://sst.dk"));
					practitioner.getIdentifierFirstRep().setValue(input.getAuthorizationID());
					practitioner.setId(new IdType(input.getAuthorizationID()));
					practitioner.setName(Lists.newArrayList(new HumanName().addGiven(input.getFirstName()).addFamily(input.getLastName())));
					final PractitionerPractitionerRoleComponent practitionerRole = new PractitionerPractitionerRoleComponent();
					for(final HealthProfessionalSpeciality i : input.getSpecialities().getHealthProfessionalSpeciality())
					{
						if(!Strings.isNullOrEmpty(i.getSpeciality().getSpecialityName()))
						{
							final Coding coding = new Coding("http://sst.dk", i.getSpeciality().getSpecialityName(), i.getSpeciality().getSpecialityName());
							practitionerRole.addSpecialty().setCoding(Lists.newArrayList(coding));
						}
					}
					if("Læge".equals(input.getProfessionCodeName()))
						practitionerRole.setRole(new CodeableConcept().addCoding(new Coding("http://sst.dk", "Doctor", "Doctor")));
					if("Sygeplejerske".equals(input.getProfessionCodeName()))
						practitionerRole.setRole(new CodeableConcept().addCoding(new Coding("http://sst.dk", "Nurse", "Nurse")));
					practitioner.addPractitionerRole(practitionerRole);
					return practitioner;
				}
			}).toList();
		}
		else
		{
			return Lists.newArrayList();
		}
	}
}