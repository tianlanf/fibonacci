package com.tw;

import org.junit.Test;

public class FibonacciSequenceTest {
    @Test(expected = Exception.class)
    public void shouldThrowExceptionGivenInputLessThan1() {
        FibonacciSequence counter = new FibonacciSequence();
        counter.getFibonacciNumber(0);
    }
}
