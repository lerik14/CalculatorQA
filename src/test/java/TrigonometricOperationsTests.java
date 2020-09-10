import junitparams.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import junitparams.mappers.CsvWithHeaderMapper;

import static org.assertj.core.api.Assertions.*;

@RunWith(JUnitParamsRunner.class)
public class TrigonometricOperationsTests {

    private final TrigonometricOperations calc = new TrigonometricOperations();

    @Test
    @FileParameters(value = "src/test/resources/cosTestDataFile.csv", mapper = CsvWithHeaderMapper.class)
    public void loadCosTests(double degreeAngle, double expectedResult) {
       assertThat(calc.cos(degreeAngle))
               .as("Should return the cosine of the passed angle")
               .isCloseTo(expectedResult, within(0.0001));
    }

    @Test
    public void cosNegativeAngleTest() {
        assertThat(calc.cos(-40))
                .as("Should return the same cosine of the positive and negative values")
                .isCloseTo(calc.cos(40), within(0.000001));
    }

    @Test
    @FileParameters(value = "src/test/resources/sinTestDataFile.csv", mapper = CsvWithHeaderMapper.class)
    public void loadSinTests(double degreeAngle, double expectedResult) {
       assertThat(calc.sin(degreeAngle))
               .as("Should return the sine of the passed angle")
               .isCloseTo(expectedResult, within(0.0001));
    }

    @Test
    public void sinNegativeAngleTest() {
        assertThat(calc.sin(-40))
                .as("Should return the negative sine of the positive value")
                .isCloseTo(-calc.sin(40), within(0.000001));
    }
}
