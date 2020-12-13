package io.swagger.api;


import io.swagger.api.GetTempApiService;
import io.swagger.api.factories.GetTempApiServiceFactory;

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


@Path("/getTemp")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-12-13T05:02:49.611Z[GMT]")public class GetTempApi  {
   private final GetTempApiService delegate;

   public GetTempApi(@Context ServletConfig servletContext) {
      GetTempApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("GetTempApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (GetTempApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = GetTempApiServiceFactory.getGetTempApi();
      }

      this.delegate = delegate;
   }

    @GET
    @Path("/{estanciaid}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Devuelve la temperatura actual de una sala", description = "Devuelve la temperatura actual de una sala para conocer si es la temperatura adecuada para los usuarios de la misma sala.", tags={ "DispositivoRegulacion" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Devuelve la temperatura de la sala", content = @Content(schema = @Schema(implementation = Float.class))),
        
        @ApiResponse(responseCode = "400", description = "Error al obtener la tmperatura de la sala") })
    public Response getTempEstanciaidGet(@Parameter(in = ParameterIn.PATH, description = "identificador de la estancia",required=true) @PathParam("estanciaid") String estanciaid
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.getTempEstanciaidGet(estanciaid,securityContext);
    }
}
