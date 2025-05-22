/* Write a Program to print the month of the year ( Using if...else if ladder )

Example : month = 1 -> monthOfYear="Januvary"
          month = 2 -> monthOfYear="Februvary"

# Printing Month of Year :- */

import java.util.Scanner;

class Exe26 {
   public static void main(String[] var0) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the month number of the year: ");
      double a = sc.nextDouble();
      if (a == 1) {
         System.out.println(" monthOfYear =  Januvary  ");
      } else if (a == 2) {
         System.out.println(" monthOfYear =  Februvary  ");
      } else if (a == 3) {
         System.out.println(" monthOfYear =  March  ");
      } else if (a == 4) {
         System.out.println(" monthOfYear =  April  ");
      } else if (a == 5) {
         System.out.println(" monthOfYear =  May  ");
      } else if (a == 6) {
         System.out.println(" monthOfYear =  June  ");
      } else if (a == 7) {
         System.out.println(" monthOfYear =  July  ");
      } else if (a == 8) {
         System.out.println(" monthOfYear =  August  ");
      } else if (a == 9) {
         System.out.println(" monthOfYear =  September  ");
      } else if (a == 10) {
         System.out.println(" monthOfYear =  October  ");
      } else if (a == 11) {
         System.out.println(" monthOfYear =  November  ");
      } else if (a == 12) {
         System.out.println(" monthOfYear =  December  ");
      } else if (a > 12) {
         System.out.println(" Please enter number between from 1 to 12 ");
      }

   }
}
