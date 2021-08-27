package com.dsnimshchikov.algoritms.lists;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FindMinimumDistanceBetweenTest {

    @org.junit.jupiter.api.Test
    public void testMinDistance() {
        FindMinimumDistanceBetween findMinimumDistanceBetween = new FindMinimumDistanceBetween();
        int[] input = {0, 1, 2, 3, 4, 5, 3, 7,};
        int result = findMinimumDistanceBetween.find(input, 0, 3);
        assertEquals(2, result);
    }


    @org.junit.jupiter.api.Test
    public void testMinDistanceHouse() {
        FindMinimumDistanceBetween findMinimumDistanceBetween = new FindMinimumDistanceBetween();
        boolean[][] input = {
                {false, true, false},
                {true, false, false},
                {true, false, false},
                {false, true, false},
                {false, true, true}};
        int result = findMinimumDistanceBetween.findHouses(input);
        assertEquals(1, result);

    }
}
