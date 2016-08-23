package com.workshop.rest;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import com.workshop.utility.Utility;

@Path("")
public class TestService {

    @GET
    @Produces("text/plain")  
    @Path("/testservice")
    public String getMessage() {
        return "Hello there";
    }
    
}
