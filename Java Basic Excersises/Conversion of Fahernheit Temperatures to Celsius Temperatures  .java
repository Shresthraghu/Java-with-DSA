// Write a Program to convert Fahernheit Temperatures to Celsius Temperatures.

// Conversion of Fahernheit Temperatures to Celsius Temperatures .

import java.util.Scanner;

class Exe20 {
   Exe20() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Enter the value of Faherenite Temp : ");
      double var2 = var1.nextDouble();
      double var4 = (var2 - 32.0) * 1.8;
      System.out.println("After conversion value of Celsius is : " + var4);
   }
}
