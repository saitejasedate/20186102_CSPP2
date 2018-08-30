import java.util.*;
public class average{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		double avg = 0;
		System.out.println("enter the size of an array:");
		int array_size = sc.nextInt();
		int[] array = new int[array_size];
		System.out.println("enter the elements into an array");
		for(int i = 0; i < array_size; i++){
			array[i] = sc.nextInt();
		}System.out.println(Arrays.toString(array));
		for(int num : array) {
			sum = sum + num;
		} avg = sum/array.length;
		System.out.println("avg of the elements in an array is: "+avg);
	}
}