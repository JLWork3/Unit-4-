package nyc.c4q.jvid1;

import java.util.Arrays;

/**
 * JV 10/14
 */
public class Problem2 {

    /* A majority element in an array, A, of size N is an element that
appears more than N / 2 times. */


    public static void main(String[] args) {
        // write your code here


       // System.out.println(majorityElement());

    }

    public static int majorityElement(int[] num) {

        if (num.length == 1) {
            return num[0];
        }

        Arrays.sort(num);
        return num[num.length / 2];
    }
}
