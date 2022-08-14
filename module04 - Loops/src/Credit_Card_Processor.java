
import java.util.Scanner;

public class Credit_Card_Processor {

	public static void main(String[] args) {
		// Inputs
				// this section is going to initialize the variables and prompt the user for starting values is required
		
		Scanner in = new Scanner(System.in);
		String cardNum = "";
		String correctedNum = "";
		
		System.out.print("Enter your credit card number: ");
		cardNum = in.nextLine();
				
		// Processing
			// Loop: for loop to count through the total length of the input
		
		for (int index = 0; index < cardNum.length(); index++) {
			char currentChar = cardNum.charAt(index);
					
			switch (currentChar) {
			case '0':
				correctedNum = correctedNum + currentChar;
				break;
			case '1':
				correctedNum = correctedNum + currentChar;
				break;
			case '2':
				correctedNum = correctedNum + currentChar;
				break;
			case '3':
				correctedNum = correctedNum + currentChar;
				break;
			case '4':
				correctedNum = correctedNum + currentChar;
				break;
			case '5':
				correctedNum = correctedNum + currentChar;
				break;
			case '6':
				correctedNum = correctedNum + currentChar;
				break;
			case '7':
				correctedNum = correctedNum + currentChar;
				break;
			case '8':
				correctedNum = correctedNum + currentChar;
				break;
			case '9':
				correctedNum = correctedNum + currentChar;
				break;
			}
		}		
		// Outputs
				// print statement to show the user their credit card with only numbers used
		
		System.out.println(correctedNum);		
		in.close();
	}

}
// if (currentChar != ' ' && currentChar != '-') {
// 		correctedNum = correctedNum + currentChar;