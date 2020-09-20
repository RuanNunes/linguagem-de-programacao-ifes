package com.medico.api;
import java.util.List;
import java.util.UUID;

import javax.transaction.Transactional;
import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.medico.model.Doctor;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.media.Schema;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.tags.Tag;

@Path("/api/doctors/v1/")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Tag(name = "Doctor", description = "Operations on resource Doctor.")
public class DoctorResource {

    @GET
    @Operation(summary = "Get all Doctor")
    public List<Doctor> get() {
        return Doctor.listAll();
    }

    @GET
    @Path("{id}")
    @APIResponse(responseCode = "200")
    @APIResponse(responseCode = "404", description = "Doctor not found")
    @Operation(summary = "Find Doctor by ID")
    public Doctor getSindle(@PathParam("id") UUID id) {
        Doctor entity = Doctor.findById(id);

        if (entity == null) {
            throw new WebApplicationException("Doctor not found", Status.NOT_FOUND);
        }

        return entity;
    }

    @POST
    @Transactional
    @APIResponse(responseCode = "201",
            description = "resource created",
            content = @Content(schema = @Schema(implementation = Doctor.class)))
    @APIResponse(responseCode = "406", description = "Invalid data")
    @APIResponse(responseCode = "409", description = "Doctor already exists")
    @Operation(summary = "Create new Doctor")
    public Response create(@Valid Doctor entity) {
        if (entity.id != null) {
            throw new WebApplicationException("Id was invalidly set on request",
                    Status.NOT_ACCEPTABLE);
        }

        if (Doctor.exists(entity)) {
            return Response.status(Status.CONFLICT).build();
        }

        entity.persist();

        return Response.ok(entity).status(Status.CREATED).build();
    }

    @PUT
    @Path("{id}")
    @Transactional
    @APIResponse(responseCode = "200",
            description = "Doctor created",
            content = @Content(schema = @Schema(implementation = Doctor.class)))
    @APIResponse(responseCode = "404", description = "Doctor not found")
    @APIResponse(responseCode = "409", description = "Doctor already exists")
    @Operation(summary = "Edit Doctor by ID")
    public Response update(@PathParam("id") UUID id, @Valid Doctor newEntity) {
        Doctor entity = Doctor.findById(id);

        if (entity == null) 
            throw new WebApplicationException("Doctor not found", Status.NOT_FOUND);
        
        if (Doctor.exists(entity, id)) 
            return Response.status(Status.CONFLICT).build();
        
        entity.updateDoctorData(newEntity);
        entity.persist();
        return Response.ok(entity).status(Status.OK).build();
    }

    @DELETE
    @Transactional
    @Path("{id}")
    @APIResponse(responseCode = "204", description = "Doctor deleted")
    @APIResponse(responseCode = "404", description = "Doctor not found")
    @Operation(summary = "Delete Doctor by ID")
    public Response delete(@PathParam("id") UUID id) {
        Doctor entity = Doctor.findById(id);

        if (entity == null) {
            throw new WebApplicationException("Doctor not found", Status.NOT_FOUND);
        }

        entity.delete();

        return Response.status(Status.NO_CONTENT).build();
    }
}
