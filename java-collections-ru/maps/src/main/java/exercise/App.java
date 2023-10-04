package exercise;

import java.util.HashMap;
import java.util.Map;

// BEGIN
class App {
    public static Map getWordCount(String sentence) {
        Map<String, Integer> wordsCount = new HashMap<>();

        if (sentence.length() != 0) {
            String[] words = sentence.split(" ");

            for (String word : words) {
                if (wordsCount.containsKey(word)) {
                    wordsCount.put(word, wordsCount.get(word) + 1);
                } else {
                    wordsCount.put(word, 1);
                }
            }
        }

        return wordsCount;
    }

    public static String toString(Map wordsCount) {
        String result = "";

        if (wordsCount.isEmpty()) {
            result = "{}";
        } else {
            for (Object word : wordsCount.keySet()) {
                result += "  " + word + ": " + wordsCount.get(word) + "\n";
            }
            result = "{\n" + result + "}";
        }

        return result;
    }
}
//END
