package com.dsnimshchikov.algoritms.tree;

import java.util.LinkedList;
import java.util.Stack;

public class BuildTreeFromString extends AbstractTree {
    //    Дана строка 8 (4(2(1))(5)) (12(10(9)(11))(14))
//            ——-8
//            /         \
//            4          12
//            / \       /       \
//            2  5     10        14
//           |       9    11   13   15
//           1
    public static void main(String[] args) {
        BuildTreeFromString buildTreeFromString = new BuildTreeFromString();
//        buildTreeFromString.makeTree("4(2(3)(1))(6(5))");
//        buildTreeFromString.makeTree("8(4(2(1))(5))(12(10(9)(11))(14))");
        buildTreeFromString.makeTree("8(4(2(1))(5))(12(10(9)(11))(14(13)(15)))");
    }

    TreeNode<String> makeTree(String input) {
        Stack<Character> brackets = new Stack<>();
        Stack<String> numbers = new Stack<>();
        LinkedList<TreeNode<String>> leaf = new LinkedList<>();
        TreeNode<String> t = new TreeNode<>();
        StringBuilder tempS = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            switch (c) {
                case '(':
                    brackets.push(c);
                    String result = tempS.toString();
                    if (result.length() > 0) {
                        numbers.push(tempS.toString());
                        tempS = new StringBuilder();
                    }
                    break;
                case ')':
                    String result1 = tempS.toString();
                    if (result1.length() > 0) {
                        tempS = new StringBuilder();
                        leaf.add(new TreeNode<>(result1));
                    } else {

                        TreeNode<String> root1 = new TreeNode<>(numbers.pop());
                        if (leaf.size() > 1) { // тут накапливается ошибка с увеличением кол-а правых ветвей деерва. т.к. в расчете не учитывается кол-во ветвей по которым мы прошли в право
//                        if (leaf.size() - (brackets.size() - numbers.size()) > 1) {
                            root1.right = leaf.removeLast();
                            if (numbers.size() + 2 == brackets.size()) {
                                brackets.pop();
                            }
                        }
                        root1.left = leaf.removeLast();
                        leaf.add(root1);
                        brackets.pop();
                        brackets.pop();
                    }
                    break;
                default:
                    tempS.append(c);
            }
        }
        TreeNode<String> root1 = new TreeNode<>(numbers.pop());
        if (leaf.size() == 2) {
            root1.right = leaf.removeLast();
        }
        root1.left = leaf.removeLast();
        leaf.add(root1);
        return t;
    }
}
