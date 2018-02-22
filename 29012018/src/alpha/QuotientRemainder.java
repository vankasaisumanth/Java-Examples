package alpha;

import java.util.Scanner;

public class QuotientRemainder {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Enter the dividend: ");
		Scanner reader1 = new Scanner(System.in);
		int dividend = reader1.nextInt();
		System.out.println("Enter the divisor: ");
		Scanner reader2 = new Scanner(System.in);
		int divisor = reader2.nextInt();
		if(divisor == 0)
		{
			System.out.println("division cant be done ");
		}
		else {
		int Quotient = dividend / divisor ;
		int remainder = dividend % divisor ;
		System.out.println("Quotient ="+Quotient+" \nRemainder = "+remainder);
		}
		
	}
}
