package java.fun;

import java.util.Scanner;

public class Sum2 {
    public static void main(String[] args) {
        int num1;
        int num2;
        int sum;
        // How to get the two numbers?
        // Using scanner
        // How to use the Scanner
        // Instantiate (create)  new scanner
        // Scanner - Class Name
        // input - Object/Instance Name
        // new - Keyword
        // Scanner(System.in) - Constructor Method

        Scanner input = new Scanner(System.in);


        System.out.println("Enter the value of Number 1: ");
        num1 = input.nextInt();

        System.out.println("Enter the value of Number 2: ");
        num2 = input.nextInt();

        sum = num1 + num2;

        System.out.println("Sum is: " + sum);

        // I want to calculate the sum of two numbers from various part of the program
        // How do I achieve it?
        // By writing as a method

        System.out.println("Printing by calling calculateSum method");
        sum = calculateSum(num1, num2); //num1, num2 - Arguments
        System.out.println(num1 + "+" + num2  + "=" + sum);

        System.out.println("");

        printSum(num1, num2);


    }

    // Print Sum
    // Need input - Sum of what => Parameters
    // Calculate sum and print it
    // There is nothing to return back to the caller - Return Type - Void
    public static void printSum(int a, int b ){ // a, b - Parameter
        System.out.println("Printing from printSum method");
        System.out.println(a+b);
    }

    // To calculate the sum, need two numbers
    // input two numbers - As a parameter
    public static int calculateSum(int a, int b){
        int sum = a + b;    // Calculating the sum
        return sum;         // Output - Sum
    }
}


