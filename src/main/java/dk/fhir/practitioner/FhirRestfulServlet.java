package dk.fhir.practitioner;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Singleton;
import javax.xml.datatype.DatatypeConfigurationException;

import ca.uhn.fhir.context.FhirContext;
import ca.uhn.fhir.narrative.DefaultThymeleafNarrativeGenerator;
import ca.uhn.fhir.narrative.INarrativeGenerator;
import ca.uhn.fhir.rest.server.IResourceProvider;
import ca.uhn.fhir.rest.server.RestfulServer;
import ca.uhn.fhir.rest.server.interceptor.ResponseHighlighterInterceptor;

/**
 * This servlet is the actual FHIR server itself
 */
@Singleton
public class FhirRestfulServlet extends RestfulServer
{

	private static final long serialVersionUID = 1L;

	/**
	 * Constructor
	 */
	public FhirRestfulServlet()
	{
		super(FhirContext.forDstu2()); // Support DSTU2
	}

	/**
	 * This method is called automatically when the servlet is initializing.
	 */
	@Override
	public void initialize()
	{
		/*
		 * Two resource providers are defined. Each one handles a specific type of resource.
		 */
		final List<IResourceProvider> providers = new ArrayList<IResourceProvider>();
		try
		{
			providers.add(new PractitionerResourceProvider());
		}
		catch(final DatatypeConfigurationException e)
		{
			throw new RuntimeException(e);
		}
		setResourceProviders(providers);

		/*
		 * Use a narrative generator. This is a completely optional step, but can be useful as it causes HAPI to generate narratives for resources which don't otherwise have one.
		 */
		final INarrativeGenerator narrativeGen = new DefaultThymeleafNarrativeGenerator();
		getFhirContext().setNarrativeGenerator(narrativeGen);

		/*
		 * Tells HAPI to use content types which are not technically FHIR compliant when a browser is detected as the requesting client. This prevents browsers from trying to download resource responses instead of displaying them inline which can be handy for troubleshooting.
		 */
		setServerVersion("1.0b");
		setImplementationDescription("There is no reason why FHIR interfaces should be either complex or expensive. This server exposes the danish authorization register on-the-fly. Go use it!");
		setServerName("SST on FHIR © Jens Kristian Villadsen");
		
        registerInterceptor(new ResponseHighlighterInterceptor());

	}
}