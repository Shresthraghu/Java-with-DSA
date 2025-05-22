/* Write a Program to print the grade based on the marks obtained according to the following :-

  Marks   Grade
>=80        A
60 to 80    B
50 to 60    C
40 to 50    D
<40         E

Calculating Grades Based on marks :- */


import java.util.*;

class Exe24 {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter your marks");
      double a = sc.nextDouble();
      if (a>=80) {
         System.out.println(" Your grade is : A ");
      }

      else if(a>=60 && a<80) {
         System.out.println(" Your grade is : B ");
      }

      else if(a>=50 && a<60) {
         System.out.println(" Your grade is : C ");
      }

      else if(a>=40 && a<50) {
         System.out.println(" Your grade is : D ");
      }

      else if(a<40) {
         System.out.println(" Your grade is : E ");
      }
     }
   }
