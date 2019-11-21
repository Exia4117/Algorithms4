package chapter1.chapter1_3;

import edu.princeton.cs.algs4.StdIn;

import java.util.HashMap;
import java.util.Stack;

public class ex4 {

    public static final HashMap<Character, Character> parentheses = new HashMap<Character, Character>() {
        {
            put(')', '(');
            put(']', '[');
            put('}', '{');
        }
    };

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        // for (int i = 0; i < s.length(); i++) {
        // char c = s.charAt(i);
        // if (parentheses.containsKey(c)) {
        // char top = stack.empty() ? ' ' : stack.pop();
        // if (top != parentheses.get(c)) {
        // return false;
        // }
        // } else {
        // stack.push(c);
        // }
        // }
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (parentheses.containsValue(c)) {
                stack.push(c);
            } else {
                if (!stack.empty() && parentheses.get(c) == stack.peek()) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.empty();
    }

    public static void main(String[] args) {
        String string = StdIn.readString();
        System.out.println(isValid(string));
    }
}