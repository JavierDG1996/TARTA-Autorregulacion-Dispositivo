package io.swagger.api.factories;

import io.swagger.api.TurnOffDeviceApiService;
import io.swagger.api.impl.TurnOffDeviceApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-12-13T05:02:49.611Z[GMT]")public class TurnOffDeviceApiServiceFactory {
    private final static TurnOffDeviceApiService service = new TurnOffDeviceApiServiceImpl();

    public static TurnOffDeviceApiService getTurnOffDeviceApi() {
        return service;
    }
}
