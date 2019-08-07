package chapter1.chapter1_1;

public class ex9_answer {
    //编写一段代码，将一个正整数N用二进制表示并转换为一个String类型的值s
    public static String toBinaryString(int N) {
        StringBuilder s = new StringBuilder();
        for (int n = N; n > 0; n /= 2) {
            s.insert(0, (n % 2));
        }
        return s.toString();
    }

    public static void main(String[] args) {
        for (int i = 1; i < 512; i++) {

            String s = ex9_answer.toBinaryString(i);
            System.out.println(s);
        }
    }
}
