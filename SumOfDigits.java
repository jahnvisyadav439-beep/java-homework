// Program 17: BMI Category
// Output: Enter BMI: 23 => Normal

import java.util.Scanner;

public class BMICheck {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter BMI value: ");
       double bmi = sc.nextDouble();

       if(bmi < 18.5)
           System.out.println("Underweight");
       else if(bmi < 25)
           System.out.println("Normal");
       else
           System.out.println("Overweight");
   }
}

/*
// Second Time
import java.util.Scanner;

public class BMICheck2 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter BMI value: ");
       double bmi = sc.nextDouble();

       if(bmi < 18.5)
           System.out.println("Underweight");
       else if(bmi < 25)
           System.out.println("Normal");
       else
           System.out.println("Overweight");
   }
}
*/

/*
// Third Time
import java.util.Scanner;

public class BMICheck3 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Enter BMI value: ");
       double bmi = sc.nextDouble();

       if(bmi < 18.5)
           System.out.println("Underweight");
       else if(bmi < 25)
           System.out.println("Normal");
       else
           System.out.println("Overweight");
   }
}
*/
