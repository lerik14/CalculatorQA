import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {

    public void run() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Which operation to perform: ");
        System.out.println("1. Sum");
        System.out.println("2. Sub");
        int operationNumber = Integer.parseInt(reader.readLine());
        System.out.println("Input first number: ");
        double firstNumber = Double.parseDouble(reader.readLine());
        System.out.println("Input second number: ");
        double secondNumber = Double.parseDouble(reader.readLine());

        switch (operationNumber) {
            case 1:
                System.out.println(sum(firstNumber, secondNumber));
            break;
            case 2:
                System.out.println(sub(firstNumber, secondNumber));
            break;
            default:
                System.out.println("Invalid number");
                break;
        }
    }


    private double sum(double firstNumber, double secondNumber) {
        return firstNumber + secondNumber;
    }
    private double sub(double firstNumber, double secondNumber) {
        return firstNumber - secondNumber;
    }
}
