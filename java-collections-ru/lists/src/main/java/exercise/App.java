package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {
    public static boolean scrabble(String letters, String word) {
        String[] lettersChars = letters.toLowerCase().split("");
        List<String> sourceCharList = new ArrayList<>(Arrays.asList(lettersChars));

        String[] wordChars = word.toLowerCase().split("");
        List<String> wordCharList = new ArrayList<>(Arrays.asList(wordChars));

        if (sourceCharList.size() < wordCharList.size()) {
            return false;
        }

        for (String character : wordCharList) {
            if (!sourceCharList.contains(character)) {
                return false;
            }
            sourceCharList.remove(character);
        }

        return true;
    }
}
//END
