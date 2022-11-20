package Task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NameFilterTest {
    private static final List<String> listName = Arrays.asList("Bonnie", "Joshua", "Lori", "James", "Carlos", "Cassandra", "Jesse");

    public static void main(String[] args) {
        System.out.print("All names: ");
        nameNumber((n) -> 0 == n, listName);
        System.out.print("Odd names: ");
        nameNumberOdd((n) -> n % 2 == 1, listName);
    }

    public static void nameNumber(NameFilter nameNumber, List<String> names) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < names.size(); i++) {
            String lastName = listName.get(i);
            result.add(i + ". " + lastName);
        }
        System.out.println(result);
    }

    public static void nameNumberOdd(NameFilter nameNumber, List<String> names) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < names.size(); i++) {
            if (!nameNumber.oddName(i)) continue;
            String lastName = listName.get(i);
            result.add(i + ". " + lastName);
        }
        System.out.println(result);
    }
}