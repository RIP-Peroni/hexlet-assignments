package main.java.exercise;

import java.util.Map;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.Objects;
// BEGIN
public class App {
    public static Map<String, String> genDiff(Map<String, Object> map1, Map<String, Object> map2) {
        Map<String, String> result = new LinkedHashMap<>();
        Set<String> uniqueKeys = new TreeSet<>();
        uniqueKeys.addAll(map1.keySet());
        uniqueKeys.addAll(map2.keySet());
        for (String key: uniqueKeys) {
            Object oldValue = map1.get(key);
            Object newValue = map2.get(key);
            if (!map2.containsKey(key)) {
                result.put(key, "deleted");
            } else if (!map1.containsKey(key)) {
                result.put(key, "added");
            } else if (!Objects.equals(oldValue, newValue)) {
                result.put(key, "changed");
            } else {
                result.put(key, "unchanged");
            }
        }
        return result;
    }
}
//END
