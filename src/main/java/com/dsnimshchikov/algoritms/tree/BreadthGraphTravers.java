package com.dsnimshchikov.algoritms.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class BreadthGraphTravers extends AbstractTree {

    public ArrayList<Integer> breadthTraversTree(AbstractTree.TreeNode<Integer> root) {
        ArrayList<Integer> lists = new ArrayList<>();
        if (root == null) return lists;
        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode<Integer> tree = queue.poll();
            if (tree.left != null)
                queue.offer(tree.left);
            if (tree.right != null)
                queue.offer(tree.right);
            lists.add(tree.value);
        }
        return lists;
    }


}
