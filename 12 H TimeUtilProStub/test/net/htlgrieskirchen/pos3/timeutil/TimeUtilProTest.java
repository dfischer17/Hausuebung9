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
        Date date = new Date(1044099240000l); // aendern
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
        System.out.println("localDateTimeToInt");
        LocalDateTime dateTime = null;
        int expResult = 0;
        int result = TimeUtilPro.localDateTimeToInt(dateTime);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of localDateToLong method, of class TimeUtilPro.
     */
    @Test
    public void testLocalDateToLong() {
        System.out.println("localDateToLong");
        LocalDate date = null;
        long expResult = 0L;
        long result = TimeUtilPro.localDateToLong(date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of localDateTimeToLong method, of class TimeUtilPro.
     */
    @Test
    public void testLocalDateTimeToLong() {
        System.out.println("localDateTimeToLong");
        LocalDateTime dateTime = null;
        long expResult = 0L;
        long result = TimeUtilPro.localDateTimeToLong(dateTime);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of localDateToDate method, of class TimeUtilPro.
     */
    @Test
    public void testLocalDateToDate() {
        System.out.println("localDateToDate");
        LocalDate date = null;
        Date expResult = null;
        Date result = TimeUtilPro.localDateToDate(date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of localDateTimeToDate method, of class TimeUtilPro.
     */
    @Test
    public void testLocalDateTimeToDate() {
        System.out.println("localDateTimeToDate");
        LocalDateTime dateTime = null;
        Date expResult = null;
        Date result = TimeUtilPro.localDateTimeToDate(dateTime);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of localDateToCalendar method, of class TimeUtilPro.
     */
    @Test
    public void testLocalDateToCalendar() {
        System.out.println("localDateToCalendar");
        LocalDate date = null;
        Calendar expResult = null;
        Calendar result = TimeUtilPro.localDateToCalendar(date);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of localDateTimeToCalendar method, of class TimeUtilPro.
     */
    @Test
    public void testLocalDateTimeToCalendar() {
        System.out.println("localDateTimeToCalendar");
        LocalDateTime dateTime = null;
        Calendar expResult = null;
        Calendar result = TimeUtilPro.localDateTimeToCalendar(dateTime);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
