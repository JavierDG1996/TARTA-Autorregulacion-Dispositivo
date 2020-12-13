package io.swagger.api.factories;

import io.swagger.api.GetTempApiService;
import io.swagger.api.impl.GetTempApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-12-13T05:02:49.611Z[GMT]")public class GetTempApiServiceFactory {
    private final static GetTempApiService service = new GetTempApiServiceImpl();

    public static GetTempApiService getGetTempApi() {
        return service;
    }
}
