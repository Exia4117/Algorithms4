package chapter1.chapter1_1;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex21 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> str = new ArrayList<>();
        List<Integer> num1 = new ArrayList<>();
        List<Integer> num2 = new ArrayList<>();
//        while (StdIn.hasNextLine()) {
//            str.add(StdIn.readString());
//            StdOut.println(str);
//            num1.add(StdIn.readInt());
//            StdOut.println(num1);
//            num2.add(StdIn.readInt());
//            StdOut.println("hello world");
//            StdOut.println(num2);
//        }
        while(in.hasNext()){
            str.add(in.next());
            System.out.println(str);
            num1.add(in.nextInt());
            System.out.println(num1);
            num2.add(in.nextInt());
            System.out.println(num2);

        }
        for (int i = 0; i < str.size(); i++) {
            System.out.printf("%5s%5d%5d%8.3f\n",str.get(i),num1.get(i),num2.get(i),(double)num1.get(i)/num2.get(i));
        }
    }
}
