public class madeInUsa
{
  public static void printAmerican(String d, String m, String dt, String y)
  {
    System.out.println(d + ", " + m + " " + dt + ", " + y);
  }
  
  public static void main(String[] args)
  {
    String day = "Wednesday";
    String month = "December";
    String date = "29";
    String year = "2021";

    printAmerican(day, month, date, year);
  }
}