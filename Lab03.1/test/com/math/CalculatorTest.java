/*
 * This code is sample code, provided as-is, and we make no
 * warranties as to its correctness or suitability for
 * any purpose.
 *
 * We hope that it's useful to you.  Enjoy.
 * Copyright LearningPatterns Inc.
 */
package com.math;

import static org.junit.Assert.*;

import org.junit.*;

public class CalculatorTest {
    // fixture: business object(s) under test
    private Calculator calc;

    @BeforeClass
    public static void initializeTestRun() {
        System.out.println("initializeTestRun");
    }

    @AfterClass
    public static void finalizeTestRun() {
        System.out.println("finalizeTestRun");
    }

    @Before
    public  void setUp() {
        System.out.println("setUp");

        calc = new Calculator();

    }

    @After
    public void tearDown() {
        System.out.println("tearDown");
    }

    @Test
    public void testISEven() {
        System.out.println("testIsEven");

        assertTrue(calc.isEven(10)); // passes is the boolean condition evaluates to true
        assertFalse(calc.isEven(11)); // passes is the boolean condition evaluates to false
    }
    @Test
    public void testDivide() {
        System.out.println("testDivide");

        assertEquals(2.5, calc.divide(5,2), .001); // expected, actual, delta
    }
    @Test
    public void testAdd() {
        System.out.println("testAdd");

        assertEquals(5, calc.add(1, 4)); // expected, actial
    }
}