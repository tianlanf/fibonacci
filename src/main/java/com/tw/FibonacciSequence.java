package com.tw;

import static java.lang.String.format;

public class FibonacciSequence {
    public long getFibonacciNumber(int index) {
        if (index < 1) {
            throw new RuntimeException(format("invalid index: %d", index));
        }
        if (index < 3) {
            return 1;
        }
        return getFibonacciNumber(index - 1) + getFibonacciNumber(index - 2);
    }
}
