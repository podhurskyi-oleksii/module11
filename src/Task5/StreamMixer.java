package Task5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class StreamMixer {
    public static <T> Stream<T> zip(Stream<T> first, Stream<T> second) {
        final Iterator<T> itFirst = first.iterator();
        final Iterator<T> itSecond = second.iterator();
        List<T> result = new ArrayList<T>();
        while (itFirst.hasNext() && itSecond.hasNext()) {
            result.add(itFirst.next());
            result.add(itSecond.next());
        }
        return result.stream();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(zip(Stream.of(15, 20, 25, 30, 35), Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)).toArray()));
    }
}
