package kyu8;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Kata100Test {

    @Test
    public void test10() {
        assertEquals("apple", Kata100.subtractSum(10));
    }

    @Test
    public void test111() {
        assertEquals("apple", Kata100.subtractSum(111));
    }

    @Test
    public void test1234() {
        assertEquals("apple", Kata100.subtractSum(1234));
    }
}