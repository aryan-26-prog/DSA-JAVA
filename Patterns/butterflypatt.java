// Butterfly Pattern

import java.util.Scanner;

public class butterflypatt {
  public static void main(String[] args){
    int n;
    System.out.println("Enter the value of n:");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();

    //upper half
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }

      //spaces
      int spaces = 2*(n-i);
      for (int j = 1; j <= spaces; j++) {
        System.out.print(" ");
      }

      //2nd part
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    //Lower Half
    for (int i = n; i >= 1; i--) {
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }

      //spaces
      int spaces = 2*(n-i);
      for (int j = 1; j <= spaces; j++) {
        System.out.print(" ");
      }

      //2nd part
      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
    sc.close();
  }
}

