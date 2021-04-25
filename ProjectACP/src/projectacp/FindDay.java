/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectacp;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 *
 * @author Lenovo
 */
public class FindDay {

    protected int month, day, year;

    public FindDay(String date) {
        String[] splitDate = date.split("/");
        this.month = Integer.parseInt(splitDate[1]);
        this.day = Integer.parseInt(splitDate[0]);
        this.year = Integer.parseInt(splitDate[2]);
    }

    public String findDayOfWeek() {
        LocalDate localDate = LocalDate.of(year, month, day);
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();
        return dayOfWeek.toString();
    }

    @Override
    public String toString() {
        String day = findDayOfWeek();
        return day;
    }

}
