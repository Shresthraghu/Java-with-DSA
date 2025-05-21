// Write  a program to calculate Mersenne Number.

// Calculating Mersenne Number . 

import java.util.Scanner;

class Exe18 {
   Exe18() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Enter the value of Number : ");
      int var2 = var1.nextInt();
      int var3 = (int)Math.pow(2.0, (double)var2) - 1;
      System.out.println("After conversion value of Mersenne Number : " + var3);
   }
}
