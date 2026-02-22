package revision;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromTheString {
    public static void main(String[] args) {

        String s = "dabcadefg";

        // let's convert the string into stream and get back the resume

        String result = Arrays.stream(s.split(""))
                .distinct().collect(Collectors.joining());

        System.out.println("Word without duplicates :"+result);
    }
}
