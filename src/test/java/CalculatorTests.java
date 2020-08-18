import org.junit.Assert;
import org.junit.Test;

public class CalculatorTests {
    @Test
    public void sumOfTwoPositiveIntNumbersTest() {
        Calculator calc = new Calculator();
        double sumResult = calc.sum(3,5);
        Assert.assertEquals("Should return the sum of two positive numbers", 8.0, sumResult, 0.0001);
    }
    @Test
    public void sumOfTwoNegativeIntNumbersTest() {
        Calculator calc = new Calculator();
        double sumResult = calc.sum(-3,-5);
        Assert.assertEquals("Should return the sum of two negative numbers", -8.0, sumResult, 0.0001);
    }
    @Test
    public void sumOfOneNegativeOnePositiveIntNumbersTest() {
        Calculator calc = new Calculator();
        double sumResult = calc.sum(3,-5);
        Assert.assertEquals("Should return the sum of one positive and one negative numbers", -2.0, sumResult, 0.0001);
    }
    @Test
    public void sumOfTwoPositiveDoubleNumbersTest() {
        Calculator calc = new Calculator();
        double sumResult = calc.sum(3.6,5.35);
        Assert.assertEquals("Should return the sum of two positive numbers", 8.95, sumResult, 0.0001);
    }
    @Test
    public void sumOfTwoNegativeDoubleNumbersTest() {
        Calculator calc = new Calculator();
        double sumResult = calc.sum(-3.5,-5.9);
        Assert.assertEquals("Should return the sum of two negative numbers", -9.4, sumResult, 0.0001);
    }
    @Test
    public void sumOfOneNegativeOnePositiveDoubleNumbersTest() {
        Calculator calc = new Calculator();
        double sumResult = calc.sum(3.57,-5.33);
        Assert.assertEquals("Should return the sum of one positive and one negative numbers", -1.76, sumResult, 0.0001);
    }
    @Test
    public void sumOfTwoBoundaryValuesTest() {
        Calculator calc = new Calculator();
        double sumResult = calc.sum(Double.MAX_VALUE,Double.MAX_VALUE);
        Assert.assertEquals("Should return the sum of two boundary values", Double.POSITIVE_INFINITY, sumResult, 0.0001);
    }
    @Test
    public void subtractionOfTwoPositiveIntNumbersTest() {
        Calculator calc = new Calculator();
        double subtractionResult = calc.subtraction(5,3);
        Assert.assertEquals("Should return the subtraction of two positive numbers", 2.0, subtractionResult, 0.0001);
    }
    @Test
    public void subtractionOfTwoNegativeIntNumbersTest() {
        Calculator calc = new Calculator();
        double subtractionResult = calc.subtraction(-5,-3);
        Assert.assertEquals("Should return the subtraction of two negative numbers", -2.0, subtractionResult, 0.0001);
    }
    @Test
    public void subtractionOfOneNegativeOnePositiveIntNumbersTest() {
        Calculator calc = new Calculator();
        double subtractionResult = calc.subtraction(-5,3);
        Assert.assertEquals("Should return the subtraction of One Negative and One Positive numbers", -8.0, subtractionResult, 0.0001);
    }
    @Test
    public void subtractionOfTwoPositiveDoubleNumbersTest() {
        Calculator calc = new Calculator();
        double subtractionResult = calc.subtraction(5.8,3.2);
        Assert.assertEquals("Should return the subtraction of two positive numbers", 2.6, subtractionResult, 0.0001);
    }
    @Test
    public void subtractionOfTwoNegativeDoubleNumbersTest() {
        Calculator calc = new Calculator();
        double subtractionResult = calc.subtraction(-5.6,-3.4);
        Assert.assertEquals("Should return the subtraction of two negative numbers", -2.2, subtractionResult, 0.0001);
    }
    @Test
    public void subtractionOfOneNegativeOnePositiveDoubleNumbersTest() {
        Calculator calc = new Calculator();
        double subtractionResult = calc.subtraction(-5.54,3.23);
        Assert.assertEquals("Should return the subtraction of One Negative and One Positive numbers", -8.77, subtractionResult, 0.0001);
    }
    @Test
    public void subtractionOfTwoNegativeBoundaryValuesTest() {
        Calculator calc = new Calculator();
        double sumResult = calc.subtraction(Double.MIN_VALUE,Double.MIN_VALUE);
        Assert.assertEquals("Should return the subtraction of two boundary values", 0, sumResult, 0.0001);
    }
}
