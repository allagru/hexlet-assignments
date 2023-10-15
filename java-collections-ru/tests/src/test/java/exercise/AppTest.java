package exercise;

import static org.assertj.core.api.Assertions.assertThat;
import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

class AppTest {

    @Test
    void testTake() {
        // BEGIN
        List<Integer> numbers1 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> result1 = new ArrayList<>(Arrays.asList(1, 2));
        assertThat(App.take(numbers1, 2)).isEqualTo(result1);

        List<Integer> numbers2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        List<Integer> result2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4));
        assertThat(App.take(numbers2, 20)).isEqualTo(result2);

        List<Integer> numbers3 = new ArrayList<>();
        List<Integer> result3 = new ArrayList<>();
        assertThat(App.take(numbers3, 20)).isEqualTo(result3);
        // END
    }
}
