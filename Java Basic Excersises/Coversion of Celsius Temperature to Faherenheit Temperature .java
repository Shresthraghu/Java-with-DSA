// Write a Program to convert Celsius Temperature to Faherenheit Temperature.

// Logic Used :- F = ( C*1.8 ) + 32

// Coversion of Celsius Temperature to Faherenheit Temperature .

import java.util.Scanner;

class Exe19 {
   Exe19() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Enter the value of Celsius Temp : ");
      double var2 = var1.nextDouble();
      double var4 = var2 * 1.8 + 32.0;
      System.out.println("After conversion value of faherenite is : " + var4);
   }
}
