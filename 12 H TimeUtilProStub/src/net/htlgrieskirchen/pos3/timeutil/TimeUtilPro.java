package net.htlgrieskirchen.pos3.timeutil;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;

public class TimeUtilPro {

    private TimeUtilPro() {
    }

    // ########## LOCALDATE METHODS ##########
    public static LocalDate intToLocalDate(int date) {
        String temp = String.valueOf(date);
        int year = Integer.valueOf(temp.substring(0, 4));
        int month = Integer.valueOf(temp.substring(4, 6));
        int day = Integer.valueOf(temp.substring(6, 8));
        return LocalDate.of(year, month, day);
    }

    public static LocalDate longToLocalDate(long dateTime) {
        String temp = String.valueOf(dateTime);
        int year = Integer.valueOf(temp.substring(0, 4));
        int month = Integer.valueOf(temp.substring(4, 6));
        int day = Integer.valueOf(temp.substring(6, 8));
        return LocalDate.of(year, month, day);
    }

    public static LocalDate dateToLocalDate(Date dateTime) {
        int year = dateTime.getYear() + 1900;
        int month = dateTime.getMonth() + 1;
        int day = dateTime.getDate();
        return LocalDate.of(year, month, day);
    }

    public static LocalDate calendarToLocalDate(Calendar dateTime) {
        Date temp = dateTime.getTime();
        int year = temp.getYear() + 1900;
        int month = temp.getMonth() + 1;
        int day = temp.getDate();
        return LocalDate.of(year, month, day);
    }

    // ########## LOCALDATETIME METHODS ##########
    public static LocalDateTime intToLocalDateTime(int date) {
        String temp = String.valueOf(date);
        int year = Integer.valueOf(temp.substring(0, 4));
        int month = Integer.valueOf(temp.substring(4, 6));
        int day = Integer.valueOf(temp.substring(6, 8));
        LocalDate datePart = LocalDate.of(year, month, day);
        return LocalDateTime.of(datePart, LocalTime.MIN);
    }

    public static LocalDateTime longToLocalDateTime(long dateTime) {
        String temp = String.valueOf(dateTime);
        int year = Integer.valueOf(temp.substring(0, 4));
        int month = Integer.valueOf(temp.substring(4, 6));
        int day = Integer.valueOf(temp.substring(6, 8));
        int hour = Integer.valueOf(temp.substring(8, 10));
        int minute = Integer.valueOf(temp.substring(10, 12));
        return LocalDateTime.of(LocalDate.of(year, month, day), LocalTime.of(hour, minute));
    }

    public static LocalDateTime dateToLocalDateTime(Date dateTime) {
        int year = dateTime.getYear() + 1900;
        int month = dateTime.getMonth() + 1;
        int day = dateTime.getDate();
        int hour = dateTime.getHours();
        int minute = dateTime.getMinutes();
        return LocalDateTime.of(year, month, day, hour, minute);
    }

    public static LocalDateTime calendarToLocalDateTime(Calendar dateTime) {
        Date temp = dateTime.getTime();
        int year = temp.getYear() + 1900;
        int month = temp.getMonth() + 1;
        int day = temp.getDate();
        int hour = temp.getHours();
        int minute = temp.getMinutes();
        return LocalDateTime.of(year, month, day, hour, minute);
    }

    // ########## INT METHODS ##########
    public static int localDateToInt(LocalDate date) {
        String year = String.valueOf(date.getYear());
        String month = String.valueOf(date.getMonthValue());
        String day = String.valueOf(date.getDayOfMonth());

        // wenn Monatsnummer einstellig ist 0 davor haengen
        if (Integer.parseInt(month) < 10) {
            month = "0" + month;
        }

        // wenn Tag einstellig ist 0 davor haengen
        if (Integer.parseInt(day) < 10) {
            day = "0" + day;
        }

        StringBuilder builder = new StringBuilder(year);
        builder.append(month);
        builder.append(day);
        return Integer.valueOf(builder.toString());
    }

    public static int localDateTimeToInt(LocalDateTime dateTime) {
        String year = String.valueOf(dateTime.getYear());
        String month = String.valueOf(dateTime.getMonthValue());
        String day = String.valueOf(dateTime.getDayOfMonth());

        // wenn Monatsnummer einstellig ist 0 davor haengen
        if (Integer.parseInt(month) < 10) {
            month = "0" + month;
        }

        // wenn Tag einstellig ist 0 davor haengen
        if (Integer.parseInt(day) < 10) {
            day = "0" + day;
        }

        StringBuilder builder = new StringBuilder(year);
        builder.append(month);
        builder.append(day);
        return Integer.valueOf(builder.toString());
    }

    // ########## LONG METHODS ##########
    public static long localDateToLong(LocalDate date) {
        String year = String.valueOf(date.getYear());
        String month = String.valueOf(date.getMonthValue());
        String day = String.valueOf(date.getDayOfMonth());

        // wenn Monatsnummer einstellig ist 0 davor haengen
        if (Integer.parseInt(month) < 10) {
            month = "0" + month;
        }

        // wenn Tag einstellig ist 0 davor haengen
        if (Integer.parseInt(day) < 10) {
            day = "0" + day;
        }

        StringBuilder builder = new StringBuilder(year);
        builder.append(month);
        builder.append(day);
        return Long.valueOf(builder.toString());
    }

    public static long localDateTimeToLong(LocalDateTime dateTime) {
        String year = String.valueOf(dateTime.getYear());
        String month = String.valueOf(dateTime.getMonthValue());
        String day = String.valueOf(dateTime.getDayOfMonth());
        String hour = String.valueOf(dateTime.getHour());
        String minute = String.valueOf(dateTime.getMinute());

        // wenn Monatsnummer einstellig ist 0 davor haengen
        if (Integer.parseInt(month) < 10) {
            month = "0" + month;
        }

        // wenn Tag einstellig ist 0 davor haengen
        if (Integer.parseInt(day) < 10) {
            day = "0" + day;
        }

        // wenn Stunde einstellig ist 0 davor haengen
        if (Integer.parseInt(hour) < 10) {
            hour = "0" + hour;
        }

        // wenn Minute einstellig ist 0 davor haengen
        if (Integer.parseInt(minute) < 10) {
            minute = "0" + minute;
        }

        StringBuilder builder = new StringBuilder(year);
        builder.append(month);
        builder.append(day);
        builder.append(hour);
        builder.append(minute);
        return Long.valueOf(builder.toString());
    }

    // ########## DATE METHODS ##########
    @SuppressWarnings("deprecation")
    public static Date localDateToDate(LocalDate date) {
        return java.sql.Date.valueOf(date);
    }

    @SuppressWarnings("deprecation")
    public static Date localDateTimeToDate(LocalDateTime dateTime) {
        return Date.from(dateTime.atZone(ZoneId.systemDefault()).toInstant());
    }

    // ########## CALENDAR METHODS ##########
    public static Calendar localDateToCalendar(LocalDate date) {
        Calendar temp =  Calendar.getInstance();  
        temp.set(date.getYear(), date.getDayOfMonth(), date.getDayOfMonth());
        return temp;
    }

    public static Calendar localDateTimeToCalendar(LocalDateTime dateTime) {
        Calendar temp =  Calendar.getInstance();  
        temp.set(dateTime.getYear(), dateTime.getDayOfMonth(), dateTime.getDayOfMonth());
        return temp;
    }
}
