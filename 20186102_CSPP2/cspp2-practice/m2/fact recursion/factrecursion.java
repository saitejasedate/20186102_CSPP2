import java.util.*;
class factrecursion{
	public static int fact_num(int num){
		int fact_num;
		if(num == 1){
			return 1;
		}
		else
			fact_num = num*fact_num(num-1);
			return fact_num;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println(fact_num(num));
		
	}
}