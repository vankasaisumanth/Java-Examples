package alpha;

import java.util.Scanner;

public class EvenOdd {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.print("Enter a number: ");
		Scanner reader = new Scanner(System.in);
		int num = reader.nextInt();
		if(num%2==0) {
			System.out.println(num+" is even");
		}
		else {
			System.out.println(num+" is odd");
		}
	}
}
