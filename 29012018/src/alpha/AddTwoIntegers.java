package alpha;

import java.util.Scanner;

public class AddTwoIntegers {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Enter two numbers: ");
		Scanner reader1= new Scanner(System.in);
		Scanner reader2= new Scanner(System.in);
		
		int num1 = reader1.nextInt();
		int num2 = reader2.nextInt();
		int sum = num1 + num2;
		System.out.println("The sum is: " +sum);

		
	}

}
