package alpha;

import java.util.Scanner;

public class AsciiValue {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Enter the number to display its ascii character: ");
		Scanner reader = new Scanner(System.in);
		int val = reader.nextInt();
		char ch = (char) val;
		System.out.println("the ascii charac of "+val+" is "+ch);
		System.out.println("--------------------------------------");
		
		System.out.println("Enter the character to display its ascii value: ");
		Scanner reader1 = new Scanner(System.in);
		char ch1 = reader1.next().charAt(0);
		int val1 = (int) ch1 ;
		System.out.println("the ascii value of "+ch1+ " is "+val1);
		
		
	}
}
