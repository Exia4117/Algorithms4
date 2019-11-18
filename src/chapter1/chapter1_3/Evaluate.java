package chapter1.chapter1_3;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Stack;

public class Evaluate {
    public static void main(String[] args) {
        Stack<String> ops = new Stack<>();
        Stack<Double> vals = new Stack<>();
        while (!StdIn.isEmpty()) {
            String s = StdIn.readString();
            switch (s) {
                case "(":
                    break;
                case "+":
                case "-":
                case "*":
                case "/":
                case "sqrt":
                    ops.push(s);
                    break;
                case ")": {
                    String op = ops.pop();
                    double v = vals.pop();
                    switch (op) {
                        case "+":
                            v += vals.pop();
                            break;
                        case "-":
                            v -= vals.pop();
                            break;
                        case "*":
                            v *= vals.pop();
                            break;
                        case "/":
                            v /= vals.pop();
                            break;
                        case "sqrt":
                            v = Math.sqrt(v);
                            break;
                    }
                    vals.push(v);
                }
                break;
                default:
                    vals.push(Double.parseDouble(s));
            }
        }
        StdOut.println(vals.pop());
    }
}
