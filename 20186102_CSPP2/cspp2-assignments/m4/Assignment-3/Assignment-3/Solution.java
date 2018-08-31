
// Given an String, Write a java method that returns the decimal value for the given binary string.

import java.util.Scanner;
public class Solution {
    /*
    Do not modify this main function.
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
    static String binaryToDecimal(final String output) {
        String str = "";
        int sum = 0;
        for (int i = output.length()-1; i >= 0; i--) {
            if (output.charAt(i) == '1') {
                sum = sum + (int) Math.pow(2, output.length() - i - 1);
            }
        }
        str += sum;
        return str;
    }
}
