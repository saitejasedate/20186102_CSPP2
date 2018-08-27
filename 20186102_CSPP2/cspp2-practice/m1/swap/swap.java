public class swap{
	public static void main(String[] args) {
		System.out.println("before swap");
		int a = 5;
		System.out.println(a);
		int b = 10;
		System.out.println(b);
		int temp;
		temp = a;
		a = b;
		b = temp;
		System.out.println("after swap");
		System.out.println(a);
		System.out.println(b);
	}
}