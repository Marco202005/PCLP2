import java.util.Scanner;

public class PCLP2 {#1

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
    }}


LAB 3

#1

        import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a number
        System.out.print("Input number: ");
        int number = scanner.nextInt();

        // Determine if the number is positive, negative, or zero
        if (number > 0) {
            System.out.println("Number is positive");
        } else if (number < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }

        // Close the scanner
        scanner.close();
    }
}


#3
public class PrimeNumbers1To100 {
    public static void main(String[] args) {
        System.out.println("Prime numbers between 1 and 100 are:");

        for (int num = 2; num <= 100; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

#5

        import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Check voting eligibility using a switch statement
        switch (age) {
            case 18:
                System.out.println("You are eligible to vote.");
                break;
            default:
                if (age > 18) {
                    System.out.println("You are eligible to vote.");
                } else {
                    System.out.println("You are not eligible to vote.");
                }
                break;
        }

        // Close the scanner
        scanner.close();
    }
}


LAB4

#3

        import java.util.Arrays;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of elements in the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();

        // Create an array to store the elements
        int[] array = new int[n];

        // Read the elements from the user
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Remove duplicates and get the new length
        int newLength = removeDuplicates(array);

        // Display the array without duplicates
        System.out.println("Array after removing duplicates:");
        for (int i = 0; i < newLength; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println("\nNew length of the array: " + newLength);

        // Close the scanner
        scanner.close();
    }

    // Method to remove duplicates from the array
    public static int removeDuplicates(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        // Sort the array to bring duplicates together
        Arrays.sort(array);

        // Initialize the index of the next unique element
        int uniqueIndex = 1;

        // Traverse the sorted array
        for (int i = 1; i < array.length; i++) {
            if (array[i] != array[i - 1]) {
                array[uniqueIndex] = array[i];
                uniqueIndex++;
            }
        }

        return uniqueIndex;
    }
}

#4
        import java.util.Random;
import java.util.Scanner;

public class MatrixTrace {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the dimension of the matrix
        System.out.print("Enter the dimension of the matrix (n x n): ");
        int n = scanner.nextInt();

        // Create a square matrix with the given dimension
        int[][] matrix = new int[n][n];

        // Create a Random object to generate random matrix elements
        Random rand = new Random();

        // Fill the matrix with random elements and display the matrix
        System.out.println("Generated Matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = rand.nextInt(100); // Generating random numbers between 0 and 99
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Calculate the trace of the matrix (sum of principal diagonal elements)
        int trace = 0;
        for (int i = 0; i < n; i++) {
            trace += matrix[i][i];
        }

        // Display the trace of the matrix
        System.out.println("Trace of the matrix: " + trace);

        // Close the scanner
        scanner.close();
    }
}

LAB5
#2
        import java.util.Scanner;

public class LargestAndSmallestWord {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Split the input string into words
        String[] words = input.split("\\s+");

        // Initialize variables to store the largest and smallest words
        String largestWord = "";
        String smallestWord = words[0]; // Start with the first word

        // Iterate through the words to find the largest and smallest
        for (String word : words) {
            if (word.length() > largestWord.length()) {
                largestWord = word;
            }
            if (word.length() < smallestWord.length()) {
                smallestWord = word;
            }
        }

        // Display the results
        System.out.println("Largest word: " + largestWord);
        System.out.println("Smallest word: " + smallestWord);

        // Close the scanner
        scanner.close();
    }
}

#3
        import java.util.Arrays;
import java.util.Scanner;

public class AnagramCheck {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the first string
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        // Prompt the user to enter the second string
        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Check if the two strings are anagrams
        boolean isAnagram = checkAnagram(str1, str2);

        // Display the result
        if (isAnagram) {
            System.out.println("The two strings are anagrams.");
        } else {
            System.out.println("The two strings are not anagrams.");
        }

        // Close the scanner
        scanner.close();
    }

    // Method to check if two strings are anagrams
    public static boolean checkAnagram(String str1, String str2) {
        // Convert the strings to lowercase and remove spaces
        str1 = str1.toLowerCase().replaceAll("\\s", "");
        str2 = str2.toLowerCase().replaceAll("\\s", "");

        // Check if the lengths of the two strings are equal
        if (str1.length() != str2.length()) {
            return false;
        }

        // Convert the strings to char arrays and sort them
        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Check if the sorted char arrays are equal
        return Arrays.equals(charArray1, charArray2);
    }
}

LAB 6
#1
public class Punct {
    // Datele private ale clasei
    private int x;
    private int y;

    // Constructor fără parametri care instanțiază punctul O(0, 0)
    public Punct() {
        this.x = 0;
        this.y = 0;
    }

    // Constructor cu parametri
    public Punct(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Getter pentru abscisă
    public int getX() {
        return x;
    }

    // Setter pentru abscisă
    public void setX(int x) {
        this.x = x;
    }

    // Getter pentru ordonată
    public int getY() {
        return y;
    }

    // Setter pentru ordonată
    public void setY(int y) {
        this.y = y;
    }

    // Metodă pentru a returna un string de forma (x, y)
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    // Metodă pentru a calcula distanța dintre acest punct și punctul (x, y)
    public double distance(int x, int y) {
        return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2));
    }

    // Metodă pentru a calcula distanța dintre acest punct și alt punct
    public double distance(Punct p1) {
        return Math.sqrt(Math.pow(this.x - p1.x, 2) + Math.pow(this.y - p1.y, 2));
    }
}

LAB 8
#2

        import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public class CatMethod {
    public static void cat(File file) throws IOException {
        RandomAccessFile input = null;
        String line = null;

        try {
            input = new RandomAccessFile(file, "r");
            while ((line = input.readLine()) != null) {
                System.out.println(line);
            }
        } finally {
            if (input != null) {
                input.close();
            }
        }
    }

    public static void main(String[] args) {
        // Exemplu de utilizare
        File file = new File("example.txt");
        try {
            cat(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

