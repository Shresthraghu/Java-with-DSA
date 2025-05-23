/* Write a Program to find duplicate elements in an array without using Set or Map.

# Finding duplicates from array */


import java.util.*;
public class findDuplicates{
 public static void main(String[]args){
   int[]a={4,2,7,2,4,9};
   boolean[]b=new boolean[a.length];
   System.out.println("Duplicates : ");
  
  for(int i=0;i<a.length;i++){
    if(b[i])continue;

    boolean isDuplicate=false;
    for(int j=i+1;j<a.length;j++){
      if(a[i]==a[j]){
       b[j]=true;
      }
    }
   
   if(isDuplicate){
      System.out.println(a[i]+"");
    }
   }
  }
}