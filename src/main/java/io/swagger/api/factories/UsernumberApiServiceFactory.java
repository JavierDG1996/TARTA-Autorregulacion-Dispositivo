package io.swagger.api.factories;

import io.swagger.api.UsernumberApiService;
import io.swagger.api.impl.UsernumberApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-12-13T05:02:49.611Z[GMT]")public class UsernumberApiServiceFactory {
    private final static UsernumberApiService service = new UsernumberApiServiceImpl();

    public static UsernumberApiService getUsernumberApi() {
        return service;
    }
}
