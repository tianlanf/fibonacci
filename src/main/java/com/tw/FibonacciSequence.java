package com.tw;

import static java.lang.String.format;

public class FibonacciSequence {
    public Long getFibonacciNumber(int index) {
        throw new RuntimeException(format("invalid number: %d", index));
    }
}
