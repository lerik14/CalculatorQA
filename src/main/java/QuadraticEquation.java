import static java.lang.Math.sqrt;

public class QuadraticEquation {
    public void run(double firstCoef, double secondCoef, double freeCoef) {
        double discriminant = discriminant(firstCoef, secondCoef, freeCoef);
        if(discriminant > 0) {
            double x1 = (-secondCoef + sqrt(discriminant))/(2*firstCoef);
            double x2 = (-secondCoef - sqrt(discriminant))/(2*firstCoef);
            System.out.println("The first root is " + x1);
            System.out.println("The second root is " + x2);
        }
        if(discriminant == 0) {
            double x = (-secondCoef)/(2*firstCoef);
            System.out.println("The root is " + x);
        }
        if(discriminant < 0) {
            System.out.println("Quadratic equation has no solutions");
        }
    }

    private double discriminant(double firstCoef, double secondCoef, double freeCoef) {
        return (secondCoef * secondCoef) - 4 * (firstCoef * freeCoef);
    }
}
