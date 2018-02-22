package alpha;

import java.util.Scanner;

public class PrintInt {
	public static void main(String[] args)
	{
		System.out.println("Enter the number to print:");
		@SuppressWarnings("resource")
		Scanner reader = new Scanner(System.in);
		int number = reader.nextInt();
		System.out.println("you have entered : " + number);
	}
}
