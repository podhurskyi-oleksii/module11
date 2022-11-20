package Task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamMixer {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        Optional<Stream<T>> first1 = Optional.ofNullable(first);
        Optional<Stream<T>> second2 = Optional.ofNullable(second);

        List<T> streamFirst = first1.get().collect(Collectors.toList());
        List<T> streamSecond = second2.get().collect(Collectors.toList());

        int minSize = Math.min(streamFirst.size(), streamSecond.size());

        List<T> resultList = new ArrayList<>();

        for (int i = 0; i < minSize; i++) {
            resultList.add(streamFirst.get(i));
            resultList.add(streamSecond.get(i));
        }

        return resultList.stream();
    }

    public static void main(String[] args) {
        Stream<String> first = Stream.of("15", "20", "25", "30", "35");
        Stream<String> second = Stream.of("0", "1", "2", "3", "4", "5", "6", "7", "8");
        Stream<String> zip = zip(first, second);
        System.out.println(Arrays.toString(zip.toArray()));
    }
}
