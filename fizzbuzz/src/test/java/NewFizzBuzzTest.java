package fizzbuzz.src.test.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import fizzbuzz.src.main.java.NewFizzBuzz;

public class NewFizzBuzzTest {

    private NewFizzBuzz newFizz;

    @BeforeEach
    public void setUp() {
        newFizz = new NewFizzBuzz();
    }

    @Test
    @DisplayName("A multiple of 3 returns Fizz")
    public void multipleOf3() {
        String value = newFizz.getNumber(12);
        Assertions.assertEquals("Fizz", value);
    }

    @Test
    @DisplayName("A multiple of 5 returns Buzz")
    public void multipleOf5() {
        String value = newFizz.getNumber(25);
        Assertions.assertEquals("Buzz", value);
    }

    @Test
    @DisplayName("A multiple of 5 and 3 returns FizzBuzz")
    public void multipleOf5And3() {
        String value = newFizz.getNumber(15);
        Assertions.assertEquals("FizzBuzz", value);
    }

    @Test
    @DisplayName("A number that is not a multiple of 3 or 5 returns itself")
    public void nonMultipleOf5Or3() {
        int number = 19;
        String value = newFizz.getNumber(number);
        Assertions.assertEquals(String.valueOf(number), value);
    }
}
