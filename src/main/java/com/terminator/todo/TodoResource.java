package com.terminator.todo;


import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.metrics.MetricUnits;
import org.eclipse.microprofile.metrics.annotation.Counted;
import org.eclipse.microprofile.metrics.annotation.Gauge;
import org.eclipse.microprofile.metrics.annotation.Timed;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.util.List;

@Path("/todos")
@Produces(MediaType.APPLICATION_JSON)
public class TodoResource {

    @RestClient
    TodoProxy todoProxy;

    @GET
    @Counted(name = "count fetchTodos",
            description = "How many times this endpoint has been invoked") // how many times ?
    @Timed(name = "metrics fetchTodos",
            description = "How long it takes to call this endpoint", unit = MetricUnits.SECONDS) // how long ?
    public Response fetchTodos(){
        List<Todo> todos = todoProxy.get();
        return Response.ok(todos).build();
    }
}
