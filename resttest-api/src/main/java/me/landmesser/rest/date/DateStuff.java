package me.landmesser.rest.date;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.time.LocalDate;

@Path("/date")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface DateStuff {

    @GET
    @Path("/today")
    LocalDate now();

    @GET
    @Path("/mytoday")
    MyDate now2();
}
