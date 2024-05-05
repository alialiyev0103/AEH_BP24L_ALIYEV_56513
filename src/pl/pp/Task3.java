import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double celsius;

        while (true) {
            System.out.print("Enter the temperature in Celsius (-1 to quit): ");
            celsius = scanner.nextDouble();

            if (celsius == -1) {
                System.out.println("Exiting the program...");
                break;
            }

            double fahrenheit = 1.8 * celsius + 32.0;
            double kelvin = celsius + 273.16;

            System.out.printf("Temperature in Celsius: %.2f°C\n", celsius);
            System.out.printf("Temperature in Fahrenheit: %.2f°F\n", fahrenheit);
            System.out.printf("Temperature in Kelvin: %.2fK\n", kelvin);
        }

        scanner.close();
    }
}