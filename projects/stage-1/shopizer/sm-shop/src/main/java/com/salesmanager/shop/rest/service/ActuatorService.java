package com.salesmanager.shop.rest.service;

import javax.ws.rs.POST;
import javax.ws.rs.Path;

/**
 * TODO
 *
 * @author <a href="mailto:domi.song@yunzhihui.com">domisong</a>
 * @since 2021/7/21
 */
@Path("/actuator")
public interface ActuatorService {


    @POST
    @Path("/shutdown")
    String shutdown();

}
