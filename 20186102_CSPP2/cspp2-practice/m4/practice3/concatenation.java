import java.util.Scanner;
class concatenation{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = "Hello ";
		String str2 = sc.nextLine();
		System.out.println(str1.concat(str2));
	}
}