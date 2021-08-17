package com.dsnimshchikov.algoritms.tree;

import java.util.ArrayList;

public class DeepGraphTravers extends AbstractTree {

    public ArrayList<Integer> deepTraversTree(TreeNode<Integer> root, ArrayList<Integer> result) {
        result.add(root.value);
        if (root.left != null) {
            deepTraversTree(root.left, result);
        }
        if (root.right != null) {
            deepTraversTree(root.right, result);
        }
        return result;
    }

}
