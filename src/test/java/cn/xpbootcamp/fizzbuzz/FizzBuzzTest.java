package cn.xpbootcamp.fizzbuzz;

import org.junit.Ignore;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class FizzBuzzTest {

    @Test
    void given_is_multiple_of_3_when_count_then_say_Fizz() {
        assertThat(FizzBuzz.say(3)).isEqualTo("Fizz");
        assertThat(FizzBuzz.say(6)).isEqualTo("Fizz");
        assertThat(FizzBuzz.say(9)).isEqualTo("Fizz");
        assertThat(FizzBuzz.say(12)).isEqualTo("Fizz");
    }

    @Test
    void given_is_multiple_of_5_when_count_then_say_Buzz() {
        assertThat(FizzBuzz.say(5)).isEqualTo("Buzz");
        assertThat(FizzBuzz.say(10)).isEqualTo("Buzz");
        assertThat(FizzBuzz.say(20)).isEqualTo("Buzz");
        assertThat(FizzBuzz.say(25)).isEqualTo("Buzz");
    }

    @Test
    void given_is_multiple_of_7_when_count_then_say_Whizz() {
        assertThat(FizzBuzz.say(7)).isEqualTo("Whizz");
        assertThat(FizzBuzz.say(14)).isEqualTo("Whizz");
        assertThat(FizzBuzz.say(28)).isEqualTo("Whizz");
        assertThat(FizzBuzz.say(49)).isEqualTo("Whizz");
    }

    @Test
    void given_is_multiple_of_3_and_5_when_count_then_say_FizzBuzz() {
        assertThat(FizzBuzz.say(15)).isEqualTo("FizzBuzz");
        assertThat(FizzBuzz.say(30)).isEqualTo("FizzBuzz");
        assertThat(FizzBuzz.say(45)).isEqualTo("FizzBuzz");
        assertThat(FizzBuzz.say(60)).isEqualTo("FizzBuzz");
    }

    @Test
    void given_is_multiple_of_3_and_7_when_count_then_say_FizzWhizz() {
        assertThat(FizzBuzz.say(21)).isEqualTo("FizzWhizz");
        assertThat(FizzBuzz.say(42)).isEqualTo("FizzWhizz");
        assertThat(FizzBuzz.say(84)).isEqualTo("FizzWhizz");
        assertThat(FizzBuzz.say(168)).isEqualTo("FizzWhizz");
    }

    @Test
    void given_is_multiple_of_5_and_7_when_count_then_say_BuzzWhizz() {
        assertThat(FizzBuzz.say(35)).isEqualTo("BuzzWhizz");
        assertThat(FizzBuzz.say(70)).isEqualTo("BuzzWhizz");
        assertThat(FizzBuzz.say(140)).isEqualTo("BuzzWhizz");
        assertThat(FizzBuzz.say(280)).isEqualTo("BuzzWhizz");
    }

    @Test
    void given_is_multiple_of_3_and_5_and_7_when_count_then_say_FizzBuzzWhizz() {
        assertThat(FizzBuzz.say(105)).isEqualTo("FizzBuzzWhizz");
        assertThat(FizzBuzz.say(210)).isEqualTo("FizzBuzzWhizz");
        assertThat(FizzBuzz.say(420)).isEqualTo("FizzBuzzWhizz");
        assertThat(FizzBuzz.say(840)).isEqualTo("FizzBuzzWhizz");
    }

    @Ignore
    @Test
    void given_is_not_multiple_of_3_or_5_or_7_when_count_then_say_number() {
        assertThat(FizzBuzz.say(1)).isEqualTo("1");
        assertThat(FizzBuzz.say(2)).isEqualTo("2");
        assertThat(FizzBuzz.say(13)).isEqualTo("13");
        assertThat(FizzBuzz.say(17)).isEqualTo("17");
        assertThat(FizzBuzz.say(509)).isEqualTo("509");
    }
}
