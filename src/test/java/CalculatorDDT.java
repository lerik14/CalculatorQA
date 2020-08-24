import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static org.assertj.core.api.Assertions.*;

@RunWith(Parameterized.class)
public class CalculatorDDT {
    private final double firstNumber;
    private final double secondNumber;
    private final double expectedResult;
    private final String operationType;

    public CalculatorDDT(double x, double y, double expected, String operationType, String operationDescription) {
        this.firstNumber = x;
        this.secondNumber = y;
        this.expectedResult = expected;
        this.operationType = operationType;

    }

    @Parameterized.Parameters(name = "{index}: {4}")
    public static Iterable<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {3, 5, 8, "sum", "Should return the sum of two positive numbers without fractional part"},
                {-5, -3, -8, "sum", "Should return the sum of two negative numbers without fractional part"},
                {3, -5, -2,"sum", "Should return the sum of one positive and one negative numbers without fractional part"},
                {3.6, 5.35, 8.95, "sum", "Should return the sum of two positive numbers with fractional part"},
                {-3.5, -5.9, -9.4, "sum", "Should return the sum of two negative numbers with fractional part"},
                {3.57, -5.33, -1.76, "sum", "Should return the sum of one positive and one negative numbers with fractional part"},
                {5, 3, 2, "subtraction", "Should return the subtraction of two positive numbers without fractional part"},
                {-5, -3, -2, "subtraction", "Should return the subtraction of two negative numbers without fractional part"},
                {-5, 3, -8, "subtraction", "Should return the subtraction of One Negative and One Positive numbers without fractional part"},
                {5.8, 3.2, 2.6, "subtraction", "Should return the subtraction of two positive numbers with fractional part"},
                {-5.6, -3.4, -2.2, "subtraction", "Should return the subtraction of two negative numbers with fractional part"},
                {-5.54, 3.23, -8.77, "subtraction", "Should return the subtraction of One Negative and One Positive numbers with fractional part"},
                {Double.MAX_VALUE, Double.MAX_VALUE, Double.POSITIVE_INFINITY, "sum", "Should return positive infinity when max double values passed"},
                {5, 0, 5,"sum", "The same number should be returned, which is added with zero"},
                {5.234567, 0, 5.234567, "subtraction", "The same number must be returned from which zero is subtracted"}
        });
    }

    @Test
    public void test() {
        Calculator calc = new Calculator();
        double result = 0;
        if (operationType.equals("sum")) {
            result = calc.sum(firstNumber, secondNumber);
        }
        if (operationType.equals("subtraction")) {
            result = calc.subtraction(firstNumber, secondNumber);
        }
        assertThat(result)
                .isCloseTo(expectedResult, within(0.000001));
    }


}
