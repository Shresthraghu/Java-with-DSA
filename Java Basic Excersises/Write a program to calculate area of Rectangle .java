/*Write a program to calculate area of rectangle. */

/*Area of Rectangle*/

import java.util.Scanner;

class Exe9 {
   Exe9() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Enter the value of length: ");
      double var2 = var1.nextDouble();
      System.out.println("Enter the value of breadth: ");
      double var4 = var1.nextDouble();
      double var6 = var2 * var4;
      System.out.println("The area of rectangle is : " + var6);
   }
}