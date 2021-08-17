package com.dsnimshchikov.algoritms.tree;

public class CalcTreeHeight {

    public Integer calculateHeight(AbstractTree.TreeNode<Integer> root) {
        if (root == null) {
            return 0;
        }
        return Math.max(calculateHeight(root.left), calculateHeight(root.right)) + 1;
    }
}
