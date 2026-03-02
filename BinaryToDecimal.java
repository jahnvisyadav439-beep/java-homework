// Program 11: Greatest of Three Numbers
// Output: Enter 1st: 10, 2nd: 50, 3rd: 30 => Greatest: 50

import java.util.Scanner;

public class GreatestThree {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter first number: ");
       int a = sc.nextInt();
       System.out.print("Enter second number: ");
       int b = sc.nextInt();
       System.out.print("Enter third number: ");
       int c = sc.nextInt();

       if(a >= b && a >= c)
           System.out.println("Greatest: " + a);
       else if(b >= c)
           System.out.println("Greatest: " + b);
       else
           System.out.println("Greatest: " + c);
   }
}

/*
// Second Time
import java.util.Scanner;

public class GreatestThree2 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter first number: ");
       int a = sc.nextInt();
       System.out.print("Enter second number: ");
       int b = sc.nextInt();
       System.out.print("Enter third number: ");
       int c = sc.nextInt();

       if(a >= b && a >= c)
           System.out.println("Greatest: " + a);
       else if(b >= c)
           System.out.println("Greatest: " + b);
       else
           System.out.println("Greatest: " + c);
   }
}
*/

/*
// Third Time
import java.util.Scanner;

public class GreatestThree3 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter first number: ");
       int a = sc.nextInt();
       System.out.print("Enter second number: ");
       int b = sc.nextInt();
       System.out.print("Enter third number: ");
       int c = sc.nextInt();

       if(a >= b && a >= c)
           System.out.println("Greatest: " + a);
       else if(b >= c)
           System.out.println("Greatest: " + b);
       else
           System.out.println("Greatest: " + c);
   }
}
*/
