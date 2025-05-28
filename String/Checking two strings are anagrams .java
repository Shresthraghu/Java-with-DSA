/* Write a java program  two strings are  anagrams. 

Defination :- Two strings are anagrams if they contain the same characters in the same frequency , just arranged differently.

# Checking two strings are anagrams. */

import java.util.*;
public class anagramCheck{
  String a = "listen";
  String b = "silent";
  
  if(areAnagrams(a,b)){
     System.out.println(a+"and"+b+"are anagrams.");
    }else{
     System.out.println(a+"and"+b+"are not anagrams.");
    }
   }

public static boolean areAnagrams(String c, String d){
if(c.length()!=d.length()){
 return false;
}

   char[] arr1 = c.toCharArray();
   char[] arr2 = d.toCharArray();

   Arrays.sort(arr1);
   Arrays.sort(arr2);

   return Arrays.equal(arr1,arr2);
  }
}