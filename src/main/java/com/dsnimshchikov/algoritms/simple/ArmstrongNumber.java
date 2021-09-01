package com.dsnimshchikov.algoritms.simple;

public class ArmstrongNumber {

    public boolean isArmStrong(int number) {
        int result = 0;
        int orig = number;
        while (number != 0) {
            int remainder = number % 10;
            result += remainder * remainder * remainder;
            number /= 10;
        }
        return orig == result;
    }


}
