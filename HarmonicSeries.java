// Program 10: Vowel or Consonant
// Output: Enter character: a => Vowel

import java.util.Scanner;

public class VowelCheck {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter character: ");
       char ch = sc.next().charAt(0);

       if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
          ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
           System.out.println("Vowel");
       else
           System.out.println("Consonant");
   }
}

/*
// Second Time
import java.util.Scanner;

public class VowelCheck2 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter character: ");
       char ch = sc.next().charAt(0);

       if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
          ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
           System.out.println("Vowel");
       else
           System.out.println("Consonant");
   }
}
*/

/*
// Third Time
import java.util.Scanner;

public class VowelCheck3 {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter character: ");
       char ch = sc.next().charAt(0);

       if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||
          ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
           System.out.println("Vowel");
       else
           System.out.println("Consonant");
   }
}
*/
