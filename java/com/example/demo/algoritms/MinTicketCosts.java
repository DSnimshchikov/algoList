package com.example.demo.algoritms;

class MinTicketCosts {

    public int minCostTickets(int[] days, int[] costs) {
        int daysCount = days.length;
        int maxDayCount = 366; //because 365 in year +1, because we count from 0 in the array DP
        int[] dp = new int[maxDayCount];
        dp[0] = 0;
        for (int i = 1, dayProcessed = 0; i < maxDayCount && dayProcessed < daysCount; i++) {
            if (i == days[dayProcessed]) {
                dp[i] = getCostForNDayBefore(dp, i, 1, costs[0]);
                dp[i] = Math.min(getCostForNDayBefore(dp, i, 7, costs[1]), dp[i]);
                dp[i] = Math.min(getCostForNDayBefore(dp, i, 30, costs[2]), dp[i]);
                dayProcessed++;
            } else {
                dp[i] = dp[i - 1];
            }
        }
        return dp[days[daysCount - 1]];
    }

    //Get N day before cost or zero after that add cost for current day
    private int getCostForNDayBefore(int[] dp, int dayNumber, int dayBefore, int cost) {
        return dp[Math.max(dayNumber - dayBefore, 0)] + cost;
    }

    public static void main(String[] args) {
        int[][] days1 = {{1, 4, 6, 8, 9, 365}};
        int[][] costs = {{2, 7, 15}};

        MinTicketCosts minC = new MinTicketCosts();
        int j = minC.minCostTickets(days1[0], costs[0]);
        System.out.println("Min cost = " + j);
    }
}
