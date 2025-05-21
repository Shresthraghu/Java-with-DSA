/* Write a Program to find Simple Interest :-

 Logic Used :- SI=PTR/100

 1. Value of Initial Value of Principal is denoted by "P".
 2. Value of Annual Rate of Interest is denoted by "R".
 3. Value of Time is denoted by "T".
 4. S.I.=(P*R*T)/100*


 Calculating value of Simple Interst :-*/




import java.util.Scanner;

class Exe15 {
   Exe15() {
   }

   public static void main(String[] var0) {
      Scanner var1 = new Scanner(System.in);
      System.out.println("Enter the Principal value :");
      double var2 = var1.nextDouble();
      System.out.println("Enter the Time");
      double var4 = var1.nextDouble();
      System.out.println("Enter the Rate of Interest :");
      double var6 = var1.nextDouble();
      double var8 = var2 * var6 * var4 / 100.0;
      System.out.println("The Simple Interest is : " + var8);
   }
}
