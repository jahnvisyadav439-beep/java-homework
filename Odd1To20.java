// Program 9: Leap Year Check
// Output: Enter year: 2024 => Leap Year

import java.util.Scanner;

public class LeapYear {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter year: ");
       int year = sc.nextInt();

       if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
           System.out.println("Leap Year");
       else
           System.out.println("Not Leap Year");
   }
}

/*
// Second Time
import java.util.Scanner;

public class LeapYear2 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter year: ");
       int year = sc.nextInt();

       if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
           System.out.println("Leap Year");
       else
           System.out.println("Not Leap Year");
   }
}
*/

/*
// Third Time
import java.util.Scanner;

public class LeapYear3 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter year: ");
       int year = sc.nextInt();

       if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
           System.out.println("Leap Year");
       else
           System.out.println("Not Leap Year");
   }
}
*/
