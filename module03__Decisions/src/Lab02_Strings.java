
import java.util.Scanner;


public class Lab02_Strings {
   
    public static void main(String[] args) {
        
    	// declare variables of different types:
        String firstName = "";
        String lastName = "";
        String fullName = "";
        int nameLength;
        Scanner scan = new Scanner(System.in);
        
        
        // Use Scanner to ask the user for first name
        System.out.print("Please enter first name: ");
        firstName = scan.nextLine();
       
        
        // Use Scanner to ask the user for last name
        System.out.print("Please enter last name: ");
        lastName = scan.nextLine();
 
        
        // Add firstName to lastName variables using "+" sign, don't forget the space.
        fullName = firstName + " " + lastName;
     
        
        // Convert fullName variable to upper case
        fullName = fullName.toUpperCase();
        
        
        // Find the length of fullName and store it
        nameLength = fullName.length();
     
        
        // Print fullName, it should be in upper case
        System.out.print("Full name (in capitals) : ");
        System.out.println(fullName);
        
        
        // Print nameLength, this should be number of characters
        System.out.print("Length of full name: ");
        System.out.println(nameLength);
        
        
        // Define two String variables, title1 and title2 using String constructor to initialize them
        String title1 = new String("cse110");
        String title2 = "cse110";
        
        
        // Compare the two strings and print which one of the two ways works
        if ( title1 == title2) {
        	System.out.println("String comparison using \"==\" sign works");
        }
        else {
        	System.out.println("String comparison using \"==\" does NOT work");
        }
        
        if ( title1.equals(title2)) {
        	System.out.println("String comparison using \"equals\" method works");
        }
        else {
        	System.out.println("String comparison using \"equals\" method does NOT work");
        }
        
        scan.close();
    } //end main method
} //end Lab2 class