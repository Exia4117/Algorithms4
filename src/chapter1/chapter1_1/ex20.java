package chapter1.chapter1_1;

public class ex20 {
    public static double ln(int N) {
        if (N == 1) {
            return 0;
        }
        return Math.log(N) + ln(N-1);
    }

    public static void main(String[] args) {
        System.out.println(ln(5));
    }
}
