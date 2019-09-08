import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("whatisthis")
public class WhatIsThisService {

    @Path("json")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public WhatIsThis getWhatIsThis(){
        return new WhatIsThis();
    }
}