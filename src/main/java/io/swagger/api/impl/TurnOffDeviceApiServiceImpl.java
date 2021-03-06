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
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-12-13T05:02:49.611Z[GMT]")public class TurnOffDeviceApiServiceImpl extends TurnOffDeviceApiService {
    @Override
    public Response turnOffDeviceEstanciaidPut(String estanciaid, Boolean body, SecurityContext securityContext) throws NotFoundException {
        Estancia e = server.getInstance().devolverEstancia(estanciaid);
        if(e.getStatus()==true){
            e.setStatus(false);
            server.getInstance().uploadEstancia(e);
        }
        String response = "Se ha apagado el dispositivo térmico y debe ser "+Boolean.toString(e.getStatus());
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, response)).build();
    }
}
