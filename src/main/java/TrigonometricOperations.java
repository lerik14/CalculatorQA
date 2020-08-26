import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrigonometricOperations {

    public void run() throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Which operation to perform: ");
        System.out.println("1. Cos");
        System.out.println("2. Sin");
        System.out.println("0. Back");
        int operationNumber = Integer.parseInt(reader.readLine());
        if (operationNumber == 0) {
            Calculator calculator = new Calculator();
            calculator.run();
        }
        System.out.println("Input angle: ");
        double firstNumber = Double.parseDouble(reader.readLine());
        switch (operationNumber) {
            case 1:
                System.out.println(cos(firstNumber));
                break;
            case 2:
                System.out.println(sin(firstNumber));
                break;
            default:
                System.out.println("Operation number is not supported.");
                break;
        }
    }

    public double cos(double number) {
        return Math.cos(number);
    }

    public double sin(double number) {
        return Math.sin(number);
    }
}
