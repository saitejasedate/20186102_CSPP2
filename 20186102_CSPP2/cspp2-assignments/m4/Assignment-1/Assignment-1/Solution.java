
import java.util.*;
public class Solution
{/*
	Fill this main function to print maximum of given array
	*/
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		// System.out.println("Enter the size of an array:");
		int array_size = sc.nextInt();
		int[] array = new int[array_size];
		// System.out.println("Enter elements of an array:");
		for (int i = 0; i < array_size; i++) {
			array[i] = sc.nextInt();
		}
		int max = array[0];
		for (int i = 0; i < array_size; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		System.out.println(max);

	}
}
