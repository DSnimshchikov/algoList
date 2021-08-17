package com.dsnimshchikov.algoritms.tree;

import com.dsnimshchikov.algoritms.tree.AbstractTree.TreeNode;

public class GraphAbstractTest {

    public TreeNode<Integer> makeTree() {
        //                   1
        //         2/                \3
        //    4/       \5        6 /   \ 7
        TreeNode<Integer> leaf4 = new TreeNode<>(4);
        TreeNode<Integer> leaf5 = new TreeNode<>(5);
        TreeNode<Integer> leaf6 = new TreeNode<>(6);
        TreeNode<Integer> leaf7 = new TreeNode<>(7);
        TreeNode<Integer> leaf2 = new TreeNode<>(2, leaf4, leaf5);
        TreeNode<Integer> leaf3 = new TreeNode<>(3, leaf6, leaf7);

        return new TreeNode<>(1, leaf2, leaf3);
    }

    public TreeNode<Integer> makeTreeHeight4() {
        TreeNode<Integer> root = makeTree();
        root.right.right.right = new TreeNode<>(8);
        return root;
    }

}
