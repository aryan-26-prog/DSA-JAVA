import java.util.Scanner;

public class factorial {

  public static int CalculateFact(int n){
    int fact=1;
    for (int i = 1; i <= n; i++) {
      fact = fact*i;
    }
    System.out.println(fact);
    return fact;
  }
  public static void main(String[] args){
    System.out.println("Enter the value of n:");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    CalculateFact(n);
  }  
}
