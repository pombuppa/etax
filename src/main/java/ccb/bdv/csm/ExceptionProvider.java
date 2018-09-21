package ccb.bdv.csm;

import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;


@Provider
@Produces(MediaType.APPLICATION_JSON)
public class ExceptionProvider implements ExceptionMapper<Exception> {
    
    @Override
    public Response toResponse(Exception t) {
        Response.ResponseBuilder rb = Response.status(Response.Status.BAD_REQUEST);
        
        rb.entity(t);
        return rb.build();
    }
}
