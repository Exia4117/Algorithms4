package chapter1.chapter1_1;

import java.util.HashMap;

public class ex11 {

    //编写一段代码，打印出一个二维布尔数组的内容。其中，使用*表示真，空格表示假。打印出行号和列号

    public static final HashMap<Boolean, Character> Bool = new HashMap<Boolean, Character>() {
        {
            put(true, '*');
            put(false, ' ');
        }
    };

    public static void print(boolean[][] b) {
        System.out.print("  ");
        for (int i = 0; i < b[0].length; i++) {
            System.out.print(i + " ");
        }
        System.out.print("\n");
        for (int i = 0; i < b.length; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < b[0].length; j++) {
                System.out.print(ex11.Bool.get(b[i][j]) + " ");
            }
            System.out.print("\n");
        }
    }

    public static void main(String[] args) {
        boolean[][] matrix = {
                {true, false, true}, {false, true, false}, {true, false, false}
        };
        ex11.print(matrix);
    }
}
