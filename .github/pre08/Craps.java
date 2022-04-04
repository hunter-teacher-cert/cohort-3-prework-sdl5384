import java.util.*;
import java.lang.Math.*;

public class Craps
{  
  private static int[] winLossFreq = new int[2];
  
  public Craps()
  {
    setStats(0,0);
    
  }
  
  public void setStats(int win, int loss)
  {
    winLossFreq[0] = 0;
    winLossFreq[1] = 0;
  }

  public static int[] getStats()
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
      counter(result);
    }
    else if ((sum == 7) || (sum == 11))
    {
      result = "win";
      counter(result);
    }
    else
    {
      result = "point";
      counter(result);
    }

    if (result.equals("point"))
    {
      dice_vals = roll(1,7);
      /*sum recalculated after a nice dice roll after getting
        the point*/
      sum = dice_vals[0] + dice_vals[1];
      if (sum == 7)
      {
        result = "win";
        counter(result);
      }
      else
      {
        result = "lose";
        counter(result);
      }
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
    if (player_status.equals("point"))
    {
      //roll again
      dice_numbers = roll(1,7);
      int sum = dice_numbers[0] + dice_numbers[1];
      player_status = shoot(dice_numbers);
      int[] wlData = getStats();
      if (sum != 7)
      {
        counter(player_status);
        System.out.println("You win!");
      }
      else if (sum == 7)
      {
        counter(player_status);
        System.out.println("You lose. Try again.");
      }
      System.out.println("Wins: " + wlData[0]);
    }
  }
  
  public static void counter(String game_point)
  {
    if (game_point.equals("win"))
      winLossFreq[0]++;
    else if (game_point.equals("lose"))
      winLossFreq[1]++;
  }
  
  public static void main(String[] args)
  {
    round();
    
  }
}