package Task3;


import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class SortArr<T> {
    public String getSortedNumbers(T[] data) {
        Optional<T[]> data1 = Optional.of(data);
        Stream<Integer> peek = Stream.of(data1.get())
                .map(Object::toString)
                .flatMap((p) -> Arrays.stream(p.split(",")))
                .map(p -> Integer.parseInt(p.strip()))
                .sorted();
        String result = Arrays.toString(peek.toArray());
        return result.substring(1, result.length() - 1);
    }

    public static void main(String[] args) {
        String[] data = new String[]{"1, 2, 0", "4, 5"};
        SortArr<String> test = new SortArr<>();
        System.out.println(test.getSortedNumbers(data));
    }
}
