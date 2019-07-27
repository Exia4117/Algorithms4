package chapter1.chapter1_1;

import edu.princeton.cs.algs4.StdOut;

public class ex7 {
    public static void main(String[] args) {
        double t = 25.0;
        while (Math.abs(t - 25.0 / t) > .001) {
            double y = 25.0 / t;
            double x = 25.0 / t + t;
            t = (25.0 / t + t) / 2.0;
        }
        //5.00002
        StdOut.printf("%.5f\n", t);
        int sum = 0;
        for (int i = 1; i < 1000;i++){
            for(int j = 0;j < i;j++){
                sum++;
            }
        }
        StdOut.println(sum);
        //499500
        sum = 0;
        for(int i = 1;i<1000;i*=2){
            for(int j = 0;j<1000;j++){
                sum++;
            }
        }
        StdOut.println(sum);
        //10000
    }
}
