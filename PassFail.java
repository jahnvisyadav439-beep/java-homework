// Program 12: Grade Calculator
// Output: Enter marks: 85 => Grade B

import java.util.Scanner;

public class Grade {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter marks: ");
       int marks = sc.nextInt();

       if(marks >= 90)
           System.out.println("Grade A");
       else if(marks >= 75)
           System.out.println("Grade B");
       else if(marks >= 50)
           System.out.println("Grade C");
       else
           System.out.println("Fail");
   }
}

/*
// Second Time
import java.util.Scanner;

public class Grade2 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter marks: ");
       int marks = sc.nextInt();

       if(marks >= 90)
           System.out.println("Grade A");
       else if(marks >= 75)
           System.out.println("Grade B");
       else if(marks >= 50)
           System.out.println("Grade C");
       else
           System.out.println("Fail");
   }
}
*/

/*
// Third Time
import java.util.Scanner;

public class Grade3 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter marks: ");
       int marks = sc.nextInt();

       if(marks >= 90)
           System.out.println("Grade A");
       else if(marks >= 75)
           System.out.println("Grade B");
       else if(marks >= 50)
           System.out.println("Grade C");
       else
           System.out.println("Fail");
   }
}
*/
