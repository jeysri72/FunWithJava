import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask the user for the size of the array
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        // Create an array of the specified size
        int[] numbers = new int[size];

        // Input values into the array
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Calculate the sum of elements using a for loop
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += numbers[i];
        }

        // Display the array elements
        System.out.print("Array elements: ");
        for (int i = 0; i < size; i++) {
            System.out.print(numbers[i] + " ");
        }

        // Display the sum of elements
        System.out.println("\nSum of array elements: " + sum);

        scanner.close();
    }
}
