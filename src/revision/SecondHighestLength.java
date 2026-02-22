package revision;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class SecondHighestLength {
    public static void main(String[] args) {

        String word = "I am learning streams API in Java";

        String result = Arrays.stream(word.split(" "))
                .sorted(Comparator.comparingInt(String::length).reversed())
                        .skip(1)
                                .findFirst()
                                        .orElse("No Second Highest Length found :");

        System.out.println(result);
    }
}
