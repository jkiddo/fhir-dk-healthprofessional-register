package dk.fhir;

import java.util.Map;

import javax.inject.Singleton;

import org.ebaysf.web.cors.CORSFilter;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.webapp.WebAppContext;
import org.slf4j.bridge.SLF4JBridgeHandler;

import com.google.common.base.Joiner;
import com.google.common.collect.ImmutableMap;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.servlet.GuiceServletContextListener;
import com.sun.jersey.api.container.filter.GZIPContentEncodingFilter;
import com.sun.jersey.api.core.ResourceConfig;
import com.sun.jersey.api.json.JSONConfiguration;
import com.sun.jersey.guice.JerseyServletModule;

import dk.fhir.practitioner.FhirRestfulServlet;

public class ContextListener extends GuiceServletContextListener {
	public static void main(final String[] args) throws Exception {
		final Server server = new Server(9090);
		server.setHandler(new WebAppContext("target/fhir-personnel.war", "/"));
		server.start();
	}

	@Override
	protected Injector getInjector() {
		SLF4JBridgeHandler.removeHandlersForRootLogger();
		SLF4JBridgeHandler.install();
		return Guice.createInjector(new JerseyServletModule() {

			@Override
			protected void configureServlets() {
				final Map<String, String> params = ImmutableMap
						.<String, String> builder()
						.put(JSONConfiguration.FEATURE_POJO_MAPPING, "true")
						.put(ResourceConfig.PROPERTY_CONTAINER_RESPONSE_FILTERS,
								Joiner.on(";").join(
										CharsetResponseFilter.class.getName(),
										GZIPContentEncodingFilter.class
												.getName())).build();
				serve("/model/*").with(FhirRestfulServlet.class, params);
				bind(CORSFilter.class).in(Singleton.class);
				filter("/*").through(CORSFilter.class);
			}
		});
	}
}