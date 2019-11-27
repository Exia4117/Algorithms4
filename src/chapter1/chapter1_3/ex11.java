package chapter1.chapter1_3;

import edu.princeton.cs.algs4.StdIn;

import java.util.Stack;

public class ex11 {
    public static void main(String[] args) {
        Stack<Double> stack = new Stack<>();
        while(!StdIn.isEmpty()){
            String s = StdIn.readString();
            double result = 0.0;
            switch (s){
                case "+":
                    result = stack.pop() + stack.pop();
                    stack.push(result);
                    break;
                case "-":
                    result = stack.pop() - stack.pop();
                    stack.push(result);
                    break;
                case "*":
                    result = stack.pop() * stack.pop();
                    stack.push(result);
                    break;
                case "/":
                    result = stack.pop() / stack.pop();
                    stack.push(result);
                    break;
                default:
                    stack.push(Double.parseDouble(s));
            }
        }
        System.out.println(stack.pop());
    }
}
