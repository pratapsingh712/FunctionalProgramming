package revision;

import java.util.Arrays;
import java.util.List;

public class NoOfVowelsTwo {
    public static void main(String[] args) {

        String word = "I am learning streams API in I am learning Java learning";

        List<String> result = Arrays.stream(word.split(" "))
                .distinct()
                .filter(words -> countVowel(words)>=2)
                .toList();

        System.out.println(result);
    }

    private static long countVowel(String words) {

        Character Character;
        return words.toLowerCase()
                .chars()
                .filter(chr->"aeiou".indexOf(chr)!=-1)
                .count();
    }
}
