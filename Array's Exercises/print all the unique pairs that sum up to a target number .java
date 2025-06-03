/*Write a program to print all the unique pairs that sum up to a target number from a given array. */

// print all the unique pairs that sum up to a target number

import java.util.Hashset;
public class pairSum{
public static void main(String[]args){
int[] arr={2,4,3,5,7,8,-1};
int target = 7;

find pairs(arr,target);
} 

public static void findPairs(int []arr , int target){
HashSet<Integer.seen= new HashSet<>();
for (int num : arr){
    int complement = target - num;

 if(seen.contains(complement)){
   System.out.println("("+complement + ","+num+")"); 
 }
   seen.add(num);
  }
 }
}*/

// we can do it without hashset collect also .

public class pairsum{

public static void main(string[]args){
for(int i = 0; i<arr.length ; i++){
 for (int j = i+1; j<arr.length ; j++){
 if(arr[i] + arr[j] == target ){
   boolean alreadyPrinted = false;
    for(int k =0; K<i; K++){
       if((arr[k] == arr[i] && arr[k+1] ==arr[j]) || (arr[k] == arr[j] && arr[k+1] == arr[i])){
         alreadyPrinted = true;
         break;
        }
       }
        if(!alreadyPrinted){
          System.out.println("(" + arr[i] + ","+arr[j] + ")");
         }
       }
     }
   }
 }

public static void main(String[]args){
   int[] arr = {2,4,3,5,7,8,-1};
   int target = 7;
   findPairs(arr,target);
 }
}
  


