import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Calculator {

    private SimpleOperations simpleOperations = new SimpleOperations();
    private TrigonometricOperations trigonometricOperations = new TrigonometricOperations();

    public void run() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Which operation type to perform: ");
        System.out.println("1. Simple operations");
        System.out.println("2. Trigonometric operations");
        System.out.println("0. Exit");
        int operationNumber = Integer.parseInt(reader.readLine());
        if (operationNumber == 0) System.exit(0);

        switch (operationNumber) {
            case 1:
                simpleOperations.run();
                break;
            case 2:
                trigonometricOperations.run();
                break;
            default:
                System.out.println("Operation type is not supported.");
                break;
        }
        run();
    }


}
