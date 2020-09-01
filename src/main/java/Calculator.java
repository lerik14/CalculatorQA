import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {

    private final SimpleOperations simpleOperations = new SimpleOperations();
    private final TrigonometricOperations trigonometricOperations = new TrigonometricOperations();
    private final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public void run() throws IOException {
        System.out.println("Which operation type to perform: ");
        System.out.println("1. Simple operations");
        System.out.println("2. Trigonometric operations");
        System.out.println("0. Exit");
        int operationNumber = Integer.parseInt(reader.readLine());
        switch (operationNumber) {
            case 1:
                simpleOperationsRun();
                break;
            case 2:
                trigonometricOperationsRun();
                break;
            case 0:
                return;
            default:
                System.out.println("Operation type is not supported.");
                break;
        }
        run();
    }

    public void simpleOperationsRun() throws IOException {
        System.out.println("Which operation to perform: ");
        System.out.println("1. Sum");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("0. Back");
        int operationNumber = Integer.parseInt(reader.readLine());
        if (operationNumber == 0) run();
        System.out.println("Input first number: ");
        double firstNumber = Double.parseDouble(reader.readLine());
        System.out.println("Input second number: ");
        double secondNumber = Double.parseDouble(reader.readLine());
        switch (operationNumber) {
            case 1:
                System.out.println(simpleOperations.sum(firstNumber, secondNumber));
                break;
            case 2:
                System.out.println(simpleOperations.subtract(firstNumber, secondNumber));
                break;
            case 3:
                System.out.println(simpleOperations.multiply(firstNumber, secondNumber));
                break;
            case 4:
                System.out.println(simpleOperations.divide(firstNumber, secondNumber));
                break;
            default:
                System.out.println("Operation number is not supported.");
                break;
        }
    }

    public void trigonometricOperationsRun() throws IOException {
        System.out.println("Which operation to perform: ");
        System.out.println("1. Cos");
        System.out.println("2. Sin");
        System.out.println("0. Back");
        int operationNumber = Integer.parseInt(reader.readLine());
        if (operationNumber == 0) run();
        System.out.println("Input angle in degrees: ");
        double angleDegree = Double.parseDouble(reader.readLine());
        switch (operationNumber) {
            case 1:
                System.out.println(trigonometricOperations.cos(angleDegree));
                break;
            case 2:
                System.out.println(trigonometricOperations.sin(angleDegree));
                break;
            default:
                System.out.println("Operation number is not supported.");
                break;
        }
    }
}
