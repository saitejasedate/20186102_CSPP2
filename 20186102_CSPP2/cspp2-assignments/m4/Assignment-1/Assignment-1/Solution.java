/**
 * largest of elements in an array.
 */
import java.util.Scanner;
class Solution {
    /*
    Fill this main function to print maximum of given array.
    */
    public static void main(final String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the size of an array:");
        int arraysize = sc.nextInt();
        int[] array = new int[arraysize];
        // System.out.println("Enter elements of an array:");
        for (int i = 0; i < arraysize; i++) {
            array[i] = sc.nextInt();
        }
        int max = array[0];
        for (int i = 0; i < arraysize; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println(max);

    }
}
