package Task3;

import java.util.Arrays;

public class SortArr {
    private static final String[] myStringArray = new String[]{"1, 2, 0", "4, 5"};

    public static void main(String[] args) {

        String[] myStringArrayChar = Arrays.stream(myStringArray)
                .flatMap((p) -> Arrays.stream(p.split(", ")))
                .toArray(String[]::new);

        int[] myIntArray = Arrays.stream(myStringArrayChar)
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();

        String myString = Arrays.toString(myIntArray).replaceAll("\\[|]|\\s", "");

        System.out.println(myString);
    }
}
