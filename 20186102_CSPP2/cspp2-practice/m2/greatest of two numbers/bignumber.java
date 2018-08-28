
import java.util.*;
class bignumber{
	static void big(int varA,int varB){
		if(varA>varB){
			System.out.println("bigger"); 
		}
		else if(varA == varB){
			System.out.println("equal");
		}
		else{
			System.out.println("smaller");
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int varA = scan.nextInt();
		int varB = scan.nextInt();
		big(varA,varB);
		
	}
}