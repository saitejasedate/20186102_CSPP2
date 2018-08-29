import java.util.Scanner;
/**
 *do not modify this main function.
 *
 */
public final class Solution {
    /**
     * Private constructor.
     */
    private Solution() {
    //We are not using this constructor.
    }
    /**
    *@variable TEN variable.
    */
    private static final int TEN = 10;
    /**
    *@variable SEVEN variable.
    */
    private static final int SEVEN = 7;
     /**
      * { function_description }.
      *
      * @param      args  The arguments
      */
    public static void main(final String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int count = 0;
        for (int i = 1; i < n; i++) {
            int a = i;
            while (a != 0) {
                int k = a % TEN;
                a = a / TEN;
                if (k == SEVEN) {
                    count += 1;
                }
            }
        }
        System.out.println(count);
    }
}



