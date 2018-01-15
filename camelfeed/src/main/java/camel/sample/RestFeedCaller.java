package camel.sample;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

@Path("/rssfeedservice")
public class RestFeedCaller {

	@GET
	public Response getMsg() {

		String output = "Invoked rest service>>>>>>>";
		CamelRSSFeedConsumer rs = new CamelRSSFeedConsumer();
		rs.rssfeedcall();

		return Response.status(200).entity(output).build();

	}

}