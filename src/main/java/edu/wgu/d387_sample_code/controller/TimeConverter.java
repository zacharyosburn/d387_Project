package edu.wgu.d387_sample_code.controller;


import org.springframework.web.bind.annotation.CrossOrigin;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@CrossOrigin
public class TimeConverter {

    public static String convertTime() {
        ZonedDateTime time = ZonedDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm");
        ZonedDateTime et = time.withZoneSameInstant(ZoneId.of("America/New_York"));
        ZonedDateTime mt = time.withZoneSameInstant(ZoneId.of("America/Denver"));
        ZonedDateTime utc = time.withZoneSameInstant(ZoneId.of("UTC"));

        String convertedTimes = et.format(formatter) + " ET | " + mt.format(formatter) + " MT | " + utc.format(formatter) + " UTC";

        return convertedTimes;
    }
}