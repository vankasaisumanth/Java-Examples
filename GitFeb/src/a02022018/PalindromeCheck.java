package a02022018;

import java.util.Scanner;

public class PalindromeCheck{
	@SuppressWarnings("resource")
	public static void main(String[] args){
		System.out.println("Enter a String to check: ");
		Scanner reader = new Scanner(System.in);
		String ch = reader.nextLine();
		String reverse = " ", ch1=" " ;
		
		int length = ch.length();
	
		for(int i= length-1  ; i>=0 ; i--) {
			 reverse = reverse + ch.charAt(i);
			
		}
		
		System.out.println(" Reverse  is" +reverse);
		if(ch1.equals (reverse)) {
		System.out.println("it is a palindrome");}
		else {
			System.out.println("It is not a palindrome");
		}
		
	}
}