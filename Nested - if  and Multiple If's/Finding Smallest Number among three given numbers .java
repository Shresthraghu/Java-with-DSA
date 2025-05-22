// Write a Program to find the smallest Number of three given numbers .

// Finding Smallest Number among three given numbers :-

import java.util.Scanner;

class Exe23 {
   Exe23() {
   }

   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter three numbers: ");
      double a = sc.nextDouble();
      double b = sc.nextDouble();
      double c = sc.nextDouble();
      if (b>a && c>a) {
         System.out.println("First number is smallest among all : " +a);
      }

      if (a>b) {
         if (c>b) {
            System.out.println("Second number is smallest among all : " +b);
         }
      } else if (a>c && b>c) {
         System.out.println("Third number is smallest among all : " +c);
      }

   }
}
