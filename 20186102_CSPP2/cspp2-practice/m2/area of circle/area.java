import java.util.*;
public class area{
	static double pi(){
		return 3.14;
	}
	static double area(double r){
		return pi() * r * r;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double r = scan.nextInt();
		System.out.println(area(r));
		
	}
} 