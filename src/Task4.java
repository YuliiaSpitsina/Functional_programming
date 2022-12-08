

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

    public class Task4 {
        public static void main(String[] args)
        {
            List<Integer> list = new ArrayList<>(Arrays.asList(5,2,4,2,1));
            System.out.println(list);
            StringBuilder str = new StringBuilder();

            for(Integer number : list) {
                str.append(number);
            }
                    System.out.println(str);
        }
    }


