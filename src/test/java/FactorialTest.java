import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {
    @Test
    void shouldReturnOneWhenZeroIsGiven() {
        int number = 0;
        int expected = 1;

        Factorial factorial = new Factorial();
        int result = factorial.find(number);

        assertEquals(expected, result);

    }

    @Test
    void shouldReturnTheNumberIfTheGivenNumberIsNegative() {
        int number = -2;
        int expected = -2;

        Factorial factorial = new Factorial();
        int result = factorial.find(number);

        assertEquals(expected, result);
    }

    @Test
    void ShouldReturnTwentyFourIfFourIsGiven() {
        int number = 4;
        int expected = 24;

        Factorial factorial = new Factorial();
        int result = factorial.find(number);

        assertEquals(expected, result);
    }

}
