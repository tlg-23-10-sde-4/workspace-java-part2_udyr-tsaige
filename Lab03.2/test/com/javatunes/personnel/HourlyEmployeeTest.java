package com.javatunes.personnel;

import org.junit.Before;
import org.junit.Test;

import java.sql.Date;

import static org.junit.Assert.*;

public class HourlyEmployeeTest {
    // fixture -> business object under test
    private HourlyEmployee emp;


    @Before
    public void setUp()  {
        emp = new HourlyEmployee("Kodi", Date.valueOf("1998-04-02"),25.0,30.0);

    }

    @Test
    public void testPay() {
    assertEquals(750.0, emp.pay(), .001);  // expected value: rate * hours
    }

    @Test
    public void testPayTaxes() {
        assertEquals(187.0, emp.payTaxes(), .001);  // expected values: rate * hours * 0.25


    }
}