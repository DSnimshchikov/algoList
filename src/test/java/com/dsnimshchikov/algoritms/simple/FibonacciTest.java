package com.dsnimshchikov.algoritms.simple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciTest {

    @Test
    void calcFibonacci() {
        String expectedResult = "1 1 2 3 5 8 13";
        Fibonacci fibonacci = new Fibonacci();
        String result = fibonacci.calcFibonacci(14);
        assertEquals(expectedResult, result);
    }
}
