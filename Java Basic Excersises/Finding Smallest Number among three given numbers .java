// Write a Program to find the smallest Number of three given numbers .

// Finding Smallest Number among three given numbers :-

import java.util.Scanner;

class Exe23 {
   Exe23() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Enter three numbers: ");
      double var2 = var1.nextDouble();
      double var4 = var1.nextDouble();
      double var6 = var1.nextDouble();
      if (var4 > var2 && var6 > var2) {
         System.out.println("First number is smallest among all : " + var2);
      }

      if (var2 > var4) {
         if (var6 > var4) {
            System.out.println("Second number is smallest among all : " + var4);
         }
      } else if (var2 > var6 && var4 > var6) {
         System.out.println("Third number is smallest among all : " + var6);
      }

   }
}
