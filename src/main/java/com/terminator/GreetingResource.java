package com.terminator;

import com.terminator.todo.Todo;
import com.terminator.todo.TodoProxy;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import java.util.List;

@Path("/hello")
@Produces(MediaType.APPLICATION_JSON)
public class GreetingResource {

    @RestClient
    TodoProxy todoProxy;

    @GET
    public String hello() {
        return "Hello from RESTEasy Reactive";
    }

    @GET
    @Path("/todos")
    public Response todos(){
        List<Todo> todos = todoProxy.get();
        return Response.ok(todos).build();
    }
}
