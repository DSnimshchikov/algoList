package com.dsnimshchikov.algoritms.tree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalcTreeHeightTest extends GraphAbstractTest{

    @Test
    void calculateHeight() {
        CalcTreeHeight treeHeight = new CalcTreeHeight();
        Integer height = treeHeight.calculateHeight(makeTree());
        assertEquals(height, 3);
        height = treeHeight.calculateHeight(makeTreeHeight4());
        assertEquals(height, 4);
    }
}
