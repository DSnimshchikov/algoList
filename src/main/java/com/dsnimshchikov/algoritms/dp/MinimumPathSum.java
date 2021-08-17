package com.dsnimshchikov.algoritms.dp;

public class MinimumPathSum {

    public int minimumPathSum(int[][] pathMx) {
        int rows = pathMx.length;
        int columns = pathMx[0].length;
        int[][] dp = new int[3][3];
        dp[0][0] = pathMx[0][0];
        for (int i = 1; i < rows; i++) {
            dp[0][i] = dp[0][i - 1] + pathMx[0][i];
        }
        for (int i = 1; i < columns; i++) {
            dp[i][0] = dp[i - 1][0] + pathMx[i][0];
        }
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < columns; j++) {
                dp[i][j] = pathMx[i][j] + Math.min(dp[i - 1][j], dp[i][j - 1]);
            }
        }
        return dp[rows - 1][columns - 1];
    }

}
