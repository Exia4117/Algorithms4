package chapter1.chapter1_1;

public class ex18 {
    public static int mystery(int a, int b) {
        if (b == 0) return 0;
        if (b % 2 == 0) return mystery(a + a, b / 2);
        return mystery(a + a, b / 2) + a;
    }

    public static int mystery2(int a, int b) {
        if (b == 0) return 1;
        if (b % 2 == 0) return mystery2(a * a, b / 2);
        return mystery2(a * a, b / 2) * a;
    }

    public static void main(String[] args) {
        System.out.println(ex18.mystery(2, 25));
        //32 + 16 + 2 = 50 (2*25)
        System.out.println(ex18.mystery2(2, 25));
        //256*256 * 256 * 2 = 33554432 (2^25)
        System.out.println(ex18.mystery(3, 11));
        //24 + 6 + 3 = 33 (3*11)
        System.out.println(ex18.mystery2(3, 11));
        //81*81 * 9 * 3 = 177147(3^11)
    }
}
