// Write a program to find Compound Interest :-

// Calculating Compound Interest :-

// Logic Used :- CI =p*{(1+r/100)^t-1}

import java.util.Scanner;

class Exe15 {
   Exe15() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Enter the Principal value :");
      double var2 = var1.nextDouble();
      System.out.println("Enter the Time");
      double var4 = var1.nextDouble();
      System.out.println("Enter the Rate of Interest :");
      double var6 = var1.nextDouble();
      double var8 = var2 * var6 * var4 / 100.0;
      System.out.println("The Simple Interest is : " + var8);
   }
}
