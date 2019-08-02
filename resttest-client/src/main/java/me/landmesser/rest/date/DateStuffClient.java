package me.landmesser.rest.date;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Response;
import java.time.LocalDate;

public class DateStuffClient implements DateStuff {

    @Override
    public LocalDate now() {
        Response response = getWebTargetFor("today").request().get();
        return response.readEntity(LocalDate.class);
    }

    @Override
    public MyDate now2() {
        Response response = getWebTargetFor("mytoday").request().get();
        return response.readEntity(MyDate.class);
    }

    @Override
    public long daysUntilToday(LocalDate date) {
        Response response = getWebTargetFor("diff").request().post(Entity.json(date));
        return response.readEntity(Long.class);
    }

    private WebTarget getWebTargetFor(String method) {
        Client client = ClientBuilder.newClient();
        return client.target("http://localhost:8080/frontend/rest/date/" + method);
    }
}
