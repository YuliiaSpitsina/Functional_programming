
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 5, 10, 11, 15, 17));
        List<Integer> list1 = removeEven(list);
        System.out.println(list);
        System.out.println("Average: " + average(list1));
    }
  private static List<Integer> removeEven (List<Integer> list){
        List<Integer> result = new ArrayList<>();
      for (Integer number : list) {
          if (number %2 !=0)
              if (number % 5 == 0)
                  result.add(number);
      }
        return result;
  }

  private static double average (List<Integer> list1) {
      double sum = 0;
      for(Integer number : list1) {
          sum+=number;
      }
      return sum/list1.size();
  }

}