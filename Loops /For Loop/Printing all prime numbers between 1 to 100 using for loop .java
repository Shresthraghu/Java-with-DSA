/* Write a java Program to print all prime numbers between 1 and 100 . */

/* Printing all prime numbers between 1 to 100 using for loop :- */

import java.util.*;

public class primeRange{
public static void main(String[]args){
int count = 0;

for (int num=2; num<=100;num++){
 boolean isPrime = true;
  
  for(int i=2;i<=Math.sqrt(num);i++){
    if(num%i==0){
     isPrime=false;
      break;
     }
    }

   if(isPrime){
      System.out.println(num+"");
      count++;
      }
     }

System.out.println("\nTotal prime numbers between 1 and 100:"+count);

 }
}
