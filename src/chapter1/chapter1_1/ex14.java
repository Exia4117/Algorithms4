package chapter1.chapter1_1;

public class ex14 {

    //编写一个静态方法lg（），接受一个整型参数N，返回不大于log2N的最大整数，不要使用Math库
    public static int lg(int N) {
        int n = 1, count = 0;
        while (n <= N) {
            n *= 2;
            count++;
        }
        return count - 1;
    }

    public static void main(String[] args) {
        System.out.println(ex14.lg(2));
    }

}
