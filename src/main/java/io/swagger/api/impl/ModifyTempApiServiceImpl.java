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
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-12-13T05:02:49.611Z[GMT]")public class ModifyTempApiServiceImpl extends ModifyTempApiService {
    @Override
    public Response modifyTempEstanciaidNewTempPut(String estanciaid, Float newTemp, Float body, SecurityContext securityContext) throws NotFoundException {
        Estancia e = server.getInstance().devolverEstancia(estanciaid);
        String response="";
        e.setNewTemp(newTemp);
        if(e.getTemp()!=e.getNewTemp()){
            e.setTemp(e.getNewTemp());
            server.getInstance().uploadEstancia(e);
            response = "Se ha modificado la temperatura de la sala y debe ser "+Float.toString(e.getTemp());
        }else
            response = "no se ha cambiado la temperatura porque es la misma";
        return Response.ok().entity(new ApiResponseMessage(ApiResponseMessage.OK, response)).build();
    }
}
