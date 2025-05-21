// Write a Program to find the Largest of three numbers.

// Finding the Largest Number among three numbers :-


import java.util.Scanner;

class Exe22 {
   Exe22() {
   }

   public static void main(String[] var0) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the three numbers :");
      double a = sc.nextDouble();
      double b = sc.nextDouble();
      double c = sc.nextDouble();
      if (a>b && a>c) {
         System.out.println("value of first number is biggest among all " + a);
      }

      if (b>a && b>c) {
         System.out.println("Value of second number is biggest among all " + b);
      }

      if (c>a) {
         if (c>b) {
            System.out.println("Value of third number is biggest of all " + c);
         }
      } else if (a == b && b == c) {
         System.out.println("Some numbers are equal");
      }

   }
}
