import org.junit.Test;

import static org.assertj.core.api.Assertions.*;

public class CalculatorOldTests {
    private final Calculator calc = new Calculator();

    @Test
    public void sumOfTwoPositiveIntNumbersTest() {
        double sumResult = calc.sum(3, 5);
        assertThat(sumResult)
                .as("Should return the sum of two positive numbers without fractional part")
                .isEqualTo(8);
    }

    @Test
    public void sumOfTwoNegativeIntNumbersTest() {
        double sumResult = calc.sum(-3, -5);
        assertThat(sumResult)
                .as("Should return the sum of two negative numbers without fractional part")
                .isEqualTo(-8);
    }

    @Test
    public void sumOfOneNegativeOnePositiveIntNumbersTest() {
        double sumResult = calc.sum(3, -5);
        assertThat(sumResult)
                .as("Should return the sum of one positive and one negative numbers without fractional part")
                .isEqualTo(-2);
    }

    @Test
    public void sumOfTwoPositiveDoubleNumbersTest() {
        double sumResult = calc.sum(3.6, 5.35);
        assertThat(sumResult)
                .as("Should return the sum of two positive numbers with fractional part")
                .isEqualTo(8.95);
    }

    @Test
    public void sumOfTwoNegativeDoubleNumbersTest() {
        double sumResult = calc.sum(-3.5, -5.9);
        assertThat(sumResult)
                .as("Should return the sum of two negative numbers with fractional part")
                .isEqualTo(-9.4);
    }

    @Test
    public void sumOfOneNegativeOnePositiveDoubleNumbersTest() {
        double sumResult = calc.sum(3.57, -5.33);
        assertThat(sumResult)
                .as("Should return the sum of one positive and one negative numbers with fractional part")
                .isEqualTo(-1.76);
    }

    @Test
    public void subtractionOfTwoPositiveIntNumbersTest() {
        double subtractionResult = calc.subtraction(5, 3);
        assertThat(subtractionResult)
                .as("Should return the subtraction of two positive numbers without fractional part")
                .isEqualTo(2.0);
    }

    @Test
    public void subtractionOfTwoNegativeIntNumbersTest() {
        double subtractionResult = calc.subtraction(-5, -3);
        assertThat(subtractionResult)
                .as("Should return the subtraction of two negative numbers without fractional part")
                .isEqualTo(-2);
    }

    @Test
    public void subtractionOfOneNegativeOnePositiveIntNumbersTest() {
        double subtractionResult = calc.subtraction(-5, 3);
        assertThat(subtractionResult)
                .as("Should return the subtraction of One Negative and One Positive numbers without fractional part")
                .isEqualTo(-8);
    }

    @Test
    public void subtractionOfTwoPositiveDoubleNumbersTest() {
        double subtractionResult = calc.subtraction(5.8, 3.2);
        assertThat(subtractionResult)
                .as("Should return the subtraction of two positive numbers with fractional part")
                .isEqualTo(2.6);
    }

    @Test
    public void subtractionOfTwoNegativeDoubleNumbersTest() {
        double subtractionResult = calc.subtraction(-5.6, -3.4);
        assertThat(subtractionResult)
                .as("Should return the subtraction of two negative numbers with fractional part")
                .isEqualTo(-2.2);
    }

    @Test
    public void subtractionOfOneNegativeOnePositiveDoubleNumbersTest() {
        double subtractionResult = calc.subtraction(-5.54, 3.23);
        assertThat(subtractionResult)
                .as("Should return the subtraction of One Negative and One Positive numbers with fractional part")
                .isEqualTo(-8.77);
    }

    @Test
    public void doubleOverflowExceptionTest() {
        assertThatExceptionOfType(ArithmeticException.class)
                .as("Should return arithmetic exception when double overflow")
                .isThrownBy(() -> calc.sum(Double.MAX_VALUE, Double.MAX_VALUE));
    }

    @Test
    public void sumOfDoubleValueAndZero() {
        double sumResult = calc.sum(5.234567, 0);
        assertThat(sumResult)
                .as("The same number should be returned, which is added with zero")
                .isEqualTo(5.234567);
    }

    @Test
    public void subtractionOfDoubleValueAndZero() {
        double subtractionResult = calc.sum(5.234567, 0);
        assertThat(subtractionResult)
                .as("The same number must be returned from which zero is subtracted")
                .isEqualTo(5.234567);
    }
}
