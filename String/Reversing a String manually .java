/* Write a Java program to reverse a string manually, without using StringBuilder or any built-in reverse() method.

Example Input : hello

Expected Output : olleh

# Reversing a String manually :- */


import java.util.*;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }

        System.out.println("Reversed string: " + reversed);
    }
}


