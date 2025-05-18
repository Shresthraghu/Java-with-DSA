/* Write a Program to take input in Decameter and convert it into KiloMeter and after conversion print the value of KiloMeter.

Task Performed in this code :-

1. Take the value of Decameter from user in Double .
2. Divide that value by 10.
3. After Dividing print that value.

Logic Used :-

1. Value of Decameter is denoted by "d".
2. Value of KiloMeter is denoted by "KM".
3. KM = d/10. */


import java.util.*;
class Exe4
{
 public static void main(String [] args)
 {
 Scanner sc = new Scanner(System.in);
 System.out.println(" Enter the value of Decameter is :");
 double d = sc.nextDouble();
 double KM = d/10;
 System.out.println(" After conversion value of KM is : " +KM);
 }
}
