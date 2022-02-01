package de.adac.dataspaceconnector.extensions.helloworld;

import org.eclipse.dataspaceconnector.spi.WebService;
import org.eclipse.dataspaceconnector.spi.system.ServiceExtension;
import org.eclipse.dataspaceconnector.spi.system.ServiceExtensionContext;

public class HelloWorldEndpointExtension implements ServiceExtension {

    @Override
    public void initialize(ServiceExtensionContext context) {
        var webService = context.getService(WebService.class);
        webService.registerController(new ApiController());
    }
}
