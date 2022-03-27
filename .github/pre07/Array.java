import java.lang.Math.*;
import java.util.*;

public class Array
{
  public static double[] powArray(double[] a, int power)
  {
    double results[] = new double[a.length];
    for (int i = 0; i < a.length; i++)
    {
      results[i] = Math.pow(a[i],power);
    }
    return results;
  }

  public static int[] generateValueArray(int size)
  {
    Random random = new Random();
    int[] values = new int[size];
    for (int i = 0; i < values.length; i++) 
    {
        values[i] = random.nextInt(99);
    }
    return values;
  }
  
  public static int counter(int[] data, int target)
  {
    int i;
    int occurrences = 0;
    for (i = 0; i < data.length; i++)
    {
      if (data[i] == target)
        occurrences++;
    }
    return occurrences;
  }

  public static int inRange(int[] data, int min, int max) 
  {
    int count = 0;
    for (int i = 0; i < data.length; i++) {
        if (data[i] >= min && data[i] < max) {
            count++;
        }
    }
    return count;
  }
         
  public static void histogram(int[] vals)
  {
    int[] counters = new int[10];
    for (int i = 0; i < counters.length; i++)
    {
      for (int j = 0; j < vals.length; j++)
        counters[i] = inRange(vals, 10*i, 10*(i+1));
    }

    for (int k = 0; k < counters.length; k++)
    {
      System.out.print(counters[k] + ", ");
    }
  }

  public static void main(String[] args)
  {
    int[] randomData = generateValueArray(100);
    Scanner input = new Scanner(System.in);
    histogram(randomData);

    System.out.println("Enter your power.");
    int p = input.nextInt();
    
    double[] someArray = new double[5];
    int i;
    for (i = 0; i < someArray.length; i++)
    {
      someArray[i] = i+1;
      System.out.println(someArray[i]);
    }
    double[] squares = new double[someArray.length];
    for (i = 0; i < someArray.length; i++)
    {
      squares = powArray(someArray, p);
      System.out.println(squares[i]);
    }
  }
}