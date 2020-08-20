import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTests {
    private final Calculator calc = new Calculator();

    @Test
    public void sumOfTwoPositiveIntNumbersTest() {
        double sumResult = calc.sum(3, 5);
        assertEquals("Should return the sum of two positive numbers without fractional part", 8.0, sumResult, 0.0001);
    }

    @Test
    public void sumOfTwoNegativeIntNumbersTest() {
        double sumResult = calc.sum(-3, -5);
        assertEquals("Should return the sum of two negative numbers without fractional part", -8.0, sumResult, 0.0001);
    }

    @Test
    public void sumOfOneNegativeOnePositiveIntNumbersTest() {
        double sumResult = calc.sum(3, -5);
        assertEquals("Should return the sum of one positive and one negative numbers without fractional part", -2.0, sumResult, 0.0001);
    }

    @Test
    public void sumOfTwoPositiveDoubleNumbersTest() {
        double sumResult = calc.sum(3.6, 5.35);
        assertEquals("Should return the sum of two positive numbers with fractional part", 8.95, sumResult, 0.0001);
    }

    @Test
    public void sumOfTwoNegativeDoubleNumbersTest() {
        double sumResult = calc.sum(-3.5, -5.9);
        assertEquals("Should return the sum of two negative numbers with fractional part", -9.4, sumResult, 0.0001);
    }

    @Test
    public void sumOfOneNegativeOnePositiveDoubleNumbersTest() {
        double sumResult = calc.sum(3.57, -5.33);
        assertEquals("Should return the sum of one positive and one negative numbers with fractional part", -1.76, sumResult, 0.0001);
    }

    @Test
    public void subtractionOfTwoPositiveIntNumbersTest() {
        double subtractionResult = calc.subtraction(5, 3);
        assertEquals("Should return the subtraction of two positive numbers without fractional part", 2.0, subtractionResult, 0.0001);
    }

    @Test
    public void subtractionOfTwoNegativeIntNumbersTest() {
        double subtractionResult = calc.subtraction(-5, -3);
        assertEquals("Should return the subtraction of two negative numbers without fractional part", -2.0, subtractionResult, 0.0001);
    }

    @Test
    public void subtractionOfOneNegativeOnePositiveIntNumbersTest() {
        double subtractionResult = calc.subtraction(-5, 3);
        assertEquals("Should return the subtraction of One Negative and One Positive numbers without fractional part", -8.0, subtractionResult, 0.0001);
    }

    @Test
    public void subtractionOfTwoPositiveDoubleNumbersTest() {
        double subtractionResult = calc.subtraction(5.8, 3.2);
        assertEquals("Should return the subtraction of two positive numbers with fractional part", 2.6, subtractionResult, 0.0001);
    }

    @Test
    public void subtractionOfTwoNegativeDoubleNumbersTest() {
        double subtractionResult = calc.subtraction(-5.6, -3.4);
        assertEquals("Should return the subtraction of two negative numbers with fractional part", -2.2, subtractionResult, 0.0001);
    }

    @Test
    public void subtractionOfOneNegativeOnePositiveDoubleNumbersTest() {
        double subtractionResult = calc.subtraction(-5.54, 3.23);
        assertEquals("Should return the subtraction of One Negative and One Positive numbers with fractional part", -8.77, subtractionResult, 0.0001);
    }

    @Test
    public void sumOfTwoBoundaryValuesTest() {
        double sumResult = calc.sum(Double.MAX_VALUE, Double.MAX_VALUE);
        assertEquals("Should return positive infinity when max double values passed", Double.POSITIVE_INFINITY, sumResult, 0.0001);
    }

    @Test
    public void sumOfDoubleValueAndZero() {
        double sumResult = calc.sum(5.234567, 0);
        assertEquals("The same number should be returned, which is added with zero", 5.234567, sumResult, 0.0001);
    }

    @Test
    public void subtractionOfDoubleValueAndZero() {
        double subtractionResult = calc.sum(5.234567, 0);
        assertEquals("The same number must be returned from which zero is subtracted", 5.234567, subtractionResult, 0.0001);
    }
}
