package main.java.exercise;

import java.util.Comparator;
import java.util.Map;
import java.util.List;
import java.time.LocalDate;
import java.util.Objects;
import java.util.stream.Collectors;

// BEGIN
public class Sorter {
    public static List<String> takeOldestMans(List<Map<String, String>> users) {
        return users.stream()
                .filter(user -> Objects.equals(user.get("gender"), "male"))
                .sorted(Comparator.comparing(user -> LocalDate.parse(user.get("birthday"))))
                .map(user -> user.get("name"))
                .collect(Collectors.toList());
    }
}
// END
