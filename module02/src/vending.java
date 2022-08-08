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
		int quarters = 0;
		int dimes = 0;
		int nickels = 0;
		int pennies = 0;
		
		
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
		change = change - dollars * 100;
		
		quarters = change / 25;
		change = change - quarters * 25;
		
		dimes = change / 10;
		change = change - dimes * 10;
		
		nickels = change / 5;
		change = change - nickels * 5;
		
		pennies = change;
		
		
		
		// Return the difference in the appropriate coinage
		System.out.printf("Your change back is %d dollar coin(s),", dollars);
		System.out.printf(" %d quarter(s),", quarters);
		System.out.printf(" %d dime(s),", dimes);
		System.out.printf(" %d nickel(s)", nickels);
		System.out.printf(" and %d pennies", pennies);
		
		
		in.close();
	}

}
