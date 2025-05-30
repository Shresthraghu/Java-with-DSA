// HashSet example :-

import java.util.*;
public class IceCream{
  public static void Main (String[]args){
    Set<String>set=new HashSet<String>();

    set.add("Strawberry");
    set.add("Vanilla");
    set.add("Chocolate");
    set.add("Rocky Road");
    set.add("Chocolate");
    set.add("Strawberry");
    
    System.out.println(set);
   }
}
   