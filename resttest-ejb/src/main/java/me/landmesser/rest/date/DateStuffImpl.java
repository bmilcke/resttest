package me.landmesser.rest.date;

import javax.enterprise.context.RequestScoped;
import java.time.LocalDate;
import java.time.LocalTime;

@RequestScoped
public class DateStuffImpl implements DateStuff {

    @Override
    public LocalDate now() {
        return LocalDate.now();
    }

    @Override
    public MyDate now2() {
        MyDate result = new MyDate();
        result.setDate(LocalDate.now());
        result.setTime(LocalTime.now());
        return result;
    }
}
