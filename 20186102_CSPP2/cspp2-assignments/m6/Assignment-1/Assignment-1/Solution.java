import java.util.Scanner;
/**
 * Write a java program to find the odd composite numbers
 * between 2 and n where n is given as an input.
 *
 * @author :saiteja
 */
public final class Solution {
    /**
    * Empty constructor.
    */
    private Solution() {
        //not used
    }
    /**
     * Prints the odd composite numbers between 2 and n.
     *
     * @param      n     n value
     */
    static void oddComposites(final int n) {
        final int nine = 9;
        for (int number = nine; number <= n; number++) {
            int count = 1;
            for (int i = 2; i < number / 2; i++) {
                if (number % i == 0) {
                    count = 0;
                    break;
                }
            }
            if (count == 0 && number % 2 != 0) {
                System.out.println(number);
            }
        }
        }
    /**
    * main method as driver program.
    * @param args is the parameter for this method
    */
    public static void main(final String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        oddComposites(n);
    }
}



