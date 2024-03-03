import java.util.List;

public class Middle {
public int countMiddle(List<Integer> list) {
    int sum = 0;
   for (Integer elemeht: list) {
       sum += elemeht;
   }
   return sum / list.size();
}
}
