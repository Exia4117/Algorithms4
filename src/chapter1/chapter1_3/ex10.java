package chapter1.chapter1_3;

import edu.princeton.cs.algs4.StdIn;

import java.util.Stack;

public class ex10 {
    public static void main(String[] args) {
        Stack<String> vals = new Stack<>();
        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            switch (s) {
                case "(":
                    break;
                case ")":
                    String s1 = vals.pop();
                    String s2 = vals.pop();
                    String s3 = vals.pop();
                    vals.push(s3 + " " + s1 + " " + s2 + " ");
                    break;
                default:
                    vals.push(s);
            }
        }
        System.out.println(vals.pop());
    }
}
