package com.dsnimshchikov.algoritms.lists;

import java.util.Map;
import java.util.Stack;

public class Parentheses {
    public static void main(String[] args) {
        System.out.println(isBracketsValid("[()]{}{[()()]()}"));
    }

    private static boolean isBracketsValid(String inputValid) {
        Map<Character, Character> closeBrackets = Map.of(']', '[', '}', '{', ')', '(');
        Stack<Character> characters = new Stack<>();
        for (int i = 0; i < inputValid.length(); i++) {
            Character c = inputValid.charAt(i);
            Character closeBracket = closeBrackets.get(c);
            if (closeBracket == null) {
                characters.push(c);
            } else if (!characters.pop().equals(closeBracket)) {
                return false;
            }
        }
        return true;
    }
}
