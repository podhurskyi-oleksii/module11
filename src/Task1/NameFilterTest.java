package Task1;

import java.util.*;

public class NameFilterTest {
    public String oddNames(String[] data) {
        Map<Integer, String> dataMap = new HashMap<>();
        for (int i = 0; i < data.length; i++) {
            dataMap.put(i, data[i]);
        }

        StringBuilder result = new StringBuilder();
        Optional<Map<Integer, String>> dataOptional = Optional.of(dataMap);
        dataOptional.get().entrySet()
                .stream()
                .filter(p -> p.getKey() % 2 != 0)
                .forEach(name -> result.append(name.getKey()).append(". ").append(name.getValue()).append(", "));
        return result.substring(0, result.length()-2);
    }

    public static void main(String[] args) {
        NameFilterTest test = new NameFilterTest();
        String[] data = new String[]{"Bonnie", "Joshua", "Lori", "James", "Carlos", "Cassandra", "Jesse"};
        String result = test.oddNames(data);
        System.out.println(result);
    }
}