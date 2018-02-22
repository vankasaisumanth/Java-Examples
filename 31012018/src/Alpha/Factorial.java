package Alpha;

import java.util.Scanner;

public class Factorial {
	@SuppressWarnings( "resource")
	public static void main(String[] args) {
		System.out.println("Enter the number to get its factorial : ");
		Scanner reader = new Scanner(System.in);
		int n = reader.nextInt();
		int fact =1;
		for(int i=1; i<=n ;i++) {
			fact *= i ;
		}
		System.out.println(fact +" is the factorial of "+n);
	}
}
