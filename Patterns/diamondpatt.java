//Diamond Pattern

import java.util.Scanner;

public class diamondpatt {
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

      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }

      for (int j = 2; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    for (int i = n; i >= 1; i--) {
      int spaces = n-i;
      for (int j = 1; j <= spaces; j++) {
        System.out.print(" ");
      }

      for (int j = 1; j <= i; j++) {
        System.out.print("*");
      }

      for (int j = 2; j <= i; j++) {
        System.out.print("*");
      }
      System.out.println();
  }
  sc.close();
}
}


//Second logic

// import java.util.Scanner;

// public class diamondpatt {
//   public static void main(String[] args){
//     int n;
//     System.out.println("Enter the value of n:");
//     Scanner sc = new Scanner(System.in);
//     n = sc.nextInt();

//     for (int i = 1; i <= n; i++) {
//       int spaces = n-i;
//       for (int j = 1; j <= spaces; j++) {
//         System.out.print(" ");
//       }
      
//       //upper half
//       for (int j = 1; j <= 2*i-1; j++) {
//         System.out.print("*");
//       }
//       System.out.println();
//     }

//     for (int i = n; i >= 1; i--) {
//       int spaces = n-i;
//       for (int j = 1; j <= spaces; j++) {
//         System.out.print(" ");
//       }
      
//       //upper half
//       for (int j = 1; j <= 2*i-1; j++) {
//         System.out.print("*");
//       }
//       System.out.println();
//     }
//   }
// }

