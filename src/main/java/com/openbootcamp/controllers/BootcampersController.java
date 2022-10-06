package com.openbootcamp.controllers;

import com.openbootcamp.models.Bootcamper;
import com.openbootcamp.services.BootcamperService;
import org.springframework.stereotype.Component;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.net.URI;
import java.util.List;

@Component
@Path("/")
public class BootcampersController {
    private BootcamperService bootcamperService;

    public BootcampersController(BootcamperService bootcamperService) {
        this.bootcamperService = bootcamperService;
        this.bootcamperService.add(new Bootcamper("Alejandro", "Perez"));
        this.bootcamperService.add(new Bootcamper("Carlos", "Aguirre"));
        this.bootcamperService.add(new Bootcamper("Marta", "Vilmar"));
        this.bootcamperService.add(new Bootcamper("Linda", "Nuñez"));
    }

    @GET
    @Path("/bootcampers")
    @Produces("application/json")
    public List<Bootcamper> getAll() {
        return this.bootcamperService.getAll();
    }

    @GET
    @Path("/bootcampers/{name}")
    @Produces("application/json")
    public Bootcamper getByName(@PathParam("name") String name){
        return this.bootcamperService.getByName(name);
    }


    @POST
    @Path("/bootcampers")
    @Produces("application/json")
    @Consumes("application/json")
    public Response add(Bootcamper bootcamper) {
        this.bootcamperService.add(bootcamper);
        return Response.created(URI.create("/bootcampers/" + bootcamper.getNombre())).build();
    }


    @DELETE
    @Path("/bootcampers/{name}")
    @Produces("application/json")
    @Consumes("application/json")
    public Response remove(@PathParam("name") String name) {
        this.bootcamperService.removeByName(name);

        return Response.created(URI.create("/bootcampers/" + name)).build();
    }

    @PUT
    @Path("/bootcampers")
    @Produces("application/json")
    @Consumes("application/json")
    public Response update(Bootcamper bootcamper) {
        this.bootcamperService.updateByName(bootcamper);

        return Response.created(URI.create("/bootcampers/" + bootcamper.getNombre())).build();
    }






}
