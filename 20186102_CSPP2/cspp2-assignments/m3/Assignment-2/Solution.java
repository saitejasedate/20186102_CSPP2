
import java.util.Scanner;
/*
	Do not modify this main function.
	*/
public class Solution {
/* Fill the main function to print the number of 7's between 1 to n*/
    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);      
        int n = s.nextInt();
        int i = 7;
        int c = 0;
        while(i<=n){
        	for(;i<=n;i=i+10){
        		c+=2;
        	// System.out.println(i);
        	}
        }System.out.println(2*c);
        
       
        
    }
}