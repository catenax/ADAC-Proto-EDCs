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
    @Path("breakdowns")
    public String helloWorld() {
        return "{\n" +
                "    \"breakdowns\":[\n" +
                "        {\n" +
                "            \"uniqueId\": \"D8E49DB6-27AE-4FC4-A5F1-1CD8F828AA1D\",\n" +
                "            \"make\":\"Renault\",\n" +
                "            \"model\":\"Renault Megane (bis MJ 2015)\",\n" +
                "            \"hsn\":null,\n" +
                "            \"tsn\":\"AOD\",\n" +
                "            \"milage\":\"200000\",\n" +
                "            \"component_fault\":300,\n" +
                "            \"breakdown_note\":\"Batterie prüfen vermutung auf zellnschluss im bauteil stromaufnahme beginnend auf 6ahsteigend auf 12 ahund fällt nicht ab\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"uniqueId\": \"6DF61745-3E0D-4204-9698-1BEB6AD18F6F\",\n" +
                "            \"make\":\"BMW\",\n" +
                "            \"model\":\"BMW MINI (ab MJ 2007)\",\n" +
                "            \"hsn\":null,\n" +
                "            \"tsn\":\"AKF\",\n" +
                "            \"milage\":\"126607\",\n" +
                "            \"component_fault\":201,\n" +
                "            \"breakdown_note\":\"Spannungsregler verschlissen, Ladespannung ca.11,5V\"\n" +
                "        }\n" +
                "    ]\n" +
                "}";
    }
}
