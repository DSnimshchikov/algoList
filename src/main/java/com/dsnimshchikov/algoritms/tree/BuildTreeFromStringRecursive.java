package com.dsnimshchikov.algoritms.tree;

public class BuildTreeFromStringRecursive extends AbstractTree {

    TreeNode<String> makeTree(String input) {
        int breaksSum = 1;

        //Получаем позицию для старта
        int lengthWithOutLastBreak = input.length();
        int i = 1;
        while (i < input.length() && input.charAt(i) != '(') {
            i++;
        }
        String value = input.substring(0, i);
        TreeNode<String> root = new TreeNode<>(value);
        if (input.length() <= i) {
            return root;
        }

        //Получаем подстроку описывающую левое поддерево
        i++;
        while (i < lengthWithOutLastBreak && breaksSum > 0) {
            char c = input.charAt(i);
            switch (c) {
                case '(':
                    breaksSum++;
                    break;
                case ')':
                    breaksSum--;
                    break;
            }
            i++;
        }
        //Осталась только значимая часть левого значения
        if (i >= lengthWithOutLastBreak) {
            String leftValue = input.substring(value.length() + 1, input.length() - 1);
            root.left = new TreeNode<>(leftValue);
            return root;
        }
        //Получаем подстроку описывающую правое поддерево
        if (input.length() - 1 - (i + 1) > 0) {
            String rightTree = input.substring(i + 1, input.length() - 1);
            root.right = makeTree(rightTree);
        }
        //считаем тут достаточно длинны для полноценной обработки левой части не менее 6(5)(1)
        String leftTree = input.substring(value.length() + 1, i - 1);
        if (leftTree.length() > 0) {
            root.left = makeTree(leftTree);
        }
        return root;
    }
}
