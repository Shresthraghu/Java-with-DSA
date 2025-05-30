 // LinkedHashSet Example :-

import java.util.*;

public class IceCream{
  public static void main(String[]args){
    Set<String>set= new LinkedHashSet<String>();

    set.add("Strawberry");
    set.add("Vanilla");
    set.add("Chocolate");
    set.add("Mango");
    set.add("Chocolate");
    set.add("Strawberry");

    System.out.println(set);
 }
}