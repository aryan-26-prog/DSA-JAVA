// Solid rhombus

import java.util.Scanner;

public class pattern10 {
  public static void main(String[] args){
    int n;
    System.out.println("Enter the value of n:");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();

    for (int i = 1; i <= n; i++) {
      int spaces = n-i;
      for (int j = 1; j <= spaces; j++) {
        System.out.print(" ");
      }

      for (int j = 1; j <= n; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    sc.close();
  }
}
