package Gamma;

import java.util.Scanner;

public class Largest {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Enter Number 1 n1: ");
		Scanner reader1 = new Scanner(System.in);
		float n1 = reader1.nextFloat();
		
		System.out.println("Enter Number 2 n2: ");
		Scanner reader2 = new Scanner(System.in);
		float n2 = reader2.nextFloat();
		
		System.out.println("Enter Number 3 n3: ");
		Scanner reader3 = new Scanner(System.in);
		float n3 = reader3.nextFloat();
		
		if(n1>=n2 && n1>=n3)
		{
			System.out.println("The largest number among three is "+n1);
		}
		
		else if(n2>=n3)
		{
			System.out.println("The largest number among three is "+n2);
		}
		
		else 
		{
			System.out.println("The largest number among three is "+n3);
		}
	}

}
