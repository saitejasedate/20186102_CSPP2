import java.util.*;
public class comparearr{
	public static void main(String[] args) {
		int elements;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array:");
		int array_size = sc.nextInt();
		System.out.println("Enter the elements of an array:");
		int[] array = new int[array_size];
		for(int i = 0; i < array_size; i++){
			array[i] = sc.nextInt();
		}
		if(array[0] == 6) {
			System.out.println("true");
		} else if(array[array.length - 1] == 6){
			System.out.println("true");
		} else{
			System.out.println("false");
		}
		
	}
}