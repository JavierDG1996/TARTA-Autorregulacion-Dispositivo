package io.swagger.api;


import io.swagger.api.UsernumberApiService;
import io.swagger.api.factories.UsernumberApiServiceFactory;

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


@Path("/usernumber")


@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-12-13T05:02:49.611Z[GMT]")public class UsernumberApi  {
   private final UsernumberApiService delegate;

   public UsernumberApi(@Context ServletConfig servletContext) {
      UsernumberApiService delegate = null;

      if (servletContext != null) {
         String implClass = servletContext.getInitParameter("UsernumberApi.implementation");
         if (implClass != null && !"".equals(implClass.trim())) {
            try {
               delegate = (UsernumberApiService) Class.forName(implClass).newInstance();
            } catch (Exception e) {
               throw new RuntimeException(e);
            }
         } 
      }

      if (delegate == null) {
         delegate = UsernumberApiServiceFactory.getUsernumberApi();
      }

      this.delegate = delegate;
   }

    @GET
    @Path("/{estanciaid}")
    
    @Produces({ "application/json" })
    @Operation(summary = "Devuelve el número de personas en una sala", description = "Devuelve el número actual de personas que se encuentran en una sala conociendo de antemano el número de pulseras que se han conectado al controlador", tags={ "DispositivoRegulacion" })
    @ApiResponses(value = { 
        @ApiResponse(responseCode = "200", description = "Devuelve el número de personas", content = @Content(schema = @Schema(implementation = Integer.class))),
        
        @ApiResponse(responseCode = "400", description = "Error al obtener el número de personas") })
    public Response usernumberEstanciaidGet(@Parameter(in = ParameterIn.PATH, description = "identificador de la estancia",required=true) @PathParam("estanciaid") String estanciaid
,@Context SecurityContext securityContext)
    throws NotFoundException {
        return delegate.usernumberEstanciaidGet(estanciaid,securityContext);
    }
}
