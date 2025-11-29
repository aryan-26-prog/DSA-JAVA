//creating a function
import java.util.Scanner;

public class function {

  public static void printMyName(String name){
    System.out.println(name);
    return ;
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String name = sc.next();

    printMyName(name);
  }
}


//example
// import java.util.Scanner;

// public class function {

//     public static int CalculateSum(int a, int b){
//       int sum = a*b;
//       return sum;
//   }
//   public static void main(String[] args){
//     System.out.println("Enter the inputs:");
//     Scanner sc = new Scanner(System.in);
//     int a = sc.nextInt();
//     int b = sc.nextInt();

//     int sum = CalculateSum(a, b);
//     System.out.println(sum);
//   }
// }
