// Write a Program to calculate area of Triangle.

// Area of Triangle.

import java.util.Scanner;

class Exe11 {
   Exe11() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println(" Enter the breadth value :");
      double var2 = var1.nextDouble();
      System.out.println("Enter the value of height : ");
      double var4 = var1.nextDouble();
      double var6 = 0.5 * var2 * var4;
      System.out.println("The area of Triangle : " + var6);
   }
}
