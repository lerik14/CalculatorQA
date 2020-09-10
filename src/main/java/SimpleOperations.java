import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SimpleOperations {

    public double sum(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }

    public double subtract(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }

    public double multiply(double firstNumber, double secondNumber) {
        return firstNumber * secondNumber;
    }

    public double divide(double firstNumber, double secondNumber) {
        if(secondNumber == 0) System.out.println("Exception. Divide by zero. Infinity will be returned.");
        return firstNumber / secondNumber;
    }
}
