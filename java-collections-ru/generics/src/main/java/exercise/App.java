package src.main.java.exercise;

import java.util.*;
import java.util.Map.Entry;

// BEGIN
public class App {
    public static List<Map<String, String>> findWhere(List<Map<String, String>> books, Map<String, String> where) {
        List<Map<String, String>> result = new ArrayList<>();
        for (Map<String, String> book: books) {
            Set<String> bookSet = new HashSet<>();
            Set<String> whereSet = new HashSet<>();

            bookSet.addAll(book.keySet());
            bookSet.addAll(book.values());

            whereSet.addAll(where.keySet());
            whereSet.addAll(where.values());

            if (bookSet.containsAll(whereSet)) {
                result.add(book);
            }
        }
        return result;
    }
}
//END
