import java.util.Scanner;

public class vending 
{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		// Declare variables
		
			// inputs
		int payment = 0;
		int price = 0;
		
			// outputs
		int change = 0;
		int dollars = 0;
		int cents = 0;
		int quarters = 0;
		
		
		
		// What is the customer purchasing? 
		System.out.print("What denomination bill are you paying with: ");
		payment = in.nextInt();
		
		System.out.print("What is the price in pennies of the item you would like to purchase: ");
		price = in.nextInt();
		
//		System.out.println(payment);
//		System.out.println(price);
		
//		price = price/100;
//		System.out.println(price);
		
		
		// Find the change
		change = payment * 100 - price;
//		System.out.println(change);
		dollars = change / 100;
		cents = change % 100;
		quarters = cents / 25;
		
		// Return the difference in the appropriate coinage
		System.out.println("Your change is " + dollars + " dollars and " + quarters + " quarters");
		
		System.out.printf("Your change back is %d dollar coin(s)", dollars);
		System.out.printf(" and %d quarter(s).%n", quarters);
		
		
		in.close();
	}

}
