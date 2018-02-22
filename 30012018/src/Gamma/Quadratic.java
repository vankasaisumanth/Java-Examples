package Gamma;

import java.util.Scanner;

public class Quadratic {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Enter a, b, c in equation ax^2+bx+c: ");
		System.out.print("a : ");
		Scanner reader = new Scanner(System.in);
		Double a = reader.nextDouble();
		System.out.print("b : ");
		Scanner reader1 = new Scanner(System.in);
		Double b = reader1.nextDouble();
		System.out.print("c : ");
		Scanner reader2 = new Scanner(System.in);
		Double c = reader2.nextDouble();
		
		
		Double det = b * b - 4*a*c;
		Double root1, root2;
		// condition for real and different roots
        if(det > 0) {
            root1 = (-b + Math.sqrt(det))/(2*a);
            root2 = (-b - Math.sqrt(det))/(2*a);
            
            System.out.format("root1 = %.2f, root2 = %.2f", root1, root2);
        }
            // Condition for real and equal roots
        else if(det == 0) {
            root1 = root2 = -b / (2 * a);

            System.out.format("root1 = root2 = %.2f;", root1);
        }
        // If roots are not real
        else {
            double realPart = -b / (2 *a);
            double imaginaryPart = Math.sqrt(-det) / (2 * a);

            System.out.format("root1 = %.2f+%.2fi and root2 = %.2f-%.2fi", realPart, imaginaryPart, realPart, imaginaryPart);
        }
	}
}
