package io.swagger.api.factories;

import io.swagger.api.TurnOnDeviceApiService;
import io.swagger.api.impl.TurnOnDeviceApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-12-13T05:02:49.611Z[GMT]")public class TurnOnDeviceApiServiceFactory {
    private final static TurnOnDeviceApiService service = new TurnOnDeviceApiServiceImpl();

    public static TurnOnDeviceApiService getTurnOnDeviceApi() {
        return service;
    }
}
