package com.dsnimshchikov.algoritms.dp;

import static org.junit.jupiter.api.Assertions.*;

class MinTicketCostsTest {

    @org.junit.jupiter.api.Test
    void minCostTickets() {
        int[][] days1 = {{1, 4, 6, 8, 9, 365}};
        int[][] costs = {{2, 7, 15}};

        MinTicketCosts minC = new MinTicketCosts();
        int j = minC.minCostTickets(days1[0], costs[0]);

        assertEquals(j, 11);
    }
}
