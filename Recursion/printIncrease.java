import java.util.Scanner;

public class printIncrease {
  static void printIncreaseNumber(int n) {
    if (n == 1) {
      System.out.println(n);
      return;
    }
    printIncreaseNumber(n-1);
    System.out.println(n);

  }
 
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();

    printIncreaseNumber(n);
   

  }
}
