import java.util.Scanner;
public final class Solution {
    /*
    Do not modify the main function
    */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String reverse = reverseString(str);
        System.out.println(reverse);

    }
    //Write reverseString function
    public static String reverseString(final String str) {
        String output = "";
        for (int element = str.length() - 1; element >= 0; element--) {
            output  = output + str.charAt(element);
        } return output;
    }
}
