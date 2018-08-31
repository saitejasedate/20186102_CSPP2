/**Given an String, Write a java method that returns
the decimal value for the given binary string.*/

import java.util.Scanner;
/**
 * author : saiteja.
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {
        //empty constructor.
    }
    /**
     * Main method.
     *
     * @param      args  The arguments.
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberofinputs = sc.nextInt();
        for (int i = 0; i < numberofinputs; i++) {
            String s = sc.next();
            String res = binaryToDecimal(s);
            System.out.println(res);
        }
    }
    /**
     * binaryToDecimal method.
     *
     * @param      output  The output.
     *
     * @return     { description_of_the_return_value }.
     */
    static String binaryToDecimal(final String output) {
        String str = "";
        int sum = 0;
        for (int i = output.length() - 1; i >= 0; i--) {
            if (output.charAt(i) == '1') {
                sum = sum + (int) Math.pow(2, output.length() - i - 1);
            }
        }
        str += sum;
         return str;
    }
}
