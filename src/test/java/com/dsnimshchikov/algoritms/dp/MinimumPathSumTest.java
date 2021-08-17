package com.dsnimshchikov.algoritms.dp;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinimumPathSumTest {

    int[][] paths8 = {
            {1, 3, 1}, // 1, 4, 5
            {1, 5, 2}, // 2, 7, 7
            {4, 2, 1}};// 6, 8, 8

    int[][] paths7 = {
            {1, 3, 5}, // 1, 4, 9
            {2, 1, 2}, // 3, 4, 6
            {4, 3, 1}};// 7, 7, 7

    @Test
    void minimumPathSum() {

        MinimumPathSum pathSum = new MinimumPathSum();
        int result7 = pathSum.minimumPathSum(paths7);
        int result8 = pathSum.minimumPathSum(paths8);

        assertEquals(result7, 7);
        assertEquals(result8, 8);
    }
}
