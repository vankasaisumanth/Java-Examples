package Gamma;

import java.util.Scanner;

public class LeapYear {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		System.out.println("Enter a Year to check: ");
		Scanner reader = new Scanner(System.in);
		int year = reader.nextInt();
		boolean leap = false ; 
		if(year%4 == 0)
				{
					if(year % 100 ==0) 
					{
						if(year % 400 == 0) 
						{
							leap = true;
						}
						else 
						{
							leap = false;
						}
					}
					else 
					{
						leap = true;
					}
				}
			else 
			{
				leap = false;
			}
		if(leap) {
		System.out.println(year+ " is a leap year");
		}
		else {
			System.out.println(year+ " is not a leap year");
			}
		
		}
}
