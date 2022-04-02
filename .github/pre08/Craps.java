import java.util.*;
import java.lang.Math.*;

public class Craps
{
  int[] winLossFreq = new int[2];

  public void setStats(int win, int loss)
  {
    winLossFreq[0] = 0;
    winLossFreq[1] = 0;
  }

  public int[] getWinLossFreq()
  {
    return winLossFreq;
  }
  
  public static int[] roll(int min, int max)
  {
    Random random = new Random();
    int[] dice_values = new int[2];
    dice_values[0] = random.nextInt(max - min)+min;
    dice_values[1] = random.nextInt(max - min)+min;

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

    if (result.equals("point"))
    {
      
    }
    System.out.println("You have rolled a " + dice_vals[0] + " and a " + dice_vals[1]);
    System.out.println("Your dice sum is " + sum);

    return result;
  }
  
  public static void round()
  {
    int[] dice_numbers = new int[2];
    dice_numbers = roll(1,7);
    String player_status = shoot(dice_numbers);
    System.out.println("You " + player_status);
  }
  
  public static int[] counter(String game_point)
  {
    //array sequence is Win, Lose, Point
    int[] player_data = getWinLossFreq();
    if (game_point.equals("win"))
      setWinLossFreq(1,0);
    else if (game_point.equals("lose"))
      setWinLossFreq(0,1);

    return player_data;
  }
  
  public static void main(String[] args)
  {
    round();
  }
}