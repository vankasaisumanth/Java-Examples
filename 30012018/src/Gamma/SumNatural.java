package Gamma;

import java.util.Scanner;

public class SumNatural {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Enter the number to get natural numbers sum untill that number n: ");
		Scanner reader = new Scanner(System.in);
		int num = reader.nextInt();
		int sum = 0;
		// loop until num  iteratively
		for(int i=0; i <= num ;i++) {
			sum += i; //Do sum = sum + i
		}
		System.out.format("Natural number Sum until %d is %d",num,sum);
	}
}
