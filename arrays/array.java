//Definig an array: 
// type[]arrayName = new type[size];
// type[]arrayName = {1,2,3,4,5,6};


import java.util.Scanner;

public class array{
  public static void main(String[] args){
    System.out.println("Enter array size:");
    Scanner sc = new Scanner(System.in);
    int size = sc.nextInt();

    int numbers[] = new int[size];

    //input
    System.out.println("Enter the inputs:");
    for (int i = 0; i < size ; i++) {
      numbers[i] = sc.nextInt();
    }
    
    //output
    System.out.println("Display result:");
    for (int i = 0; i <= size; i++) {
      System.out.println(numbers[i]); 
    }
    sc.close();
  }
}


// import java.util.Scanner;

// public class array {
//   public static void main(){
//     //int[] marks = new int[3];
//     int marks[] = new int[3];
//     marks[0] = 97;
//     marks[1] = 98;
//     marks[2] = 95;

//     // System.out.println(marks[0]);
//     // System.out.println(marks[1]);
//     // System.out.println(marks[2]);

//     for (int i = 0; i <=3; i++) {
//       System.out.println(marks[i]);
//     }
//   }  
// }


// //Searching of an element
// public class array {
//   public static void main(String[] args){
//     System.out.println("Enter the size of array:");
//     Scanner sc = new Scanner(System.in);
//     int size = sc.nextInt();

//     int numbers[] = new int[size];

//     System.out.println("Enter the inputs:");
//     for (int i = 0; i < size; i++) {
//       numbers[i] = sc.nextInt();
//     }

//     System.out.println("Enter x:");
//     int x = sc.nextInt();
//     for (int i = 0; i < numbers.length; i++) {
//       if(numbers[i] == x){
//         System.out.println("X found at index:"+i);
//       }
//     }
//   }
// }