package com.dsnimshchikov.algoritms.tree;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BreadthGraphTraversTest {

    public AbstractTree.TreeNode<Integer> makeTree() {
        //                   1
        //         2/                \3
        //    4/       \5        6 /   \ 7
        AbstractTree.TreeNode<Integer> leaf4 = new AbstractTree.TreeNode<>(4);
        AbstractTree.TreeNode<Integer> leaf5 = new AbstractTree.TreeNode<>(5);
        AbstractTree.TreeNode<Integer> leaf6 = new AbstractTree.TreeNode<>(6);
        AbstractTree.TreeNode<Integer> leaf7 = new AbstractTree.TreeNode<>(7);
        AbstractTree.TreeNode<Integer> leaf2 = new AbstractTree.TreeNode<>(2, leaf4, leaf5);
        AbstractTree.TreeNode<Integer> leaf3 = new AbstractTree.TreeNode<>(3, leaf6, leaf7);

        return new AbstractTree.TreeNode<>(1, leaf2, leaf3);
    }

    @Test
    void breadthTraversTree() {
        BreadthGraphTravers breadthGraphTravers = new BreadthGraphTravers();
        ArrayList<Integer> result = breadthGraphTravers.breadthTraversTree(makeTree());
        assertEquals(result, Arrays.asList(1, 2, 3, 4, 5, 6, 7));
    }
}
