package chapter1.chapter1_3;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Stack;

public class ex9 {
    public static void main(String[] args) {
//        Stack<String> ops = new Stack<>();
        Stack<String> vals = new Stack<>();
        while(!StdIn.isEmpty()){
            String s = StdIn.readString();
            switch (s){
                case ")":
                    String s1 = vals.pop();
                    String s2 = vals.pop();
                    String s3 = vals.pop();
                    vals.push("(" + " " + s3 + " " + s2 + " " + s1 + " " + ")");    //相当于将整个带左右括号的完整的String作为一个元素压栈
                    break;
                default:
                    vals.push(s);
            }
        }
        System.out.println(vals.pop());
    }
}
