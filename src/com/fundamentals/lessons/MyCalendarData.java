package com.fundamentals.lessons;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.Temporal;

public class MyCalendarData {

    public void localDateTimeExamples() {
        LocalDateTime timeNow = LocalDateTime.now();
        System.out.println(timeNow);
        System.out.println(timeNow.getMonth());
        System.out.println(timeNow.getYear());
        System.out.println(timeNow.minusMonths(2));
        System.out.println(timeNow.plusDays(23));
    }

    public void epochExample() {
        LocalDateTime epochNow = LocalDateTime.ofEpochSecond(1665779727L, 0, ZoneOffset.MIN);
        System.out.println(epochNow);
        System.out.println(epochNow.withDayOfMonth(11));

        LocalDateTime born = LocalDateTime.parse("1996-01-25T12:00:00");
        System.out.println(born);
    }

    public void localDateExample() {
        LocalDate dateNow = LocalDate.now(ZoneId.systemDefault());
        System.out.println(dateNow.atTime(9, 25));
        System.out.println(dateNow.getChronology().eras());

        LocalDate epochDate = LocalDate.ofEpochDay(706392000L);
        System.out.println(epochDate.getYear());
        System.out.println(epochDate.isLeapYear());
        System.out.println(epochDate.lengthOfYear());
    }

    public void localTimeExample() {
        LocalTime timeNow = LocalTime.now(Clock.systemUTC());
        System.out.println(timeNow);
        System.out.println(timeNow.atOffset(ZoneOffset.ofHours(10)));
        int hour = timeNow.getHour();
        System.out.println(hour);
        System.out.println(timeNow.withMinute(45));
    }

    public void formatDateTimeExample() {
        LocalDateTime born = LocalDateTime.parse("1996-01-25T12:00:00");
        String sampleDate = born.format(DateTimeFormatter.ofPattern("MMM dd YYYY G - h:m a"));
        System.out.println(sampleDate);

        LocalDateTime timeNow = LocalDateTime.ofEpochSecond(1665781573L, 0, ZoneOffset.of("-0500"));
        ZonedDateTime zone = timeNow.atZone(ZoneId.of("-0500"));
        System.out.println(zone.format(DateTimeFormatter.ofPattern("VV z")));
    }

    public void timePeriodExample() {
        Period period = Period.of(4, 8, 21);
        Temporal temp = period.addTo(LocalDate.now());
        System.out.println(temp);
    }

}
