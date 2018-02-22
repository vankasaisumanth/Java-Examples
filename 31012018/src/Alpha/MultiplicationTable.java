package Alpha;

import java.util.Scanner;

public class MultiplicationTable {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.print("Enter a number to Get Multiplication Table of it: ");
		Scanner reader = new Scanner(System.in);
		int num = reader.nextInt();
		for(int i=1;i<=10;i++) {
			System.out.printf("%d x %d = %d",num,i,num*i);
			System.out.println("");
		}
	}
}
