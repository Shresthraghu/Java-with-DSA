// Write a Program to find and give Repunit :-

// Logic used :-  ((int)Math.pow(10,n)-1)/9

// Calculating value of Repunit : -

import java.util.Scanner;

class Exe17 {
   Exe17() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Enter the value of R :");
      int var2 = var1.nextInt();
      System.out.println("Enter the value of n : ");
      double var3 = var1.nextDouble();
      int var5 = (int)Math.pow(10.0, var3);
      double var6 = (double)(var5 - 1);
      double var8 = var6 / 9.0;
      System.out.println("The value of Repunit :" + var8);
   }
}
