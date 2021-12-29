import java.util.*;
//import java.Random.*;
import java.lang.Math.*;

public class Guess
{
  public static void main(String[] args)
  {
    System.out.println("I'm thinking of a number between 1 and 100 (including both).  Can you guess what it is?");
    System.out.print("Guess a number: ");

    Scanner input = new Scanner(System.in);
    int userGuess = input.nextInt();
    input.nextLine();
    System.out.println("Your guess was: " + userGuess);

    Random random = new Random();
    //pick a random value
    int number = random.nextInt(100)+1;

    /*to account for if the difference is negative
    I just thought this would be easier to do because another way of doing it would be to use a conditional where if we did subtracted the userGuess from the random value or vice versa.
    */
    int diff = Math.abs(number - userGuess);

    System.out.println("The number I was thinking of is: " + number);
    System.out.println("You were off by " + diff);
  }
}