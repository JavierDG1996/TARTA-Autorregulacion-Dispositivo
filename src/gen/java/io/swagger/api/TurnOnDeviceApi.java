package io.swagger.api;


import io.swagger.api.TurnOnDeviceApiService;
import io.swagger.api.factories.TurnOnDeviceApiServiceFactory;

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


@Path("/turnOnDevice")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-12-13T05:02:49.611Z[GMT]")public class TurnOnDeviceApi  {
   private final TurnOnDeviceApiService delegate;

   public TurnOnDeviceApi(@Context ServletConfig servletContext) {
      TurnOnDeviceApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("TurnOnDeviceApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (TurnOnDeviceApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = TurnOnDeviceApiServiceFactory.getTurnOnDeviceApi();
      }

      this.delegate = delegate;
   }

    @PUT
    @Path("/{estanciaid}")
    @Consumes({ "text/plain" })
    
    @Operation(summary = "Encender un dispositivo térmico de una sala", description = "Envía una señal para encender el dispositivo de una sala debido a que hay al menos una persona en esa sala", tags={ "DispositivoRegulacion" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "Señal enviada"),
        
        @ApiResponse(responseCode = "400", description = "Error al mandar la señal"),
        
        @ApiResponse(responseCode = "409", description = "El dispositivo ya tiene este valor") })
    public Response turnOnDeviceEstanciaidPut(@Parameter(in = ParameterIn.PATH, description = "identificador de la estancia",required=true) @PathParam("estanciaid") String estanciaid
,@Parameter(in = ParameterIn.DEFAULT, description = "" ) Boolean body

,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.turnOnDeviceEstanciaidPut(estanciaid,body,securityContext);
    }
}
