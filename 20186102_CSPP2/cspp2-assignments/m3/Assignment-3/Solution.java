import java.util.Scanner;
/*
    Do not modify this main function.
    */
public class Solution {
    /*
     * { function_description }
     *
     * @param      args  The arguments
     */

    public static void main(final String[] args) {

        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        System.out.println(gcd(n1, n2));
    }
    /*
    Need to write the gcd function and print the output.
    */

    /**
     * { function_description }.
     *
     * @param      a     { parameter_description }.
     * @param      b     { parameter_description }.
     *
     * @return     { description_of_the_return_value }.
     */
    public static int gcd(final int a, final int b) {
        if (a == b) {
            return a;
        } else if (a == 0) {
            return b;
        } else if (b == 0) {
            return a;
        } else if (a > b) {
            return gcd(a % b, b);
        } else {
            return gcd(a, b % a);
        }
    }
}
