package revision;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReturnLengthOfSecondHighestWordLength {
    public static void main(String[] args) {

        String word = "I am learning streams learning API in  learning Java";

        int result = Arrays.stream(word.split(" "))
                .map(String::length)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElse(0);

        System.out.println(result);
    }
}
