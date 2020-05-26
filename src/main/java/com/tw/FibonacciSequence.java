package com.tw;

import static java.lang.String.format;

public class FibonacciSequence {
    public long getFibonacciNumber(int index) {
        if (index < 1) {
            throw new RuntimeException(format("invalid number: %d", index));
        }
        return 1;
    }
}
