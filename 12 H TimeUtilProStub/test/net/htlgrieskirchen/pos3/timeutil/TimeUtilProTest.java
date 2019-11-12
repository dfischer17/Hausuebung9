/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.htlgrieskirchen.pos3.timeutil;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author dfischer17
 */
public class TimeUtilProTest {

    public TimeUtilProTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of intToLocalDate method, of class TimeUtilPro.
     */
    @Test
    public void testIntToLocalDate() {
        System.out.println("intToLocalDate");
        int date = 20030201;
        LocalDate expResult = LocalDate.of(2003, 2, 1);
        LocalDate result = TimeUtilPro.intToLocalDate(date);
        assertEquals(expResult, result);
    }

    /**
     * Test of longToLocalDate method, of class TimeUtilPro.
     */
    @Test
    public void testLongToLocalDate() {
        System.out.println("longToLocalDate");
        long date = 200302011234L;
        LocalDate expResult = LocalDate.of(2003, 2, 1);
        LocalDate result = TimeUtilPro.longToLocalDate(date);
        assertEquals(expResult, result);
    }

    /**
     * Test of dateToLocalDate method, of class TimeUtilPro.
     */
    @Test
    public void testDateToLocalDate() {
        System.out.println("dateToLocalDate");
        Date date = new Date(1044054000000l);
        LocalDate expResult = LocalDate.of(2003, 2, 1);
        LocalDate result = TimeUtilPro.dateToLocalDate(date);
        assertEquals(expResult, result);
    }

    /**
     * Test of calendarToLocalDate method, of class TimeUtilPro.
     */
    @Test
    public void testCalendarToLocalDate() {
        System.out.println("calendarToLocalDate");
        Calendar date = Calendar.getInstance();
        date.set(2003, 1, 1);
        LocalDate expResult = LocalDate.of(2003, 2, 1);
        LocalDate result = TimeUtilPro.calendarToLocalDate(date);
        assertEquals(expResult, result);
    }

    /**
     * Test of intToLocalDateTime method, of class TimeUtilPro.
     */
    @Test
    public void testIntToLocalDateTime() {
        System.out.println("intToLocalDateTime");
        int date = 20030201;
        LocalDateTime expResult = LocalDateTime.of(LocalDate.of(2003, 2, 1), LocalTime.MIN);
        LocalDateTime result = TimeUtilPro.intToLocalDateTime(date);
        assertEquals(expResult, result);
    }

    /**
     * Test of longToLocalDateTime method, of class TimeUtilPro.
     */
    @Test
    public void testLongToLocalDateTime() {
        System.out.println("longToLocalDateTime");
        long date = 200302011234L;
        LocalDateTime expResult = LocalDateTime.of(LocalDate.of(2003, 2, 1), LocalTime.of(12, 34));
        LocalDateTime result = TimeUtilPro.longToLocalDateTime(date);
        assertEquals(expResult, result);
    }

    /**
     * Test of dateToLocalDateTime method, of class TimeUtilPro.
     */
    @Test
    public void testDateToLocalDateTime() {
        System.out.println("dateToLocalDateTime");
        Date date = new Date(1044099240000l);
        LocalDateTime expResult = LocalDateTime.of(2003, 2, 1, 12, 34);
        LocalDateTime result = TimeUtilPro.dateToLocalDateTime(date);
        assertEquals(expResult, result);
    }

    /**
     * Test of calendarToLocalDateTime method, of class TimeUtilPro.
     */
    @Test
    public void testCalendarToLocalDateTime() {
        System.out.println("calendarToLocalDateTime");
        Calendar date = Calendar.getInstance();
        date.set(2003, 1, 1, 12, 34);
        LocalDateTime expResult = LocalDateTime.of(2003, 2, 1, 12, 34);
        LocalDateTime result = TimeUtilPro.calendarToLocalDateTime(date);
        assertEquals(expResult, result);
    }

    /**
     * Test of localDateToInt method, of class TimeUtilPro.
     */
    @Test
    public void testLocalDateToInt() {
        LocalDate orginal = LocalDate.of(2003, 2, 1);
        int expResult = 20030201;
        int result = TimeUtilPro.localDateToInt(orginal);
        assertEquals(expResult, result);
    }

    /**
     * Test of localDateTimeToInt method, of class TimeUtilPro.
     */
    @Test
    public void testLocalDateTimeToInt() {
        LocalDateTime orginal = LocalDateTime.of(2003, 2, 1, 13, 24);
        int expResult = 20030201;
        int result = TimeUtilPro.localDateTimeToInt(orginal);
        assertEquals(expResult, result);
    }

    /**
     * Test of localDateToLong method, of class TimeUtilPro.
     */
    @Test
    public void testLocalDateToLong() {
        System.out.println("localDateToLong");
        LocalDate orginal = LocalDate.of(2003, 2, 1);
        long expResult = 20030201l;
        long result = TimeUtilPro.localDateToLong(orginal);
        assertEquals(expResult, result);
    }

    /**
     * Test of localDateTimeToLong method, of class TimeUtilPro.
     */
    @Test
    public void testLocalDateTimeToLong() {
        System.out.println("localDateTimeToLong");
        LocalDateTime orginal = LocalDateTime.of(2003, 2, 1, 12, 34);
        long expResult = 200302011234l;
        long result = TimeUtilPro.localDateTimeToLong(orginal);
        assertEquals(expResult, result);
    }

    /**
     * Test of localDateToDate method, of class TimeUtilPro.
     */
    @Test
    public void testLocalDateToDate() {
        System.out.println("localDateToDate");
        LocalDate original = LocalDate.of(2003, 2, 1);
        Date expResult = new Date(1044054000000l);
        Date result = TimeUtilPro.localDateToDate(original);
        assertEquals(expResult, result);
    }

    /**
     * Test of localDateTimeToDate method, of class TimeUtilPro.
     */
    @Test
    public void testLocalDateTimeToDate() {
        System.out.println("localDateTimeToDate");
        LocalDateTime original = LocalDateTime.of(2003, 2, 1, 12, 34);
        Date expResult = new Date(1044099240000l);
        Date result = TimeUtilPro.localDateTimeToDate(original);
        assertEquals(expResult, result);
    }

    /**
     * Test of localDateToCalendar method, of class TimeUtilPro.
     */
    @Test
    public void testLocalDateToCalendar() {
        System.out.println("localDateToCalendar");
        LocalDate original = LocalDate.of(2003, 2, 1);
        Calendar expResult = Calendar.getInstance();
        expResult.set(2003, 1, 1);
        Calendar result = TimeUtilPro.localDateToCalendar(original);
        assertEquals(expResult, result);
    }

    /**
     * Test of localDateTimeToCalendar method, of class TimeUtilPro.
     */
    @Test
    public void testLocalDateTimeToCalendar() {
        System.out.println("localDateTimeToCalendar");
        LocalDateTime original = LocalDateTime.of(2003, 2, 1, 12, 34);
        Calendar expResult = Calendar.getInstance();
        expResult.set(2003, 1, 1);
        Calendar result = TimeUtilPro.localDateTimeToCalendar(original);
        assertEquals(expResult, result);
    }
}
