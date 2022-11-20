package Task4;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RandomNumberGenerator {
    private static final long A = 25214903917L;
    private static final long C = 11;
    private static final long M = 2 ^ 48;

    public static void main(String[] args) {

        long seed = 1L;
        List<Long> result = randomStream(A, C, M, seed)
                .limit(3)
                .collect(Collectors.toList());

        System.out.println(result);
    }

    public static Stream<Long> randomStream(long a, long c, long m, long seed) {
        return Stream.iterate(seed, x -> ((x * a + c) % m));
    }
}
