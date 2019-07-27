package chapter1.chapter1_1;

public class ex9 {
    public static String intToBinary(int N) {
        if(N == 0){
            return "0";
        }
        int num = (int) (Math.log((double) N) / Math.log(2.0)) + 1;
        char[] s = new char[num];
        StringBuffer str = new StringBuffer();
        for (int i = 0; i < num; i++) {
            s[i] = (char) (N % 2 + 48);
            N /= 2;
        }
        for (int i = num - 1; i >= 0; i--) {
            str.append(s[i]);
        }
        return str.toString();
    }

    public static void main(String[] args) {
        for(int i = 0;i<512;i++){

            String s = ex9.intToBinary(i);
            System.out.println(s);
        }
    }
}
