package agh.po.lab3;

import org.junit.Test;

import static org.junit.Assert.*;

public class CodingBatTest {
    @Test
    public void testFrontTimes() {
        assertEquals("ChoCho",CodingBat.frontTimes("Chocolate",2));
        assertEquals("ChoChoCho",CodingBat.frontTimes("Chocolate",3));
        assertEquals("AbcAbcAbc",CodingBat.frontTimes("Abc",3));
    }

    @Test
    public void testDoubleX() {
        assertTrue(CodingBat.doubleX("axxbb"));
        assertFalse(CodingBat.doubleX("axaxax"));
        assertTrue(CodingBat.doubleX("xxxxx"));
    }

    @Test
    public void hasBad() {
        assertTrue(CodingBat.hasBad("badxx"));
        assertTrue(CodingBat.hasBad("xbadxx"));
        assertFalse(CodingBat.hasBad("xxbadxx"));
    }

    @Test
    public void fizzArray2() {
        assertEquals(new String[] {"0","1","2","3"},CodingBat.fizzArray2(4));
        assertEquals(new String[] {"0","1","2","3","4","5","6","7","8","9"},CodingBat.fizzArray2(10));
        assertEquals(new String[] {"0","1"},CodingBat.fizzArray2(2));
    }
}