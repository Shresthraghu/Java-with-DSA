/*  Write a Java program that prints numbers from 1 to 100, but:-

   1. For multiples of 3, print "Fizz" instead of the number

   2. For multiples of 5, print "Buzz"

   3. For numbers which are multiples of both 3 and 5, print "FizzBuzz"


Expected Output (first few lines):

1  
2  
Fizz  
4  
Buzz  
Fizz  
7  
8  
Fizz  
Buzz  
11  
Fizz  
13  
14  
FizzBuzz  
...

# Printing 1 to 100 Numbers with conditions using for loop :- */

import java.util.*;
public class fizzBuzz {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0)
                System.out.println("FizzBuzz");
            else if (i % 3 == 0)
                System.out.println("Fizz");
            else if (i % 5 == 0)
                System.out.println("Buzz");
            else
                System.out.println(i);
        }
    }
}




