package revision;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PracticeMapToObj {
    public static void main(String[] args) {

        String str = "abc";

        IntStream charStream = str.chars();

        charStream.forEach(ch -> System.out.println((char)ch));


        str.chars()
                .distinct()
                .mapToObj(ch -> String.valueOf((char)ch))
                .forEach(System.out::println);

        String string = "aAbBcC";

        String distinctResult = string.chars()
                .map(Character::toLowerCase)
                .distinct()
                .mapToObj(ch -> String.valueOf((char)ch))
                .collect(Collectors.joining());

        System.out.println("After removing the duplicates we get :"+distinctResult);
    }
}
