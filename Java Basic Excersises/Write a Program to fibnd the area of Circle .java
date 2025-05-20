//Write a program to calculate area of Circle. 

// Area of Circle :- 

import java.util.Scanner;

class Exe10 {
   Exe10() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Enter the value of radius :");
      double var2 = var1.nextDouble();
      double var4 = 3.14 * var2 * var2;
      System.out.println("The value of area of circle : " + var4);
   }
}
