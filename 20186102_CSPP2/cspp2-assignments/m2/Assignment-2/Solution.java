import java.util.Scanner;
/**
 * { item_description }.
 */
public final class Solution {
    /**
     * { item_description }.
     */
    private Solution() {
        //Constructor is not used
    }
    /*
    Do not modify this main function.
    
    @param      args  The arguments
    */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        roots(a, b, c);
    }
    /*
    Need to write the rootsOfQuadraticEquation function and print the output.
    */
    /**
     * { function_description }.
     *
     * @param      a     { parameter_description }
     * @param      b     { parameter_description }
     * @param      c     { parameter_description }
     */
    public static void roots(final int a, final int b, final int c){
        long d = (b * b) - (2 * 2 * a *c);
        double root1 = (-b + (Math.sqrt(Math.abs(d)))) / (2 * a);
        double root2 = (-b - (Math.sqrt(Math.abs(d)))) / (2 * a);
        System.out.println(root1 + " " + root2);
    }
}
