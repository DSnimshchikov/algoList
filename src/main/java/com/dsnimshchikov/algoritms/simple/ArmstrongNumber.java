package com.dsnimshchikov.algoritms.simple;

public class ArmstrongNumber {

    public boolean isArmStrong(int testingNumber) {
        int result = 0;
        int inputNumber = testingNumber;
        while (testingNumber != 0) {
            int remainder = testingNumber % 10;
            result += Math.pow(remainder, 3);
            testingNumber /= 10;
        }
        return inputNumber == result;
    }

}
