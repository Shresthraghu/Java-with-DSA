/* Write a program to calculate area of square */

// Area of Square :-

import java.util.Scanner;

class Exe8 {
   Exe8() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Enter the value of side:");
      double var2 = var1.nextDouble();
      double var4 = var2 * var2;
      System.out.println("The area of square is :" + var4);
   }
}
