package chapter1.chapter1_1;

public class ex24 {
    public static int Euclid(int a, int b) {
        return b > 0 ? Euclid(b, a % b) : a;
    }

    public static void main(String[] args) {
        System.out.println(Euclid(24,105));
        System.out.println(Euclid(1111111,1234567));
    }
}
