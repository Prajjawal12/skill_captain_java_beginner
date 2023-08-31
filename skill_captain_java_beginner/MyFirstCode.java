import java.util.ArrayList;
import java.util.List;
public class MyFirstCode{
  public static void main(String[] args){
    List myList = new ArrayList<int>();
    myList.add(1);
    myList.add(2);
    myList.add(3);
    for(int num:myList){
      System.out.println(num);
    }
  }
}