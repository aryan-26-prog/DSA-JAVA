//Declaration:
//type[][]arrayName = new type[rows][columns];
//int[][] numbers = new int[3][5]

 import java.util.Scanner;

public class twoD_array {
  public static void main(String[] args){
    System.out.println("Enter the size of array:");
    Scanner sc = new Scanner(System.in);
    int rows = sc.nextInt();
    int columns = sc.nextInt();

    System.out.println("Enter the rows and colums:");
    int[][] numbers = new int[rows][columns];

    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        numbers[i][j] = sc.nextInt();
      }
    }

    System.out.println("Display output:");
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        System.out.print(numbers[i][j] + " ");
      }
      System.out.println();
    }
    sc.close();
  }
}


// //Searching of an elemnt
// public class twoD_array{
//   public static void main(String[] args){
//     System.out.println("Enter array size:");
//     Scanner sc = new Scanner(System.in);
//     int rows = sc.nextInt();
//     int cols = sc.nextInt();

//     int[][] numbers = new int[rows][cols];

//     System.out.println("Enter rows and cols:");
//     for (int i = 0; i < rows; i++) {
//       for (int j = 0; j < cols; j++) {
//         numbers[i][j] = sc.nextInt();
//       }
//     }

//     System.out.println("Enter x:");
//     int x = sc.nextInt();
//     for (int i = 0; i < rows; i++) {
//       for (int j = 0; j < cols; j++) {
//         if (numbers[i][j] == x) {
//           System.out.println("X is found at locations (" + i + ", " + j + ")");
//         }
//       } 
//     }
//   }
// }