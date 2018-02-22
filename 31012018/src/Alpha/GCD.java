package Alpha;

import java.util.Scanner;

public class GCD {
	 @SuppressWarnings("resource")
	public static void main(String[] args) {
		 System.out.println("Enter any two numbers to find GCD: ");
		 	Scanner reader = new Scanner(System.in);
		 	int n1 = reader.nextInt();
		 	Scanner reader1 = new Scanner(System.in);
		 	int n2 = reader1.nextInt();
	        int gcd = 1;

	        for(int i = 1; i <= n1 && i <= n2; ++i)
	        {
	            // Checks if i is factor of both integers
	            if(n1 % i==0 && n2 % i==0)
	                gcd = i;
	        }

	        System.out.printf("G.C.D of %d and %d is %d", n1, n2, gcd);
	    }
}
