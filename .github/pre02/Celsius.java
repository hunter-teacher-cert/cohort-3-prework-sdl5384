import java.util.*;

public class Celsius
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a temperature in Celsius:");
    int tempInCelsius = input.nextInt();
    double tempInFahrenheit = (double)tempInCelsius*(9/5)+32;
    input.nextLine();

    System.out.printf(tempInCelsius + " C = %.1f", tempInFahrenheit);
    System.out.print(" F");
  }
}