package com.terminator.todo;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import java.util.List;

@RegisterRestClient(baseUri = "https://jsonplaceholder.typicode.com/")
@Path("/")
@Produces(MediaType.APPLICATION_JSON)
public interface TodoProxy {

    @GET
    @Path("/todos")
    List<Todo> get();
}
