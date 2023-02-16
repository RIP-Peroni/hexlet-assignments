package exercise;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

// BEGIN
public class App {
    public static boolean scrabble(String text, String word) {
        List<String> textList = new ArrayList<>(Arrays.asList(text.split("")));
        List<String> wordList = new ArrayList<>(Arrays.asList(word.split("")));
        for (String t: wordList) {
            if (textList.contains(t.toLowerCase()) || textList.contains(t.toUpperCase())) {
                System.out.println(textList);
                System.out.println("textList contains t:" + t);
                textList.remove(t);
                System.out.println(textList);
            } else {
                return false;
            }
        }
        return true;
    }
}
//END
