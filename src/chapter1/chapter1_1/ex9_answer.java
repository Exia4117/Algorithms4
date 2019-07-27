package chapter1.chapter1_1;

public class ex9_answer {
    public static String toBinaryString(int N) {
        String s = "";
        for (int n = N; n > 0; n /= 2) {
            s = (n % 2) + s;
        }
        return s;
    }

    public static void main(String[] args) {
        for (int i = 1; i < 512; i++) {

            String s = ex9_answer.toBinaryString(i);
            System.out.println(s);
        }
    }
}
