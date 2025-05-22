// Checking if a number is perfect square or not.

import java.util.Scanner;

class Exe28 {

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number :");
      double a = sc.nextDouble();
      int b = (int)Math.sqrt(a);
      if ((double)b == a) {
         System.out.print("Its a perfect square" + a);
      } else {
         System.out.print(" its not a perfect square " + a);
      }

   }
}