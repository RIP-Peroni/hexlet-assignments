package exercise;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

// BEGIN
public class App {
    public static Map getWordCount(String sentence) {
        if (sentence.equals("")) {
            return new HashMap<String, Integer>();
        }

        List<String> sentenceArr = new ArrayList<>(Arrays.asList(sentence.split(" ")));
        Map<String, Integer> result = new HashMap<>();

        for (String word: sentenceArr) {
            if (result.get(word) == null) {
                result.put(word, 0);
            }
            result.put(word, result.get(word) + 1);
        }
        return result;
    }

    public static String toString(Map wordsCount) {
        if (wordsCount.size() == 0) {
            return "{}";
        }
        List<String> resultArr = new ArrayList<>();
        Map<String, Integer> newWordsCount = new HashMap<>();
        newWordsCount.putAll(wordsCount);
        for (Map.Entry<String, Integer> entry: newWordsCount.entrySet()) {
            resultArr.add(entry.getKey() + ": " + entry.getValue());
        }
        return "{\n  " + String.join("\n  ", resultArr) + "\n}";
    }
}
//END
