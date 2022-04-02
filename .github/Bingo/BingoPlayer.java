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
  public static String[][] setupMarkerBoard(int board_size)
  {
    String[][] markerboard = new String[board_size][board_size];
    int i, j;
    for (i = 0; i < board_size; i++)
    {
       for (j = 0; j < board_size; j++)
       {
         if (i == j)
         {
           //FREE CENTER SPACE
           markerboard[i][j] = "*";
         }
         else
         {
           markerboard[i][j] = "";
         }
       }
    }
    return markerboard;
  }
  
  public static int[][] setupBingoBoard(int board_size, int max)
  {
    int i, j, randomNumber;
    int[][] bingoBoard = new int[board_size][board_size];
    Random randomValue = new Random();
    for (i = 0; i < board_size; i++)
    {
      for (j = 0; j < board_size; j++)
      {
        if (i == j)
        {
          //FREE CENTER SPACE
          bingoBoard[i][j] = -1;
        }
        else
        {
          bingoBoard[i][j] = randomValue.nextInt(max);
        }
      }
    }
    return bingoBoard;
  }
  
  public BingoPlayer(int boardDimension, int max)
  {
    int[][] bingoboard = new int[boardDimension][boardDimension];
    String[][] markerboard = new String[boardDimension][boardDimension];
    bingoboard = setupBingoBoard(boardDimension, max);
  }

  public static void main(String[] args)
  {
    int dimension = 8;
    int highest_value = 99;
    BingoPlayer player = new BingoPlayer(dimension,highest_value);

    System.out.println(BingoPlayer.get)
  }
}