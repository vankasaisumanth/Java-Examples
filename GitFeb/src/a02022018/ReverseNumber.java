package a02022018;

import java.util.Scanner;

public class ReverseNumber {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Enter a number to reverse it : ");
		Scanner reader = new Scanner(System.in);
		int num = reader.nextInt();
		int reverse = 0;
		while (num != 0) {
			reverse = reverse * 10 + num % 10;
			num = num / 10;
		}
		System.out.println("the reversed number is "+ reverse);
}
}
