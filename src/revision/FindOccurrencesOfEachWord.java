package revision;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindOccurrencesOfEachWord {
    public static void main(String[] args) {

        String word = "I am learning streams API in I am learning Java learning";

        Map<String, Long> occurrences = Arrays.stream(word.split(" "))
                .collect(Collectors.groupingBy(str -> str, Collectors.counting()));

        System.out.println(occurrences);

        // now let's try and find out word that has seen more than 3 times

        occurrences.entrySet().stream()
                .filter(stringLongEntry -> stringLongEntry.getValue()>=2)
                .forEach(System.out::println);
    }
}
