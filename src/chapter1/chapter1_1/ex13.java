package chapter1.chapter1_1;

public class ex13 {

    //交换行和列
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };
        for (int j = 0; j < matrix[0].length; j++) {
            for(int i = 0;i < matrix.length;i++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.print("\n");
        }
    }
}
