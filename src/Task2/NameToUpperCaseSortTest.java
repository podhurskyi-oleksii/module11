package Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class NameToUpperCaseSortTest {
    private static final List<String> listName = Arrays.asList("Bonnie", "Joshua", "Lori", "James", "Carlos", "Cassandra", "Jesse");

    public static void main(String[] args) {
        List<String> nameUp = stringUp(String::toUpperCase);

        nameUp.sort(Collections.reverseOrder());

        System.out.println(nameUp);
    }

    static List<String> stringUp(NameToUpperCaseSort nameUp) {
        List<String> result = new ArrayList<>();
        for (String name : NameToUpperCaseSortTest.listName) {
            result.add(nameUp.func(name));
        }
        return result;
    }
}
