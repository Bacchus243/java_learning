import java.util.Scanner;

public class Assignment01_Pizza_Party {
    public static void main(String[] args) {  
        // declare and instantiate the Scanner
        Scanner scan = new Scanner(System.in);
        
        // declare and initialize the variables
        
        		// inputs
        int slicesPerPizza = 0;
        int numPizzas = 0;
        int numAdults = 0;
        int numChildren = 0;
        
                
        		// outputs
        int totalSlices = 0;
        int slicesForAdults = 0;
        int slicesForChildren = 0;
        int slicesPerChild = 0;
        int slicesRemaining = 0;
        
                
        // prompt for and collect the inputs
        System.out.print("Number of slices per pizza : ");
        slicesPerPizza = scan.nextInt();
        System.out.print("Number of pizzas purchased : ");
        numPizzas = scan.nextInt();
        System.out.print("Number of adults           : ");
        numAdults = scan.nextInt();
        System.out.print("Number of children         : ");
        numChildren = scan.nextInt();
        System.out.println("\n\n");

        
        // compute the required values
        totalSlices = slicesPerPizza * numPizzas;
        slicesForAdults = 3 * numAdults;        
        slicesForChildren = totalSlices - slicesForAdults;        
        slicesPerChild = slicesForChildren / numChildren;        
        slicesRemaining = slicesForChildren - (slicesPerChild * numChildren);
        
        

        // display the required outputs
        System.out.printf("Total number of slices of pizza               : %d\n", totalSlices);
        System.out.printf("Total number of slices given to adults        : %d\n", slicesForAdults);
        System.out.printf("Total number of slices available for children : %d\n", slicesForChildren);
        System.out.printf("Number of slices each child will get          : %d\n", slicesPerChild);
        System.out.printf("Number of slices left over                    : %d\n", slicesRemaining);        
        
        scan.close();
    }
}