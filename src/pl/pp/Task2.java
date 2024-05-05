package pl.pp;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int x = 10;

        int doubleOfX = x * 2;
        int xSquared = x * x;

        System.out.println("x = " + x);
        System.out.println("Double of x = " + doubleOfX);
        System.out.println("x squared = " + xSquared);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age in years:");
        int ageInYears = scanner.nextInt();
        scanner.close();

        long ageInSeconds = ageInYears * 365 * 24 * 60 * 60;

        System.out.println("My age in seconds: " + ageInSeconds);
    }
}