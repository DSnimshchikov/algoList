package com.dsnimshchikov.algoritms.lists;

public class FindMinimumDistanceBetween {

    public int find(int[] array, int x, int y) {
        int minDist = Integer.MAX_VALUE;
        int p = -1;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == x || array[i] == y) {
                //we will check if p is not equal to -1 and
                //If the element at current index matches with
                //the element at index p , If yes then update
                //the minimum distance if needed
                if (p != -1 && array[i] != array[p])
                    minDist = Math.min(minDist, i - p);

                //update the previous index
                p = i;
            }
        }
        if (minDist == Integer.MAX_VALUE)
            return -1;
        return minDist;
    }

    public int findHouses(boolean[][] houses) {
        int[][] dp = new int[houses.length][3];
        int[] positions = {-1, -1, -1};
        //Calculate distance between houses in one category with true from LEFT to RIGHT
        for (int i = 0; i < houses.length; i++) {
            for (int j = 0; j < houses[i].length; j++) {
                if (houses[i][j]) {
                    dp[i][j] = 0;
                    positions[j] = i;
                } else if (positions[j] >= 0) {
                    dp[i][j] = i - positions[j];
                } else {
                    dp[i][j] = -1;
                }
            }
        }

        positions = new int[]{-1, -1, -1};
        int minMaxDist = Integer.MAX_VALUE;
        //Calculate distance between houses in each category with true from RIGHT to LEFT
        //Find max distance by categories and calculate the minimum of them
        for (int i = houses.length - 1; i >= 0; i--) {
            int maxDist = dp[i][0];
            for (int j = 0; j < houses[i].length; j++) {
                if (houses[i][j]) {
                    dp[i][j] = 0;
                    positions[j] = i;
                } else if (positions[j] >= 0) {
                    if (dp[i][j] >= 0) {
                        dp[i][j] = Math.min(dp[i][j], positions[j] - i);
                    } else {
                        dp[i][j] = positions[j] - i;
                    }
                }
                maxDist = Math.max(maxDist, dp[i][j]);
            }
            minMaxDist = Math.min(minMaxDist, maxDist);
        }
        return minMaxDist;
    }
}
