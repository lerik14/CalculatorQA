//import org.testng.annotations.*;
//import org.testng.Assert;
//
//
//public class QuadraticEquationTests {
//
//    private final QuadraticEquation quadraticEquation = new QuadraticEquation();
//
//    @Test(groups = {"discriminant tests", "quadratic equation tests"})
//    public void negativeDiscriminantTest() {
//        double actualResult = quadraticEquation.discriminant(3, -4, 2);
//        Assert.assertEquals(actualResult, -8, 0.0001, "Calculating the negative discriminant");
//    }
//
//    @Test(groups = {"discriminant tests", "quadratic equation tests"})
//    public void positiveDiscriminantTest() {
//        double actualResult = quadraticEquation.discriminant(1, -4, -5);
//        Assert.assertEquals(actualResult, 36, 0.0001, "Calculating the positive discriminant");
//    }
//
//    @Test(groups = {"discriminant tests", "quadratic equation tests"})
//    public void zeroDiscriminantTest() {
//        double actualResult = quadraticEquation.discriminant(1, -6, 9);
//        Assert.assertEquals(actualResult, 0, 0.0001, "Calculating the zero discriminant");
//    }
//
//    @Test(groups = {"root tests", "quadratic equation tests"})
//    public void twoRootsTest() {
//        String actualResult = quadraticEquation.run(1, -4, -5);
//        Assert.assertEquals(actualResult, "The first root is 5.0" +'\n' + "The second root is -1.0");
//    }
//
//    @Test(groups = {"root tests", "quadratic equation tests"})
//    public void oneRootTest() {
//        String actualResult = quadraticEquation.run(1, -6, 9);
//        Assert.assertEquals(actualResult, "The root is 3.0");
//    }
//
//    @Test(groups = {"root tests", "quadratic equation tests"})
//    public void noRootTest() {
//        String actualResult = quadraticEquation.run(3, -4, 2);
//        Assert.assertEquals(actualResult, "Quadratic equation has no solutions");
//    }
//
//    @Test(groups = {"root tests", "quadratic equation tests"})
//    public void nullRootTest() {
//        String actualResult = quadraticEquation.run(0, 0, 0);
//        Assert.assertEquals(actualResult, "The root is NaN");
//    }
//}
