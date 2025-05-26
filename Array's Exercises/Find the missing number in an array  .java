/*Write a program to find the missing number from a given array containing n-1 integers in the range from 1 to n . (no duplicates)

Example : Input :{1,2,4,5}
          Output : 3

Finding the missing number in an array. */


public class missingNumber{
  public static void main(String[]args){
  int []arr={1,2,4,5};
  int n=5;
  int expectedSum=n*(n+1)/2;
  int actualSum=0;

  for(int num:arr){
    actualSum+=num;
  }

int missing=expectedSum-actualSum;
System.out.println("Missing number is : "+missing);
 }
}

