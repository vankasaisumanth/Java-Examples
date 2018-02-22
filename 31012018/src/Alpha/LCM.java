package Alpha;

import java.util.Scanner;

public class LCM {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Enter any two numbers to get lcm: ");
		Scanner reader = new Scanner(System.in);
		int n1 = reader.nextInt();
		Scanner reader1 = new Scanner(System.in);
		int n2 = reader1.nextInt();
		boolean camp = true;
		int i=1;
		while(camp) {
			if(i%n1==0 && i%n2==0) {
				//camp = true;
				System.out.println(i+" is the LCM of"+n1+" and "+n2);
				break;
			}
			i++;
		}
}
}
