import java.util.Scanner;

// Scientific Calculator

public class ScientificCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Scientific Calculator");
        System.out.println("Operations:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Power");
        System.out.println("6. Square Root");
        System.out.println("7. Logarithm");
        System.out.println("Enter 'q' to quit");

        while (true) {
            System.out.print("Select an operation (1-7):");
            String operation = scanner.nextLine();

            if (operation.equalsIgnoreCase("q")) {
                break;
            }

            switch (operation) {
                case "1":
                    System.out.print("Enter the first number: ");
                    double num1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    double num2 = scanner.nextDouble();
                    double result = add(num1, num2);
                    System.out.println("Result: " + result);
                    break;
                case "2":
                    // Subtraction logic
                    break;
                case "3":
                    // Multiplication logic
                    break;
                case "4":
                    // Division logic
                    break;
                case "5":
                    // Power logic
                    break;
                case "6":
                    // Square root logic
                    break;
                case "7":
                    // Logarithm logic
                    break;
                default:
                    System.out.println("Invalid operation. Try again.");
                    break;
            }

            scanner.nextLine(); // Consume the remaining new line character
        }

        scanner.close();
    }

    public static double add(double a, double b) {
        return a + b;
    }

    // Implement the remaining mathematical operations as separate methods.
    // Example: subtract(), multiply(), divide(), power(), squareRoot(), logarithm()
}