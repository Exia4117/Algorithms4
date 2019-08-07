package chapter1.chapter1_1;

import edu.princeton.cs.algs4.StdOut;

public class ex19 {
    public static long F(int N) {
        if (N == 0) return 0;
        if (N == 1) return 1;
        return F(N - 1) + F(N - 2);
    }

    public static long[] F1(int N) {
        long[] fibo = new long[N + 1];
        fibo[0] = 0;
        if (N == 0) return fibo;
        fibo[1] = 1;
        if (N == 1) return fibo;
        for (int i = 2; i <= N; i++) {
            fibo[i] = fibo[i - 1] + fibo[i - 2];
        }
        return fibo;
    }

    public static void main(String[] args) {
//        for (int N = 0; N < 100; N++) {
//            StdOut.println(N + " " + F(N));
//        }
        for (int N = 0; N < 100; N++) {
            StdOut.println(N + " " + F1(N)[N]);
        }
    }
}
