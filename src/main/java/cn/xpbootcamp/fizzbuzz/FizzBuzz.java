package cn.xpbootcamp.fizzbuzz;

public class FizzBuzz {

    static String say(int number) {
        String sayWord = "";
        if (number % 3 == 0) {
            sayWord += "Fizz";
        }
        if (number % 5 == 0) {
            sayWord += "Buzz";
        }
        if (number % 7 == 0) {
            sayWord += "Whizz";
        }

        return sayWord;
    }
}
