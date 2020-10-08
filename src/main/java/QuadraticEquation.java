import static java.lang.Math.sqrt;

public class QuadraticEquation {
    public String run(double firstCoef, double secondCoef, double freeCoef) {
        double discriminant = discriminant(firstCoef, secondCoef, freeCoef);
        if(discriminant > 0) {
            double x1 = (-secondCoef + sqrt(discriminant))/(2*firstCoef);
            double x2 = (-secondCoef - sqrt(discriminant))/(2*firstCoef);
            return "The first root is " + x1 +'\n' + "The second root is " + x2;
        }
        if(discriminant == 0) {
            double x = (-secondCoef)/(2*firstCoef);
            return "The root is " + x;
        }
        if(discriminant < 0) {
            return "Quadratic equation has no solutions";
        }
        return "Invalid equation";
    }

    public double discriminant(double firstCoef, double secondCoef, double freeCoef) {
        return (secondCoef * secondCoef) - 4 * (firstCoef * freeCoef);
    }
}
