import java.util.*;
import java.lang.Math.*;

public class Craps
{
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

  public static Object[] shoot(int[] dice_vals)
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
    System.out.println("You have rolled a " + dice_vals[0] + " and a " + dice_vals[1]);
    System.out.println("Your dice sum is " + sum);

    Object[] game_result = {result, dice_vals[0], dice_vals[1]};
    return game_result;
  }
  
  public static void round()
  {
    int[] dice_numbers = new int[2];
    dice_numbers = roll();
    String player_status = shoot(dice_numbers);
  }

  public static int[] counter(String game_point)
  {
    //array sequence is Win, Lose, Point
    int[] player_data = new int[3];
    player_data[0] = 1;
    player_data[1] = 1;
    player_data[2] = 1;
    if (game_point.equals("win"))
      player_data[0]++;
    else if (game_point.equals("lose"))
      player_data[1]++;
    else if (game_point.equals("point"))
      player_data[2]++;

    return player_data;
  }
  
  public static void main(String[] args)
  {
    Object[] status = round();
    int sum = status[1] + status[2];
    this.counter(status[0]);
    while (!status[0].equals("win") || !status[0].equals("lose"))
    {
      status = round();
      counter(status[0]);
      if (status.equals("point"))
      {
        status = round();
        counter(status[0]);
        if (status[0].equals("point") || sum == 7)
        {
          status[0] = "win";
          counter(status[0]);
        }
      }
    }

    int[] data = this.get_player_data();
    System.out.println("");
  }
}