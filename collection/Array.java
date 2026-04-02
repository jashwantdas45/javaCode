package collection;
import java.util.*;


public class Array {
 public static void main(String[] args) {
  
  Map<String,Integer> num = new HashMap<String,Integer>();
  
  num.put("Munna", 23);
   num.put("Kani", 29);
    num.put("ajay", 2302);
     num.put("vijay", 233);

  for(String key: num.keySet()){
    System.out.println(key+":"+num.get(key));
  }

 }
}
  