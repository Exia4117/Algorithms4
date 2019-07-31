package chapter1.chapter1_1;

public class ex15 {
    //编写一个静态方法histogram（），接受一个整形数组a[]和一个整数M作为参数并返回一个大小为M的数组，其中第i个元素的值为整数i在参数数组中出现的次数。
    //如果a[]中的值均在0到M-1之间，返回数组中所有元素之和应该和a.length相等
    public static int[] histogram(int[] a, int M) {
        int[] sum = new int[M];
//        for (int i = 0; i < M; i++) {
//            sum[i] = 0;
//            for (int j = 0; j < a.length; j++) {
//                if (a[j] == i)
//                    sum[i]++;
//            }
//        }         时间复杂度太高
        for (int i = 0; i < a.length; i++) {
            if(a[i] > 0 && a[i] < M){
                sum[a[i]]++;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] input1 = {1, 1, 2, 3, 1, 7, 5, 3, 2, 2, 2};
        int input2 = 8;
        int[] output = ex15.histogram(input1, input2);
        for (int o : output) {
            System.out.println(o);
        }
    }
}
