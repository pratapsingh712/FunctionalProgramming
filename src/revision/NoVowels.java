package revision;

import java.util.Arrays;
import java.util.List;

public class NoVowels {
    public static void main(String[] args) {

        String word = "I am learning streams API in I am learning Java learning myth, hymn, crypt, shh, hmm, psst, rhythm, cwm, and nth";

        List<String> noVowels = Arrays.stream(word.split("[^a-zA-Z]+"))
                .distinct()
                .filter(words -> checkNoVowels(words)==0)
                .toList();

        System.out.println(noVowels);

    }

    private static long checkNoVowels(String word) {

        String vowels = "aeiou";

        return word.chars()
                .map(Character::toLowerCase)
                .filter(character -> vowels.indexOf(character)!=-1)
                .count();
    }
}
