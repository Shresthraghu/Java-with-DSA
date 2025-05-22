/* Write a Java program to count the frequency of each element in an array without using HashMap or advanced collections.

  Frequency Count of Elements in an Array :- */

import java.util.*;
public class frequencyCount {
    public static void main(String[] args) {
        int[] arr = {813, 813, 813, 69, 69, 5};
        boolean[] a = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            if (a[i]) continue;

            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    a[j] = true;
                    count++;
                }
            }

            System.out.println(arr[i] + " → " + count + (count == 1 ? " time" : " times"));
        }
    }
}

