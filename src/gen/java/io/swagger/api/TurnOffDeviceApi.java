package io.swagger.api;


import io.swagger.api.TurnOffDeviceApiService;
import io.swagger.api.factories.TurnOffDeviceApiServiceFactory;

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


@Path("/turnOffDevice")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-12-13T05:02:49.611Z[GMT]")public class TurnOffDeviceApi  {
   private final TurnOffDeviceApiService delegate;

   public TurnOffDeviceApi(@Context ServletConfig servletContext) {
      TurnOffDeviceApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("TurnOffDeviceApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (TurnOffDeviceApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = TurnOffDeviceApiServiceFactory.getTurnOffDeviceApi();
      }

      this.delegate = delegate;
   }

    @PUT
    @Path("/{estanciaid}")
    @Consumes({ "text/plain" })
    
    @Operation(summary = "Apagar un dispositivo térmico de una sala", description = "Envía una señal para apagar el dispositivo de una sala debido a que no hay ni una persona en esa sala", tags={ "DispositivoRegulacion" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "201", description = "Señal enviada"),
        
        @ApiResponse(responseCode = "400", description = "Error al mandar la señal"),
        
        @ApiResponse(responseCode = "409", description = "El dispositivo ya tiene este valor") })
    public Response turnOffDeviceEstanciaidPut(@Parameter(in = ParameterIn.PATH, description = "identificador de la estancia",required=true) @PathParam("estanciaid") String estanciaid
,@Parameter(in = ParameterIn.DEFAULT, description = "" ) Boolean body

,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.turnOffDeviceEstanciaidPut(estanciaid,body,securityContext);
    }
}
