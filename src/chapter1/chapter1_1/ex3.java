package chapter1.chapter1_1;

public class ex3 {
    //编写一段程序，从命令行得到三个整数参数。如果他们都相等打印equal，否则打印not equal
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]) ,b = Integer.parseInt(args[1]),c = Integer.parseInt(args[2]);
        if(a == b && b == c){
            System.out.println("equal");
        }else {
            System.out.println("not equal");
        }
    }
}
