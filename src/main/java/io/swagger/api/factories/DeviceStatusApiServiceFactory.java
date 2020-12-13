package io.swagger.api.factories;

import io.swagger.api.DeviceStatusApiService;
import io.swagger.api.impl.DeviceStatusApiServiceImpl;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaJerseyServerCodegen", date = "2020-12-13T05:02:49.611Z[GMT]")public class DeviceStatusApiServiceFactory {
    private final static DeviceStatusApiService service = new DeviceStatusApiServiceImpl();

    public static DeviceStatusApiService getDeviceStatusApi() {
        return service;
    }
}
