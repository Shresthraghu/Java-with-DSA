//Write a Program to take input in Meters and convert it into Miles and after conversion print the Miles value .

import java.util.*;
class Exe
{
  public static void main(String [] args)
   {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the value of meter :");
    double met = sc.nextDouble();
    double Mils = met * 0.000621;
    System.out.println("After conversion value of mil is :" + Mils);
   }
}
