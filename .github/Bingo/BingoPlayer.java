import java.util.*;

public class BingoPlayer
{
  /*method creates a virtual markerBoard
  this board will be compared to the bing board
  if a number called exists on the player's board
  on a given space on the bingo board, then a
  "marker" will be placed in that assigned sapce
  on the markerboard
  */

  int[][] bingoBoard = new int[8][8];
  String[][] markerBoard = new String[8][8];
  
  public void setupMarkerBoard()
  {
    int i, j;
    for (i = 0; i < 8; i++)
    {
       for (j = 0; j < 8; j++)
       {
         if (i == j)
         {
           //FREE CENTER SPACE
           markerBoard[i][j] = "*";
         }
         else
         {
           markerBoard[i][j] = "";
         }
       }
    }
  }
  
  public void setupBingoBoard(int min, int max)
  {
    int i, j, randomNumber;
    Random randomValue = new Random();
    for (i = 0; i < 8; i++)
    {
      for (j = 0; j < 8; j++)
      {
        if (i == j)
        {
          //FREE CENTER SPACE
          bingoBoard[i][j] = -1;
        }
        else
        {
          bingoBoard[i][j] = randomValue.nextInt(max-min)+min;
        }
      }
    }
  }

  public static void displayBingoBoard(int[][] b)
  {
    
  }

  public static void displayMarkerBoard(String[][] m)
  {
    
  }
  
  public BingoPlayer(int min, int max)
  {
    setupBingoBoard(min, max);
    setupMarkerBoard();
  }

  public static void main(String[] args)
  {
    int highest_value = 99;
    BingoPlayer player = new BingoPlayer(1,highest_value);

    System.out.println(player.bingoBoard[3][5]);
  }
}