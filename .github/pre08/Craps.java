import java.util.*;
import java.lang.Math.*;

public class Craps
{
  public static int[] roll()
  {
    int[] die_one = [1,2,3,4,5,6];
    int[] die_two = [1,2,3,4,5,6];

    Random random = new Random();
    int[] dice_values = new int[2];
    dice_values[0] = random.nextInt(die_one.length);
    dice_values[1] = random.nextInt(die_two.length);

    return dice_values;
  }

  public static String shoot(int[] dice_vals)
  {
    String result = "";
    int sum = dice_vals[0] + dice_vals[1];
    if ((dice_vals[0] == 2) || (dice_vals[1] == 2) || 
        (dice_vals[0] == 3) || (dice_vals[1] == 3) || sum == 12)
    {
      result = "lose";
    }
    else if ((sum == 7) || (sum == 11))
    {
      result = "win";
    }
    else
    {
      result = "point";
    }
    return result;
  }

  public static 
  
  public static round()
  {
    int[] dice_numbers = new int[2];
    dice_numbers = roll();
    String player_status = shoot(dice_numbers);
    int number_of_rounds = 1;
    while (player)
  }
  public static void main(String[] args)
  {
    
  }
}