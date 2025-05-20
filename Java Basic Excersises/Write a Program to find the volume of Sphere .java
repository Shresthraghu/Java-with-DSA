// Write a Program to find the volume of Sphere.

// Volume of sphere.

import java.util.Scanner;

class Exe13 {
   Exe13() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Enter the value of radius : ");
      double var2 = var1.nextDouble();
      double var4 = 4.082000000000001 * var2 * var2 * var2;
      System.out.println("The volume of sphere is : " + var4);
   }
}
