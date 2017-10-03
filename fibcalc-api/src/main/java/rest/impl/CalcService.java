package rest.impl;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;


@Path("/fibcalc")
public interface CalcService {
	
	@GET
	@Path("/fib")
	@Produces(MediaType.APPLICATION_JSON)
	Result fibonacci(@QueryParam("num") int n);
	
}

