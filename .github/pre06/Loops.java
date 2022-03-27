import java.util.*;
import java.lang.Math.*;

public class Loops
{
  //for number 2
  public static double squareRoot(double value)
  {
    double guess = value/2;
        
    while (difference > 0.0001)
    {
        second_guess = (initial_guess + value/initial_guess)/2;
      
        root = (second_guess + value/second_guess);
        difference = Math.abs(second_guess - root);
    }
    return root;
  }
  //for number 3
  public static double power(double base, int exponent)
  {
    double val = 1.0;
    if (exponent == 0)
      val = 1;
    else
    {
      int i;
      for (i = 0; i <= exponent; i++)
      {
        val = val*base;
      }
    }

    return val;
  }

  //for number 4
  public static long factorial(int n)
  {
    long fact = 1;
    int i = 1;
    for (i = 1; i <= n; i++)
    {
      fact = fact*(long)i;
    }

    return fact;
  }

  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);

    long f = factorial(9);
    System.out.println(f);

    System.out.print("Enter base value: ");
    double base = input.nextDouble();

    System.out.print("Enter your exponent: ");
    int _power = input.nextInt();

    double value = power(base, _power);
    System.out.println(value);

    System.out.println("Enter the number you want to find the square root of a number.");
    double square_root = squareRoot(input.nextDouble());
    System.out.println(square_root);
  }
}