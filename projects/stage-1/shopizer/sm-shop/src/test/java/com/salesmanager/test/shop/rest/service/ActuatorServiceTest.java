package com.salesmanager.test.shop.rest.service;

import static org.junit.jupiter.api.Assertions.*;
import com.salesmanager.shop.rest.service.ActuatorService;
import org.eclipse.microprofile.rest.client.RestClientBuilder;
import org.junit.Test;

import java.net.URI;
import java.net.URISyntaxException;

/**
 * {@link ActuatorService } Test
 *
 * @author <a href="mailto:domi.song@cloudwise.com">domi</a>
 * @since 2021/7/21.
 */
public class ActuatorServiceTest {


    /**
     * Test {@link ActuatorService#shutdown()}
     *
     */
    @Test
    public void testShutdown() throws URISyntaxException {
        URI uri = new URI("http://127.0.0.1:8080");

        ActuatorService actuatorService = RestClientBuilder.newBuilder()
                .baseUri(uri)
                .build(ActuatorService.class);

        String shutdown = actuatorService.shutdown();
        System.out.println("SHUTDOWN : " + shutdown);
    }

}