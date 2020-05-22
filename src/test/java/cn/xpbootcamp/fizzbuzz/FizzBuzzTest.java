package cn.xpbootcamp.fizzbuzz;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    String threeWord = "Fizz";
    String fiveWord = "Buzz";
    String sevenWord = "Whizz";

    String threeFiveWord = "FizzBuzz";
    String fiveSevenWord = "BuzzWhizz";
    String threeSevenWord = "FizzWhizz";

    String threeFiveSevenSevenWord = "FizzBuzzWhizz";

    @Test
    void init() {
        assertThat(1).isEqualTo(1);
    }

}
