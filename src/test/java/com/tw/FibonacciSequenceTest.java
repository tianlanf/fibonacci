package com.tw;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class FibonacciSequenceTest {

    private final FibonacciSequence counter = new FibonacciSequence();

    @Test(expected = Exception.class)
    public void shouldThrowExceptionGivenInputLessThan1() {
        counter.getFibonacciNumber(0);
    }

    @Test
    public void shouldReturn1GivenInputIs1() {
        long result = counter.getFibonacciNumber(1);
        assertEquals(1L, result);
    }
}
