/* Write a Program to check if the given number is a buzz number 

Logic :- Buzz Number : A number which is divisible by 7 or ends with 7.

Example - 67,49,37,21

#Checking if the given number is buzz number or not. */


import java.util.Scanner;

class Exe27 {
   public static void main(String[]args) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter any number");
      double a = sc.nextDouble();
      if (a % 10 != 7 && a % 7 != 0) {
         System.out.println("it is not a Buzz Number ");
      } else {
         System.out.print(" It is a Buzz Number ");
      }

   }
}
