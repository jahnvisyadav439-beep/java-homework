// Program 8: Profit or Loss
// Output: Enter cost: 1000, selling: 1200 => Profit

import java.util.Scanner;

public class ProfitLoss {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter cost price: ");
       int cost = sc.nextInt();
       System.out.print("Enter selling price: ");
       int sell = sc.nextInt();

       if(sell > cost)
           System.out.println("Profit");
       else if(sell < cost)
           System.out.println("Loss");
       else
           System.out.println("No Profit No Loss");
   }
}

/*
// Second Time
import java.util.Scanner;

public class ProfitLoss2 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter cost price: ");
       int cost = sc.nextInt();
       System.out.print("Enter selling price: ");
       int sell = sc.nextInt();

       if(sell > cost)
           System.out.println("Profit");
       else if(sell < cost)
           System.out.println("Loss");
       else
           System.out.println("No Profit No Loss");
   }
}
*/

/*
// Third Time
import java.util.Scanner;

public class ProfitLoss3 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter cost price: ");
       int cost = sc.nextInt();
       System.out.print("Enter selling price: ");
       int sell = sc.nextInt();

       if(sell > cost)
           System.out.println("Profit");
       else if(sell < cost)
           System.out.println("Loss");
       else
           System.out.println("No Profit No Loss");
   }
}
*/
