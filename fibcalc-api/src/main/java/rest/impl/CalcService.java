package rest.impl;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


@Path("/fibcalc")
public interface CalcService {
	
	@GET
	@Path("/fib/{num}")
	@Produces(MediaType.APPLICATION_JSON)
	CalcResult fibonacci(@PathParam("num") int n);

}

