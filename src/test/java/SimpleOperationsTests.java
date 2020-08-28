import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.*;

import static org.assertj.core.api.Assertions.*;

@RunWith(JUnitParamsRunner.class)
public class SimpleOperationsTests {

    SimpleOperations calc = new SimpleOperations();

    @Test
    @Parameters(method = "sumTestsData")
    public void sumTests(double firstNumber, double secondNumber, double expectedResult, String operationDescription) {
        assertThat(calc.sum(firstNumber, secondNumber))
                .as(operationDescription)
                .isCloseTo(expectedResult, within(0.000001));
    }

    private Object[] sumTestsData() {
        return new Object[]{
                new Object[]{3, 5, 8, "Should return the sum of two positive numbers without a fractional part"},
                new Object[]{-5, -3, -8, "Should return the sum of two negative numbers without a fractional part"},
                new Object[]{3, -5, -2, "Should return the sum of one positive and one negative numbers without a fractional part"},
                new Object[]{3.6, 5.35, 8.95, "Should return the sum of two positive numbers with a fractional part"},
                new Object[]{-3.5, -5.9, -9.4, "Should return the sum of two negative numbers with a fractional part"},
                new Object[]{3.57, -5.33, -1.76, "Should return the sum of one positive and one negative numbers with a fractional part"},
                new Object[]{5, 0, 5, "The same number should be returned which is added with zero"}
        };
    }

    @Test
    @Parameters(method = "subtractionTestsData")
    public void subtractionTests(double firstNumber, double secondNumber, double expectedResult, String operationDescription) {
        assertThat(calc.subtract(firstNumber, secondNumber))
                .as(operationDescription)
                .isCloseTo(expectedResult, within(0.000001));
    }

    private Object[] subtractionTestsData() {
        return new Object[]{
                new Object[]{5, 3, 2, "Should return the subtraction of two positive numbers without a fractional part"},
                new Object[]{-5, -3, -2, "Should return the subtraction of two negative numbers without a fractional part"},
                new Object[]{-5, 3, -8, "Should return the subtraction of one negative and one positive numbers without a fractional part"},
                new Object[]{5.8, 3.2, 2.6, "Should return the subtraction of two positive numbers with a fractional part"},
                new Object[]{-5.6, -3.4, -2.2, "Should return the subtraction of two negative numbers with a fractional part"},
                new Object[]{-5.54, 3.23, -8.77, "Should return the subtraction of One Negative and One Positive numbers with a fractional part"},
                new Object[]{5.234567, 0, 5.234567, "The same number must be returned from which zero is subtracted"}
        };
    }

    @Test
    @Parameters(method = "multiplyTestsData")
    public void multiplyTests(double firstNumber, double secondNumber, double expectedResult, String operationDescription) {
        assertThat(calc.multiply(firstNumber, secondNumber))
                .as(operationDescription)
                .isCloseTo(expectedResult, within(0.000001));
    }

    private Object[] multiplyTestsData() {
        return new Object[]{
                new Object[]{5, 2, 10, "Should return the multiply of two positive numbers without a fractional part"},
                new Object[]{-5, -2, 10, "Should return the positive multiply of two negative numbers without a fractional part"},
                new Object[]{-5, 2, -10, "Should return the negative multiply of one negative and one positive numbers without a fractional part"},
                new Object[]{5.8, 3.2, 18.56, "Should return the positive multiply of two positive numbers with a fractional part"},
                new Object[]{-5.8, -3.2, 18.56, "Should return the positive multiply of two negative numbers with a fractional part"},
                new Object[]{-5.54, 3.23, -17.8942, "Should return the negative multiply of one negative and one positive numbers with a fractional part"},
                new Object[]{5.234567, 0, 0, "Zero must be returned if number and zero passed"}
        };
    }
}
