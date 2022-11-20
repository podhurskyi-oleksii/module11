package Task2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class NameToUpperCaseSortTest {
    public String[] reverseSortByUpperCase(String[] data) {
        Optional<String[]> dats = Optional.of(data);
        Stream<String> result = Stream.of(dats.get())
                .sorted(Comparator.reverseOrder())
                .map(String::toUpperCase);

        return result.toArray(String[]::new);
    }

    public static void main(String[] args) {
        NameToUpperCaseSortTest test = new NameToUpperCaseSortTest();
        String[] names = new String[]{"Bonnie", "Joshua", "Lori", "James", "Carlos", "Cassandra", "Jesse"};
        String[] result = test.reverseSortByUpperCase(names);
        System.out.println(Arrays.toString(result));
    }
}
