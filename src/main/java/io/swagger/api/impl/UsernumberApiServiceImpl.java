package io.swagger.api.impl;

import io.swagger.api.*;



import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-12-13T05:02:49.611Z[GMT]")public class UsernumberApiServiceImpl extends UsernumberApiService {
    @Override
    public Response usernumberEstanciaidGet(String estanciaid, SecurityContext securityContext) throws NotFoundException {
        Estancia e = server.getInstance().devolverEstancia(estanciaid);
        String response = "El número de usuarios de la sala es de: "+Integer.toString(e.getUsers().size());
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, response)).build();
    }
}
