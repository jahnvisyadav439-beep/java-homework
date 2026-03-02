// Program 13: Electricity Bill Calculator
// Output: Enter units: 120 => Total Bill: 700

import java.util.Scanner;

public class ElectricityBill {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter units consumed: ");
       int units = sc.nextInt();
       int bill;

       if(units <= 100)
           bill = units * 5;
       else
           bill = (100 * 5) + (units - 100) * 10;

       System.out.println("Total Bill: " + bill);
   }
}

/*
// Second Time
import java.util.Scanner;

public class ElectricityBill2 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter units consumed: ");
       int units = sc.nextInt();
       int bill;

       if(units <= 100)
           bill = units * 5;
       else
           bill = (100 * 5) + (units - 100) * 10;

       System.out.println("Total Bill: " + bill);
   }
}
*/

/*
// Third Time
import java.util.Scanner;

public class ElectricityBill3 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter units consumed: ");
       int units = sc.nextInt();
       int bill;

       if(units <= 100)
           bill = units * 5;
       else
           bill = (100 * 5) + (units - 100) * 10;

       System.out.println("Total Bill: " + bill);
   }
}
*/
