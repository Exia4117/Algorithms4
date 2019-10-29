package chapter1.chapter1_2;

import edu.princeton.cs.algs4.StdOut;

public class ex4 {
    public static void main(String[] args) {
        String string1 = "hello";   //创建新对象，值为"hello"，丢到字符串池，返回此对象的引用给string1
        String string2 = string1;   //将string1的引用传给string2
        string1 = "world";          //在字符串池中查找值为"world"的对象，没有找到，创建"world"丢到字符串池，返回此对象的引用给string1，string2不受影响
        StdOut.println(string1);
        StdOut.println(string2);
        //world
        //hello
    }
}
