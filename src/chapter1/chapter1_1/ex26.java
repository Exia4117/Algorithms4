package chapter1.chapter1_1;

import static java.lang.Integer.parseInt;

public class ex26 {
    public static void main(String[] args) {
        int a = parseInt(args[0]), b = parseInt(args[1]), c = parseInt(args[2]);
        int t;
        if (a > b) {
            t = a;
            a = b;
            b = t;
        }
        if (a > c) {
            t = a;
            a = c;
            c = t;
        }
        if (b > c) {
            t = b;
            b = c;
            c = t;
        }

        System.out.println(a + " " + b + " " + c);
        //if判断语句之后做的是交换操作，即如果 a > b ,就交换 a 和 b，以此类推，即交换大小实现冒泡排序
    }
}
