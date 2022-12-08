import java.util.*;
public class Task3 {
        public static void main(String[] args){
            Map<String,Integer> map = new HashMap();
            map.put("First", 5);
            map.put("Second", 3);
            map.put("ExactlyThird", 2);
            int sum = 0;
            Set<String> setKeys = map.keySet();
            for(String k: setKeys){
                if (k.length() < 7)
                    sum += map.get(k);
            }
            System.out.println(sum);
        }
}
