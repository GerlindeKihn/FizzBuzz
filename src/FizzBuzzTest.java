import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


class FizzBuzzTest {

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 20, 25})
    void printFizzBuzzPrintBuzz(int i) {

        // act
        String result = FizzBuzz.getFizzBuzz(i);

        // assert
        Assertions.assertEquals("Buzz", result);
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 9, 12, 18})
    void printFizzBuzzPrintFizz(int i) {

        // act
        String result = FizzBuzz.getFizzBuzz(i);

        // assert
        Assertions.assertEquals("Fizz", result);
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 30, 45, 60})
    void printFizzBuzzPrintFizzBuzz(int i) {

        // act
        String result = FizzBuzz.getFizzBuzz(i);

        // assert
        Assertions.assertEquals("FizzBuzz", result);
    }

    @ParameterizedTest
    @ValueSource(ints = {11, 22, 32, 77})
    void printFizzBuzzPrintValueOfI(int i) {

        // act
        String result = FizzBuzz.getFizzBuzz(i);

        // assert
        Assertions.assertEquals(String.valueOf(i), result);
    }
}