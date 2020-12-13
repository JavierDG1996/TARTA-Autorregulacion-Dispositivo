package io.swagger.api;


import io.swagger.api.ModifyTempApiService;
import io.swagger.api.factories.ModifyTempApiServiceFactory;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;


import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;

import javax.servlet.ServletConfig;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.ws.rs.*;
import javax.validation.constraints.*;


@Path("/modifyTemp")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-12-13T05:02:49.611Z[GMT]")public class ModifyTempApi  {
   private final ModifyTempApiService delegate;

   public ModifyTempApi(@Context ServletConfig servletContext) {
      ModifyTempApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("ModifyTempApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (ModifyTempApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = ModifyTempApiServiceFactory.getModifyTempApi();
      }

      this.delegate = delegate;
   }

    @PUT
    @Path("/{estanciaid}/{newTemp}")
    @Consumes({ "text/plain" })
    
    @Operation(summary = "Modificar la temperatura de la sala", description = "Modificar la temperatura de una sala con la nueva temperatura dada por el servidor, para ello se envía una señal para cambiar la temperatura", tags={ "DispositivoRegulacion" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "Temperatura cambiada"),
        
        @ApiResponse(responseCode = "400", description = "Valor incorrecto"),
        
        @ApiResponse(responseCode = "409", description = "El dispositivo ya tiene este valor") })
    public Response modifyTempEstanciaidNewTempPut(@Parameter(in = ParameterIn.PATH, description = "identificador de la estancia",required=true) @PathParam("estanciaid") String estanciaid
,@Parameter(in = ParameterIn.PATH, description = "nueva temperatura a cambiar",required=true) @PathParam("newTemp") Float newTemp
,@Parameter(in = ParameterIn.DEFAULT, description = "" ) Float body

,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.modifyTempEstanciaidNewTempPut(estanciaid,newTemp,body,securityContext);
    }
}
