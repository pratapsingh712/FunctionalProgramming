package revision;

import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Stream;

public class HighestLengthWord {
    public static void main(String[] args) {

        String word = "I am learning streams API in Java";

        Stream<String> maxWordLength = Arrays.stream(word.split(" "));

        String maxWord = maxWordLength.
                sorted(Comparator.comparing(String::length).reversed())
                .findFirst().get();

        System.out.println(maxWord);

        System.out.println();

        System.out.println("OR we can also do it with the help of max function :");

        System.out.println();

        String getMaxWord = Arrays.stream(word.split(" "))
                .max(Comparator.comparingInt(String::length))
                .orElse("Did not find any value ");

        System.out.println(getMaxWord);

        System.out.println("***********************************************");

        // let's the the minimum length word

        String minLengthWord = Arrays.stream(word.split(" "))
                .min(Comparator.comparingInt(String::length))
                .orElse("Did not find any Value :");

        System.out.println(minLengthWord);
    }
}
