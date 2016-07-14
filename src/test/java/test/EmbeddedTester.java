package test;


import java.util.EnumSet;

import javax.servlet.DispatcherType;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.DefaultServlet;
import org.eclipse.jetty.servlet.ServletContextHandler;

import com.google.inject.servlet.GuiceFilter;

import dk.fhir.ContextListener;

public class EmbeddedTester {

	public static void main(String[] args) throws Exception {
		final Server server = new Server(8080);
		final ServletContextHandler sch = new ServletContextHandler(server, "/");
		sch.addEventListener(new ContextListener());
		sch.addFilter(GuiceFilter.class, "/*", EnumSet.of(DispatcherType.REQUEST));
		sch.addServlet(DefaultServlet.class, "/");
		server.start();
	}

}
