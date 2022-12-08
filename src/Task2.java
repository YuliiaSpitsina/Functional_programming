import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class Task2 {
    public static Map<String, Integer> calcWordFrequency(String text) {
        Map<String, Integer> resultMap = new HashMap<>();
        String[] lines = text
                .split("\n");

        for (String line : lines) {
            Integer   oldCount = resultMap.get(line);
            Integer newCount = oldCount == null ? 1 : oldCount + 1;

            resultMap.put(line, newCount);

        }
        Iterator<Map.Entry<String, Integer>> iterator = resultMap.entrySet().iterator();

        while (iterator.hasNext()){
            Map.Entry<String, Integer> pair = iterator.next();
            String key = pair.getKey();
            int value = pair.getValue();
            if (value > 1 || key.length() < 8)
                iterator.remove();
        }

        return resultMap;
    }

}

class Demo {
    public static void main(String[] args) {
        String text = """
                Я повторюю тобі
                Я повторюю тобі
                Борщ
                Хочу миру всюду 
                Хочу перемоги
                
                """;
        Map<String, Integer> resultMap = Task2.calcWordFrequency(text);
        System.out.println(resultMap);
        System.out.println("Кількість унікальних рядків: " + resultMap.size());
    }
}
