// Write a Program to calculate area of Triangle 2.

// Area of Triangle 2 :-

import java.util.Scanner;

class Exe12 {
   Exe12() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Enter the value of A :");
      double var2 = var1.nextDouble();
      System.out.println("Enter the value of B :");
      double var4 = var1.nextDouble();
      System.out.println("Enter the value of C :");
      double var6 = var1.nextDouble();
      double var8 = var2 * var4 * var6 / 2.0;
      double var10 = var8 - var2;
      double var12 = var8 - var4;
      double var14 = var8 - var6;
      double var16 = Math.sqrt(var8 * var10 * var12 * var14);
      System.out.println("The area of triangle is :" + var16);
   }
}
