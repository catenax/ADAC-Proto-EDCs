package de.adac.dataspaceconnector.extensions.helloworld;

import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Consumes({MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_JSON})
@Path("/")
public class ApiController {


    public ApiController() {
        System.out.println("Bla");
    }

    @GET
    @Path("hello")
    public String helloWorld() {
        return "{\"response\":\"Hello World! This is the ADAC speaking!\"}";
    }
}
