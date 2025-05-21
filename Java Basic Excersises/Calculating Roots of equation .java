// Write a Program to find the roots of equation.

// Logic used :- (-b+Math.sqrt(b*b))-(4*a*c)/(2*a)

// Calculating Roots of equation :-

import java.util.Scanner;

class Exe21 {
   Exe21() {
   }

   public static void main(String[] var0) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the value of a : ");
      double a = a.nextDouble();
      System.out.println("Enter the value of b : ");
      double b = b.nextDouble();
      System.out.println("Enter the value of c : ");
      double c = c.nextDouble();
      double g = b * b;
      double h = 4.0 * a * c;
      double i = g - h;
      double e = 2.0 * a;
      double d = Math.sqrt(i);
      double j = -b + d;
      double f = j / e;
      System.out.println("The value of discriminant is : " +f);
      System.out.println("");
      if (f > 0) {
         System.out.println("There are two real solutions");
      }

      if (f < 0) {
         System.out.println("Roots are not real ");
      } else {
         System.out.println("There is one real solution");
      }

   }
}