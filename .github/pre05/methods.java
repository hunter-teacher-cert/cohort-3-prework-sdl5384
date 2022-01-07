import java.util.*;

public class methods
{
  public static boolean isDivisible(int n, int m)
  {
    int checkResult;
    checkResult = n%m;

    if (checkResult == 0)
    {
      return true;
    }
    else
      return false;
  }

  public static boolean isTriangle(int sideOne, int sideTwo, int sideThree)
  {
    if ((sideOne > sideTwo+sideThree) || (sideTwo > sideOne+sideThree) || (sideThree > sideOne+sideTwo))
    {
      return false;
    }
    else
      return true;
  }

  public static int ack(int m, int n)
  {
    int ackerman = 0;
    if (m == 0)
    {
      ackerman = n + 1;
    }
    else if (m > 0 && n == 0)
    {
      ackerman = ack(m-1,1);
    }
    else if (m > 0 && n > 0)
    {
      ackerman = ack(m-1,ack(m,n-1));
    }
    else
    {
      System.out.println("Function not defined for values provided as input.");
    }

    return ackerman;
  }

  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter a value for n and m.");
    System.out.print("n = ");
    int n = input.nextInt();

    System.out.print("m = ");
    int m = input.nextInt();

    System.out.println("Give three values for the triangle test.");
    int side_one, side_two, side_three;

    System.out.print("Side 1 = ");
    side_one = input.nextInt();
    System.out.println();
    System.out.print("Side 2 = ");
    side_two = input.nextInt();
    System.out.println();
    System.out.print("Side 3 = ");
    side_three = input.nextInt();
    System.out.println();

    boolean divisibility = isDivisible(n,m);
    boolean triangularity = isTriangle(side_one,side_two,side_three);
    int ackermanResult = ack(m,n);

    System.out.print("m divides n: ");
    System.out.println(divisibility);
    System.out.print("The 3 sides create a triangle? ");
    System.out.println(triangularity);
    System.out.print("Ackerman result: ");
    System.out.print(Integer.toString(ackermanResult));
  }
}