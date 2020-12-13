package io.swagger.api.factories;

import io.swagger.api.ModifyTempApiService;
import io.swagger.api.impl.ModifyTempApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-12-13T05:02:49.611Z[GMT]")public class ModifyTempApiServiceFactory {
    private final static ModifyTempApiService service = new ModifyTempApiServiceImpl();

    public static ModifyTempApiService getModifyTempApi() {
        return service;
    }
}
