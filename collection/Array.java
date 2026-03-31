package collection;
import java.util.ArrayList;
import java.util.Collection;

public class Array {
 public static void main(String[] args) {
  
  Collection<Integer> num = new ArrayList<Integer>();
  num.add(10);
  num.add(38);
  num.add(30);
  num.add(13);
  num.add(20);

  for(int i:num){
    System.out.println(i);
  }

 }
}
  