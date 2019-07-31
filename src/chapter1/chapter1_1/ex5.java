package chapter1.chapter1_1;

import edu.princeton.cs.algs4.StdIn;

public class ex5 {
    //编写一段程序，如果double类型的变量x和y都严格位于0和1之间则打印true，否则打印false
    public static void main(String[] args) {
        double x = StdIn.readDouble(), y = StdIn.readDouble();
        if (x >= 0.0 && x <= 1.0 && y >= 0.0 && y <= 1.0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
