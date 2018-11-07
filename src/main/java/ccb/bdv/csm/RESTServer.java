package ccb.bdv.csm;

import org.eclipse.jetty.server.Connector;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.nio.SelectChannelConnector;
import org.eclipse.jetty.servlet.DefaultServlet;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;
import org.glassfish.jersey.servlet.ServletContainer;
import io.swagger.jersey.config.JerseyJaxrsConfig;

import java.net.URL;
import java.util.Properties;

/**
 * Created by Songkie on 2017-05-25.
 */
public class RESTServer {
    private static RESTServer ourInstance = new RESTServer();

    public static RESTServer getInstance() {
        return ourInstance;
    }

    private RESTServer() {
        init();
    }

    private void init() {
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.setContextPath("/");

        String herokoPort = System.getenv("PORT");

        String host = System.getProperty("CUSTOM_HOST", "0.0.0.0");
        String port = System.getProperty("CUSTOM_PORT", (herokoPort != null)? herokoPort:"8080");

        Server jettyServer = new Server();
        Connector connector = new SelectChannelConnector();
        connector.setHost(host);
        connector.setPort(Integer.parseInt(port));
        jettyServer.addConnector(connector);
        
        jettyServer.setHandler(context);

        ServletHolder apiServlet = context.addServlet(ServletContainer.class, "/etax/*");
        apiServlet.setInitOrder(0);

        // Tells the Jersey Servlet which REST service/class to load.
        apiServlet.setInitParameter("jersey.config.server.provider.classnames", CCBSApi.class.getCanonicalName());
        apiServlet.setInitParameter("jersey.config.server.provider.packages", 
                                        "io.swagger.jaxrs.listing,ccb.bdv.csm");

        ServletHolder swaggerServlet = context.addServlet(JerseyJaxrsConfig.class, "/swagger-core");
        swaggerServlet.setInitOrder(2);

        String endpoint = System.getProperty("END_POINT", "http://" + host + ":" + port + "/etax");
        
        swaggerServlet.setInitParameter("swagger.api.basepath", endpoint);
        swaggerServlet.setInitParameter("api.version", "1.0.4");
        swaggerServlet.setInitParameter("swagger.api.title", "eTax Mock");

        String resourceBasePath = this.getClass().getResource("/webapp").toExternalForm();
        context.setWelcomeFiles(new String[] {"index.html"});
        context.setResourceBase(resourceBasePath);

        ServletHolder webServlet = context.addServlet(DefaultServlet.class, "/*");
        webServlet.setInitOrder(3);
        
        try {
            jettyServer.start();
            jettyServer.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            jettyServer.destroy();
        }
    }
}
