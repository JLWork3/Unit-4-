package nyc.c4q.jvid1;

/**
 * J.V 10/13
 */
public class BaseExp {

    /* Question: Show that X^62 can be computed with only 8 multiplications */

    public static void main(String[] args) {
        // write your code here

        //Test
        System.out.println(numToExPower(1,62));

    }

    //Create a method that will loop

    public static int numToExPower( int base, int exponent ){
        int result =1;
        if (exponent== 0){
            return 1;
        }
        while (exponent !=1){
            if (exponent % 2 ==1){
                result *=base;
            }
            base *=base;
            exponent /=2;
        }
        return result * base;
    }
}
