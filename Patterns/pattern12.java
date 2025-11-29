// Palindromic Pattern

import java.util.Scanner;

public class pattern12 {
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

      //first half
      for (int j = i; j >= 1; j--) {
        System.out.print(j);
      }

      //second half
      for (int j = 2; j <= i; j++) {
        System.out.print(j);
      }
      System.out.println();
    }
    sc.close();
  }
}