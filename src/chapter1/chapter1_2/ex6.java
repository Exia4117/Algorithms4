package chapter1.chapter1_2;

public class ex6 {
//    public static boolean isCircular(String s, String t) {
//        if (s.length() != t.length()) {
//            return false;
//        }
//        for (int i = 0; i < t.length(); i++) {
//            if (t.charAt(i) == s.charAt(0)) {
//                String t1 = t.substring(0, i);
//                String t2 = t.substring(i);
//                if ((t2 + t1).equals(s)) {
//                    return true;
//                }else {
//                    continue;
//                }
//            }
//        }
//        return false;
//    }

    public static boolean isCircular(String s, String t) {
        return (s.length() == t.length() && (t + t).contains(s));
    }

    public static void main(String[] args) {
        String s = "sdsdsds";
        String t = "ssdsdsd";
        System.out.println(isCircular(s,t));
    }
}
