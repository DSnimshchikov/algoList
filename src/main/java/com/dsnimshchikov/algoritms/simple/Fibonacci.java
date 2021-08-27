package com.dsnimshchikov.algoritms.simple;

public class Fibonacci {

    public String calcFibonacci(int maxNum) {
        StringBuilder builder = new StringBuilder();
        builder.append("1");
        int fib1 = 1;
        int fib2 = 1;
        for (int i = 3; i < maxNum; i++) {
            int fibCurrent = fib1 + fib2;
            fib1 = fib2;
            fib2 = fibCurrent;
            builder.append(" ").append(fibCurrent);
        }
        return builder.toString();
    }

}
