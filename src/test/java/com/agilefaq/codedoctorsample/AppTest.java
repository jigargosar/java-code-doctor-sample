package com.agilefaq.codedoctorsample;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AppTest {

    @Test
    public void testCalc() throws Exception {
        int res = App.calc(1, 1);
        assertEquals(2, res);
    }

    @Test
    public void testCalc2() throws Exception {
        int res = App.calc2(1, 1);
        assertEquals(0, res);
    }
}
