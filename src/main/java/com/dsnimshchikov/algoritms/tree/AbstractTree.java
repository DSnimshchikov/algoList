package com.dsnimshchikov.algoritms.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public abstract class AbstractTree {

    public static class TreeNode<T> {
        T value;
        TreeNode<T> left;
        TreeNode<T> right;

        public TreeNode() {

        }

        public TreeNode(T value) {
            this.value = value;
        }

        public TreeNode(T value, TreeNode<T> left, TreeNode<T> right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public T getValue() {
            return value;
        }

        public void setValue(T value) {
            this.value = value;
        }

        public TreeNode<T> getLeft() {
            return left;
        }

        public void setLeft(TreeNode<T> left) {
            this.left = left;
        }

        public TreeNode<T> getRight() {
            return right;
        }

        public void setRight(TreeNode<T> right) {
            this.right = right;
        }

        @Override
        public String toString() {
            ArrayList<T> lists = new ArrayList<>();
            Queue<TreeNode<T>> queue = new LinkedList<>();
            queue.offer(this);
            while (!queue.isEmpty()) {
                TreeNode<T> tree = queue.poll();
                if (tree.left != null)
                    queue.offer(tree.left);
                if (tree.right != null)
                    queue.offer(tree.right);
                lists.add(tree.value);
            }
            return lists.toString();
        }
    }
}
