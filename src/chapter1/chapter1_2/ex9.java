package chapter1.chapter1_2;

import edu.princeton.cs.algs4.Counter;
import edu.princeton.cs.algs4.In;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

import java.util.Arrays;

public class ex9 {
    public static int rank(int key, int[] a, Counter counter) {
        counter.increment();
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (key < a[mid]) hi = mid - 1;
            if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }

    public static void main(String[] args){
        int[] whitelist = In.readInts(args[0]);
        Arrays.sort(whitelist);
        Counter counter = new Counter("key");
        while(!StdIn.isEmpty()){
            int key = StdIn.readInt();
            if(rank(key,whitelist,counter) < 0){
                StdOut.println(key);
            }
        }
        System.out.println(counter);
    }
}

