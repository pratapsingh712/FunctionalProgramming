package revision;

import java.util.Arrays;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromTheString {
    public static void main(String[] args) {

        String s = "dabcadefg";

        // let's convert the string into stream and get back the resume

//        String result = Arrays.stream(s.split(""))  performance overhead as stream of string will be created thus n string objects
//                .distinct().collect(Collectors.joining());

        String result = s.chars()
                        .distinct()
                                .mapToObj(c->String.valueOf((char)c))
                                        .collect(Collectors.joining());

        System.out.println("Word without duplicates :"+result);

    }
}
