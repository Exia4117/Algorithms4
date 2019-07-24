package chapter1.chapter1_1;

import edu.princeton.cs.algs4.StdIn;

public class ex5 {
    public static void main(String[] args) {
        double x = StdIn.readDouble(), y = StdIn.readDouble();
        if (x >= 0.0 && x <= 1.0 && y >= 0.0 && y <= 1.0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
