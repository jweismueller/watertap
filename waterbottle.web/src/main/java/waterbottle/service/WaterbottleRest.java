package waterbottle.service;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import watertap.service.WatertapService;

@Path("/")
public class WaterbottleRest {

	@Inject
	WatertapService watertap;

	@GET
	@Path("/")
	@Produces({ "text/plain" })
	public String status() throws Exception {
		return "Hallo Waterbottle!";
	}
	
	@GET
	@Path("/test/{id}")
	@Produces({ "text/plain" })
	public String test(@PathParam("id") String id) throws Exception {
		return watertap.execute(id);
	}
	
	@GET
	@Path("/test/{id}")
	@Produces({ "text/plain" })
	public String testLazy(@PathParam("id") String id) throws Exception {
		return watertap.execute(id);
	}


}
