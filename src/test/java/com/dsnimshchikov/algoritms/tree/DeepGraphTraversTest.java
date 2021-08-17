package com.dsnimshchikov.algoritms.tree;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class DeepGraphTraversTest extends GraphAbstractTest{

    @Test
    void deepTraversTree() {
        DeepGraphTravers deepGraphTravers = new DeepGraphTravers();
        ArrayList<Integer> result = deepGraphTravers.deepTraversTree(makeTree(), new ArrayList<>());
        assertEquals(result, Arrays.asList(1, 2, 4, 5, 3, 6, 7));
    }
}
