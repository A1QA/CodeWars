package kyu8;

import kyu8.Kata011;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class Kata011Test {
    @Test
    public void testSomething() {
        assertEquals(30, Kata011.TwiceAsOld(30, 0));

    }

    @Test
    public void testSomething2() {
        assertEquals(16, Kata011.TwiceAsOld(30, 7));

    }

    @Test
    public void testSomething3() {
        assertEquals(15, Kata011.TwiceAsOld(45, 30));

    }
}