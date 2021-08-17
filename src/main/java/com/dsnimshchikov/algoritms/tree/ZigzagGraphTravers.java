package com.dsnimshchikov.algoritms.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class ZigzagGraphTravers extends AbstractTree {

    public List<Integer> zigzagGraphTravers(AbstractTree.TreeNode<Integer> root) {
        if (root == null) return new ArrayList<>();
        List<Integer> result = new ArrayList<>();
        Queue<TreeNode<Integer>> queue = new LinkedList<>();
        queue.add(root);
        int lvl = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new LinkedList<>();
            for (int i = 0; i < size; i++) {
                TreeNode<Integer> node = queue.poll();
                if (lvl % 2 == 0) {
                    level.add(node.value);
                } else {
                    level.add(0, node.value);
                }
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
            lvl++;
            result.addAll(level);
        }
        return result;
    }
}
