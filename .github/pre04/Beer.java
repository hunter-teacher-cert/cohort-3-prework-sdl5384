import java.util.*;

public class Beer
{
  public static void singAndCountBeers(int beersLeft)
  {
    if (beersLeft == 0)
    {
      System.out.println("No bottles of beer on the wall,");
      System.out.println("no bottles of beer,");
      System.out.println("ya' can't take one down, ya' can't pass it around,");
      System.out.println("'cause there are no more bottles of beer on the wall!");
    }
    else
    {
      System.out.println(beersLeft + " bottles of beer on the wall,");
      System.out.println(beersLeft + " bottles of beer,");
       System.out.println("ya' take one down, ya' pass it around,");
       System.out.println(Integer.toString(beersLeft - 1) + " bottles of beer on the wall.");
       singAndCountBeers(beersLeft - 1);
    }
  }

  public static void main(String[] args)
  {
    singAndCountBeers(99);
  }
}