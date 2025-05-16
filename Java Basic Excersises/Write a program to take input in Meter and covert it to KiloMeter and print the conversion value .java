//Write a program to take input in Meter and covert it to KiloMeter and print the conversion value .

//Conversion from Meter to KiloMeter

import java.util.*;
class Exe2
{ 
 public static void main(String [] args)
 {
  Scanner sc = new Scanner(System.in);
  System.out.println(" Enter the value of meter : ");
  double met = sc.nextDouble();
  double Km = met/100;
  System.out.println("After conversion value of KM is: " + Km);
 }
}