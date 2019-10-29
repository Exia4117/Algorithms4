package chapter1.chapter1_2;

import edu.princeton.cs.algs4.StdOut;

public class ex5 {
    public static void main(String[] args) {
        String s = "Hello World";
        s.toUpperCase();
        s.substring(6,11);
        StdOut.println(s);
        /*
        String对象是不可变的
        所有字符串方法都会返回一个新的String对象
         */
    }
}
