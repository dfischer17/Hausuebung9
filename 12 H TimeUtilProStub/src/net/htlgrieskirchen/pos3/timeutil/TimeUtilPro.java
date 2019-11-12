package net.htlgrieskirchen.pos3.timeutil;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;


public class TimeUtilPro
{   
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
        LocalDate datePart =  LocalDate.of(year, month, day);
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
        return -1;
    }

    // ########## LONG METHODS ##########
    
    public static long localDateToLong(LocalDate date) {
        return -1L;
    }

    public static long localDateTimeToLong(LocalDateTime dateTime) {
        return -1L;
    }

    // ########## DATE METHODS ##########
    
    @SuppressWarnings("deprecation")
    public static Date localDateToDate(LocalDate date) {
        return null;
    }

    @SuppressWarnings("deprecation")
    public static Date localDateTimeToDate(LocalDateTime dateTime) {
        return null;
    }

    // ########## CALENDAR METHODS ##########
    
    public static Calendar localDateToCalendar(LocalDate date) {
        return null;
    }

    public static Calendar localDateTimeToCalendar(LocalDateTime dateTime) {
        return null;
    }

}
