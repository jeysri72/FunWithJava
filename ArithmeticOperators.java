package java.fun;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;

        //3 + 5 = 8

        System.out.println(a + " + " + b + " = " + a+b );
       // System.out.println(a + " - " + b + " = " + a-b );
        // Line 10 - Runs without error. Because + is the string concatenator
        // Line 11 - Results error. Bacuse a - b going to result integer value
        // integer value should be converted to string before concatenation

        System.out.println(a + " - " + b + " = " + Integer.toString( a-b) );

        int sum = a+b;
        System.out.print(a + " + " + b + " = " + sum );
        System.out.println(a + " + " + b + " = " + sum );
        //\n, ln  - New line character

        // Format the printing % followed by data type
        //%s - String
        //%d - int- Digit
        //% - Java is expecting some letter after the % sign
        //In our case we just want to print % sign
        // Escape characters - %%
        // Ref: https://docs.oracle.com/javase/tutorial/java/data/numberformat.html
        System.out.printf("%s: %d + %d = %d\n", "Addition", a, b, a+b);
        System.out.printf("%s: %d - %d = %d\n", "Subtraction", a, b, a-b);
        System.out.printf("%s: %d * %d = %d\n", "Multiplication", a, b, a*b);
        System.out.printf("%s: %d / %d = %d\n", "Division", a, b, a/b);
        // System.out.printf("%s: %d % %d = %d\n", "Modulus", a, b, a%b);
        System.out.printf("%s: %d %% %d = %d\n", "Modulus", a, b, a%b);

    }
}
