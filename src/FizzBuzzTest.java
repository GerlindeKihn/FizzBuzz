import org.junit.jupiter.api.Assertions;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @org.junit.jupiter.api.Test

    void printFizzBuzzPrintBuzz() {

        // act
        String result = FizzBuzz.getFizzBuzz(5);

        // assert
        Assertions.assertEquals("Buzz", result);
    }

    void printFizzBuzzPrintFizz() {

        // act
        String result = FizzBuzz.getFizzBuzz(3);

        // assert
        Assertions.assertEquals("Fizz", result);
    }

    void printFizzBuzzPrintFizzBuzz() {

        // act
        String result = FizzBuzz.getFizzBuzz(15);

        // assert
        Assertions.assertEquals("FizzBuzz", result);
    }
}