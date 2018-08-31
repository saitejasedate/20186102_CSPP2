import java.util.Scanner;
/**
 * @saiteja
 */
public final class Solution {
    /**
     * Constructs the object.
     */
    private Solution() {

    }
    
    /**
     * { function_description }.
     *
     * @param      args  The arguments
     */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String reverse = reverseString(str);
        System.out.println(reverse);

    }
    //
    // Write reverseString function.
    //
    // @param      str   The string.
    //
    // @return     { description_of_the_return_value }
    //
    public static String reverseString(final String str) {
        String output = "";
        for (int element = str.length() - 1; element >= 0; element--) {
            output  = output + str.charAt(element);
        } return output;
    }
}
