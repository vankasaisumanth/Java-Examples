package Alpha;

import java.util.Scanner;

public class FibonacciSeries {
		@SuppressWarnings("resource")
		public static void main(String[] args) {
			System.out.println("Enter no. of numbers you want in the fibonacci series");
			Scanner reader = new Scanner(System.in);
			int num = reader.nextInt();
			int t1 = 0, t2 = 1;
			int sum =0, total= t1 + t2;
			System.out.print(t1+" + " +t2);
			for(int i =2 ; i<num ;i++) {
			 sum = t1 + t2;
				System.out.print(" + "+sum);
				t1 = t2;
				t2 = sum;
				total += sum; 
			}
			System.out.println(" ");
			System.out.print("Sum of Fibonacci series of "+num+" numbers is "+total);
		}
}
