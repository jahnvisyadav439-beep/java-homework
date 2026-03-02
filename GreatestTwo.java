// Program 24: ATM Withdrawal
// Output: Enter balance: 5000, amount: 3000 => Transaction Successful

import java.util.Scanner;

public class ATM {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter balance: ");
       double balance = sc.nextDouble();
       System.out.print("Enter withdrawal amount: ");
       double amount = sc.nextDouble();

       if(amount <= balance)
           System.out.println("Transaction Successful");
       else
           System.out.println("Insufficient Balance");
   }
}

/*
// Second Time
import java.util.Scanner;

public class ATM2 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter balance: ");
       double balance = sc.nextDouble();
       System.out.print("Enter withdrawal amount: ");
       double amount = sc.nextDouble();

       if(amount <= balance)
           System.out.println("Transaction Successful");
       else
           System.out.println("Insufficient Balance");
   }
}
*/

/*
// Third Time
import java.util.Scanner;

public class ATM3 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter balance: ");
       double balance = sc.nextDouble();
       System.out.print("Enter withdrawal amount: ");
       double amount = sc.nextDouble();

       if(amount <= balance)
           System.out.println("Transaction Successful");
       else
           System.out.println("Insufficient Balance");
   }
}
*/
