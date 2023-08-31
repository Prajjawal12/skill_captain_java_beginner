import java.util.ArrayList;
import java.util.List;
public class App{
  public static void main(String[] args){
    List<Integer> myList = new ArrayList<>();
    myList.add(1);
    myList.add(2);
    myList.add(3);
    for(int num:myList){
      System.out.println(num);
    }
  }
}