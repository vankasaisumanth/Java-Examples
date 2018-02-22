package Gamma;

import java.util.Scanner;

public class Alphabet {
	 @SuppressWarnings("resource")
		public static void main(String[] args) {
	    	System.out.print("Enter something to check alphabet validity: ");
	    	Scanner reader = new Scanner(System.in);
	    	char ch = reader.next().charAt(0);
	    	if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch<= 'Z'))
	    			{
	    			System.out.format("Entered letter '%c' is an Alphabet",ch);
	    			}
	    	else {
	    		System.out.format("Entered letter '%c' is not an alphabet", ch);
	    	}
	    	
	    }
}
