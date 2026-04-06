package com.example;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class GradeCalculatorTest {

    GradeCalculator gc = new GradeCalculator();

    @Test
    public void testTotal() {
        assertEquals(240, gc.getTotal(80, 70, 90));
    }

    @Test
    public void testAverage() {
        assertEquals(80.0, gc.getAverage(80, 70, 90), 0.01);
    }

    @Test
    public void testPass() {
        assertEquals("PASS", gc.getResult(80, 70, 90));
    }

    @Test
    public void testFail() {
        assertEquals("FAIL", gc.getResult(80, 20, 90));
    }
}
