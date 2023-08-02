import java.util.Scanner;
class Main
{
  public static void main (String[]args)
  {
    Scanner sc = new Scanner (System.in);
    int ans = 0, y = 1, x;
      System.out.print ("Enter a number: ");
    int num = sc.nextInt ();
    while (num > 0)
      {
	x = num % 2;
	ans += x * y;
	y *= 10;
	num = num / 2;
      }
    System.out.print ("The binary number is: " + ans);
  }
};
