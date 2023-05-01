package com.terminator;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.metrics.MetricUnits;
import org.eclipse.microprofile.metrics.annotation.Gauge;

@Path("/")
@Produces({MediaType.APPLICATION_JSON})
public class AppResource {

    @GET
    public Response app(){
        return Response.ok("The app is up and running").build();
    }
}
