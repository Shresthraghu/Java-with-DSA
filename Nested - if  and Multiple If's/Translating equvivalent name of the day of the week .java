/* Write a Program to input number of weeks days(1 - 7) and translate to its equvivalent name of the day of the week (using if... else /if ladder )

example : day = 1 -- day of week = "Monday".
          day = 2 -- day of week = "Tuesday".
 
Translating equvivalent name of the day of the week :- */

import java.util.Scanner;

class Exe25 {
 
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number of day from 1 to 7:");
      double a = sc.nextDouble();
      if (a == 1) {
         System.out.println(" its a SUNDAY ");
      }

      else if (a == 2) {
         System.out.println("  its a MONDAY ");
      }

      else if (a == 3) {
         System.out.println(" its a TUESDAY ");
      }

      else if (a == 4) {
         System.out.println(" its a WEDNESDAY ");
      }

      else if (a == 5) {
         System.out.println(" its a THURSDAY ");
      }

     else if (a == 6) {
         System.out.println(" its a FRIDAY ");
      }

      else if (a == 7) {
         System.out.println(" its a SATURDAY ");
      }
 
      else if (a > 7) {
         System.out.println(" please enter number from 1 to 7");
      }

   }
}
