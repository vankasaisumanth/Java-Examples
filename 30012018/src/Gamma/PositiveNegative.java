package Gamma;

import java.util.Scanner;

public class PositiveNegative {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.print("Enter any integer to check: ");
		Scanner reader = new Scanner(System.in);
		Double num = reader.nextDouble();
		if(num < 0.0) {
			System.out.format("Enter Number %.2f is Negative number", num);
		}
		else if(num > 0.0) {
			System.out.format("Enter Number %.2f is Positive number", num);
		}
		else {
			System.out.println("Enter Number is 0");
		}
	}
}
