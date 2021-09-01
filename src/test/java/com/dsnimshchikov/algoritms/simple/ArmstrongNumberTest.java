package com.dsnimshchikov.algoritms.simple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ArmstrongNumberTest {

    @Test
    void isArmStrong() {
        ArmstrongNumber armstrongNumber = new ArmstrongNumber();
        assertTrue(armstrongNumber.isArmStrong(153));
        assertFalse(armstrongNumber.isArmStrong(154));
        assertFalse(armstrongNumber.isArmStrong(139));
    }
}
