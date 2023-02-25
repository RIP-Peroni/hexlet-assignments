package src.main.java.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

// BEGIN
public class App {
    public static <K, V> List<Map<K, V>> findWhere(List<Map<K, V>> books, Map<K, V> where) {
        List<Map<K, V>> result = new ArrayList<>();
        for (Map<K, V> book: books) {
            boolean match = true;

            for (Entry<K, V> entry: where.entrySet()) {
                K key = entry.getKey();
                V value = entry.getValue();
                if (!book.containsKey(key) || !book.get(key).equals(value)) {
                    match = false;
                    break;
                }
            }

            if (match) {
                result.add(book);
            }
        }
        return result;
    }
}
//END
