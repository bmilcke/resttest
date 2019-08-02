package me.landmesser.rest.backing;

import me.landmesser.rest.date.DateStuffClient;
import me.landmesser.rest.date.MyDate;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.time.LocalDate;

@Named
@RequestScoped
public class RestAccess {

    private DateStuffClient restClient = new DateStuffClient();

    public MyDate getToday() {
        return restClient.now2();
    }
}
