package a02022018;

import java.util.Scanner;

public class A2ZUsingLoop {
		@SuppressWarnings("resource")
		public static void main(String[] args){
			System.out.println("Printing Alphabets : ");
			System.out.println("1.Capital Letters ");
			System.out.println("2.Small Letters ");
			System.out.println("Choose 1 0r 2 : ");
			Scanner reader = new Scanner(System.in);
			int x = reader.nextInt();
			if(x==1) {
			for(char i= 'A';i<= 'Z'; i++) {
				System.out.print(i+" ");
			}
			}
			else if(x == 2){
				for(char i= 'a';i<= 'z'; i++) {
					System.out.print(i+" ");
				}
			}
			else {
				System.out.println("Invalid Entry");
			}
		}
}
