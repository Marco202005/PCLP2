#1

import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a temperature in Fahrenheit
        System.out.print("Input a degree in Fahrenheit: ");
        float fahrenheit = scanner.nextFloat();

        // Convert Fahrenheit to Celsius
        float celsius = ((fahrenheit - 32) * 5) / 9;

        // Display the result
        System.out.printf("%.1f degree Fahrenheit is equal to %.1f in Celsius%n", fahrenheit, celsius);

        // Close the scanner
        scanner.close();
    }
}

#2
        import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter an integer between 0 and 1000
        System.out.print("Input an integer between 0 and 1000: ");
        int number = scanner.nextInt();

        // Ensure the number is within the valid range
        if (number < 0 || number > 1000) {
            System.out.println("The number is out of range.");
        } else {
            int sum = 0;
            int originalNumber = number;

            // Sum the digits of the number
            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }

            // Display the result
            System.out.println("The sum of all digits in " + originalNumber + " is " + sum);
        }

        // Close the scanner
        scanner.close();
    }
}


#3import

java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        // Calculate the square, cube, and fourth power
        double square = Math.pow(number, 2);
        double cube = Math.pow(number, 3);
        double fourthPower = Math.pow(number, 4);

        // Display the results formatted to 2 decimal places
        System.out.printf("Square: %.2f%n", square);
        System.out.printf("Cube: %.2f%n", cube);
        System.out.printf("Fourth power: %.2f%n", fourthPower);

        // Close the scanner
        scanner.close();
    }
}
