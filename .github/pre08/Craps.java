import java.util.*;
import java.lang.Math.*;

public class Craps
{
  //array sequence will be win, lose, point
  int[] player_data = new int[3];

  public static void setup_player_data()
  {
    this.player_data[0] = 1;
    this.player_data[1] = 1;
    this.player_data[2] = 1;
  }

  public static int[] get_player_data()
  {
    return this.player_data;
  }

  public static void counter(String game_point)
  {
    if (game_point.equals("win"))
    {
      this.player_data[0]++;
    }
    else if (game_point.equals("lose"))
    {
      this.player_data[1]++;
    }
    else if (game_point.equals("point"))
    {
      this.player_data[2]++;
    }
  }
  
  public static int[] roll()
  {
    int[] die_one = {1,2,3,4,5,6};
    int[] die_two = {1,2,3,4,5,6};

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
  
  public static void round()
  {
    int[] dice_numbers = new int[2];
    dice_numbers = roll();
    String player_status = shoot(dice_numbers);
    int number_of_rounds = 1;
  }
  public static void main(String[] args)
  {
    String status = round();
    this.counter(status);
    while (!status.equals("win") || !status.equals("lose"))
    {
      status.round();
      this.counter(status);
    }

    int[] data = this.get_player_data();
    System.out.println("")
  }
}