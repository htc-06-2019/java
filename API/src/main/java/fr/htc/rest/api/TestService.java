package fr.htc.rest.api;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author naveenvemulapalli
 *
 */
@Path("/testservice")
public class TestService {

	@Path("/test")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getTestService() {
		return "Service works fine ;)";
	}

	@Path("/hello")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayHello() {
		return "Hello World! ";
	}

}