// Name: Trenton Meryhew
// filename: Lab01_Average_Grade_Calculator

import java.util.Scanner;

public class Lab01_Average_Grade_Calculator 
{
	public static void main(String[] args) 
	{
		double test1 = 0;
		double test2 = 0;
		double test3 = 0;
		final double NUM_TESTS = 3;
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Plz input test 1 score: ");
		test1 = in.nextDouble();
//		System.out.println("Your test 1 is " + test1);
		
		System.out.print("Plz input test 2 score: ");
		test2 = in.nextDouble();
//		System.out.println("Your test 2 is " + test2);
		
		System.out.print("Plz input test 3 score: ");
		test3 = in.nextDouble();
		// -->
		
		double avg;
		avg = (test1 + test2 + test3) / NUM_TESTS;
		System.out.println("Your avg is " + avg);
		
		in.close();
	}
}
