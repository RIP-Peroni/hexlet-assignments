package test.java.exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import main.java.exercise.App;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        List<Integer> numbers1 = new ArrayList<>();
        List<Integer> taken1 = App.take(numbers1, 10);
        assertThat(taken1.size()).isEqualTo(0);
        numbers1.add(1);
        numbers1.add(2);
        numbers1.add(3);
        numbers1.add(4);
        List<Integer> taken2 = App.take(numbers1, 10);
        assertThat(taken2.size()).isEqualTo(4);
        assertThat(taken2.get(taken2.size() - 1)).isEqualTo(4);
        List<Integer> taken3 = App.take(numbers1, 0);
        assertThat(taken3.size()).isEqualTo(0);

        // END
    }
}
