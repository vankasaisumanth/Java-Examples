package a02022018;

import java.util.Scanner;

public class CountNumOfDigits {
		@SuppressWarnings("resource")
		public static void main(String[] args) {
			System.out.println("Enter a number to count number of digits in the number : ");
			Scanner reader = new Scanner(System.in);
			int num = reader.nextInt();
			int count = 0;
			while (num != 0) {
				num = num / 10;
				count++;
			}
			System.out.println("No. of digits in the number is "+count);
		}
}
