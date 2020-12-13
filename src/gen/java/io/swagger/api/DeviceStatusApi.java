package io.swagger.api;


import io.swagger.api.DeviceStatusApiService;
import io.swagger.api.factories.DeviceStatusApiServiceFactory;

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


@Path("/deviceStatus")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-12-13T05:02:49.611Z[GMT]")public class DeviceStatusApi  {
   private final DeviceStatusApiService delegate;

   public DeviceStatusApi(@Context ServletConfig servletContext) {
      DeviceStatusApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("DeviceStatusApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (DeviceStatusApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = DeviceStatusApiServiceFactory.getDeviceStatusApi();
      }

      this.delegate = delegate;
   }

    @GET
    @Path("/{estanciaid}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Devuelve el estado del dispositivo", description = "Devuelve el estado actual del dispositivo térmico para saber si hay que encenderlo o apagarlo según sea la circunstancia", tags={ "DispositivoRegulacion" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Devuelve el estado del dispositivo", content = @Content(schema = @Schema(implementation = Boolean.class))),
        
        @ApiResponse(responseCode = "400", description = "Error de conexión con el dispositivo térmico") })
    public Response deviceStatusEstanciaidGet(@Parameter(in = ParameterIn.PATH, description = "identificador de la estancia",required=true) @PathParam("estanciaid") String estanciaid
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.deviceStatusEstanciaidGet(estanciaid,securityContext);
    }
}
