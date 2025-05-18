/* Write a Program to take input in Decameter and convert it into Miles and after conversion print the value of Mils.

Task performed in this code :-

1. Take the value of Decameter from user in Double .
2. Multiply that value by 0.00621.
3. After Multiplying print that value.

Logic Used :-

1. Value of Decameter is denoted by "d".
2. Value of Mils is denoted by "Mils".
3. Mils = d*0.00621. */


import java.util.*;
class Exe3
{ 
 public static void main (String [] args)
 {
  Scanner sc = new Scanner(System.in);
  System.out.println(" Enter the value of Decameter : ");
  double d  = sc.nextDouble();
  double Mils = d * 0.00621;
  System.out.println(" After conversion value of Mils is : " +Mils);
 }
}