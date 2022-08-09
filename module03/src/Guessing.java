
//-----------------------------------------------------------------
//  Plays a simple guessing game with the user.
//-----------------------------------------------------------------

import java.util.*;  // the .* notation will pull everything from the utility library


public class Guessing
{

   public static void main (String[] args)
   {
      final int MAX = 10;
      int answer, guess;
      
      
      
      Random generator = new Random();      //'generator' is an object that can create random numbers, because it is of the class 'Random'. This is an object instantiation.
      answer = generator.nextInt(MAX) + 1;  //creates a random number and stores it in 'answer'.
      
      
      
      System.out.print ("I'm thinking of a number between 1 and " + MAX + ". Guess what it is: "); //prompts the user for a number.
      
      
      
      Scanner in = new Scanner(System.in);  //'in' is an object of class 'Scanner', this is an object instantiation.
      guess = in.nextInt();
      
      
      
      if (guess == answer)
         System.out.println ("You got it! Good guessing!");
      else
      {
         System.out.println ("That is not correct, sorry.");
         System.out.println ("The number was " + answer);
      }
      
      
      
      in.close();
   }
}