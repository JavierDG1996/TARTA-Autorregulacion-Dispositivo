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
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-12-13T05:02:49.611Z[GMT]")public class DeviceStatusApiServiceImpl extends DeviceStatusApiService {
    @Override
    public Response deviceStatusEstanciaidGet(String estanciaid, SecurityContext securityContext) throws NotFoundException {
        Estancia e = server.getInstance().devolverEstancia(estanciaid);
        String response = "El estado del dispositivo de la sala es de: "+Boolean.toString(e.getStatus());
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, response)).build();
    }
}
