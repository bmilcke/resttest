package me.landmesser.rest.backing;

import me.landmesser.rest.date.DateStuffClient;
import me.landmesser.rest.date.MyDate;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;
import java.time.LocalDate;

@Named
@RequestScoped
public class RestAccess {

    private LocalDate enteredDate = LocalDate.now();
    private long diff;

    private DateStuffClient restClient = new DateStuffClient();

    public MyDate getToday() {
        return restClient.now2();
    }

    public LocalDate getEnteredDate() {
        return enteredDate;
    }

    public void setEnteredDate(LocalDate enteredDate) {
        this.enteredDate = enteredDate;
    }

    public void calcDiff() {
        diff = restClient.daysUntilToday(enteredDate);
    }

    public long getDiff() {
        return diff;
    }
}
