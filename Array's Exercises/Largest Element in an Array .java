/* Write a Java program to find the largest number in a given array.

# Largest Element in an Array :- */

import java.util.*;
public class maxInArray {
    public static void main(String[] args) {
        int[] num = {5,890, 10, 279, 116};

        int max = num[0]; 

        for (int i = 1; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }

        System.out.println("The largest number is " + max);
    }
}

