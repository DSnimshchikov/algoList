package com.dsnimshchikov.algoritms.tree;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ZigzagGraphTraversTest extends GraphAbstractTest{

    @Test
    void zigzagGraphTravers() {
        ZigzagGraphTravers zigzagGraphTravers = new ZigzagGraphTravers();
        List<Integer> result = zigzagGraphTravers.zigzagGraphTravers(makeTree());
        assertEquals(result, Arrays.asList(1, 3, 2, 4, 5, 6, 7));
    }
}
