package a02022018;

import java.util.Scanner;

public class PowerImplement {
	public static void main(String[] args) {
		System.out.println("Enter the base and exponent : ");
		Scanner reader1 = new Scanner(System.in);
		int base = reader1.nextInt();
		Scanner reader = new Scanner(System.in);
		int exp = reader.nextInt();
		int result =1;
		for(int i =0; i<exp ; i++) {
			result = result * base;
		}
		System.out.println(base+ " pow "+exp+" is "+result);
	}
}
