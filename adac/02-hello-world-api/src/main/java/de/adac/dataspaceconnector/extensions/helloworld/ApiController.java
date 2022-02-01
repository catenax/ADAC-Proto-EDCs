package de.adac.dataspaceconnector.extensions.helloworld;

        import jakarta.ws.rs.Consumes;
        import jakarta.ws.rs.GET;
        import jakarta.ws.rs.Path;
        import jakarta.ws.rs.Produces;
        import jakarta.ws.rs.core.MediaType;
        import org.eclipse.dataspaceconnector.spi.monitor.Monitor;

@Consumes({MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_JSON})
@Path("/")
public class HelloWorldApiController {

    private final Monitor monitor;

    public Bla(Monitor monitor) {
        this.monitor = monitor;
    }

    @GET
    @Path("health")
    public String checkHealth() {
        monitor.info("Received a health request");
        return "{\"response\":\"I'm alive!\"}";
    }
}
