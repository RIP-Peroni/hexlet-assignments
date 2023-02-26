package exercise;

import java.util.List;
import java.util.Arrays;

// BEGIN
public class App {
    public static String[] freeHosts = {
            "gmail.com",
            "yandex.ru",
            "hotmail.com",
    };
    public static int getCountOfFreeEmails(List<String> emails) {
        List<String> freeHostsList = Arrays.asList(freeHosts);
        return (int) emails.stream()
                .map(email -> email.split("@")[1])
                .filter(freeHostsList::contains)
                .count();
    }
}
// END

