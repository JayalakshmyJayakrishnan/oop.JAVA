import java.util.Scanner;

public class Calculator {

    
    public int add(int a, int b) {
        return a + b;
    }

    
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    
    public double add(double a, double b) {
        return a + b;
    }

    
    public static void main(String[] args) {
        
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);

        
        System.out.print("Enter first integer: ");
        int int1 = sc.nextInt();
        System.out.print("Enter second integer: ");
        int int2 = sc.nextInt();
        int result1 = calc.add(int1, int2);
        System.out.println("Sum of " + int1 + " and " + int2 + " (int): " + result1);

        
        System.out.print("Enter first integer: ");
        int int3 = sc.nextInt();
        System.out.print("Enter second integer: ");
        int int4 = sc.nextInt();
        System.out.print("Enter third integer: ");
        int int5 = sc.nextInt();
        int result2 = calc.add(int3, int4, int5);
        System.out.println("Sum of " + int3 + ", " + int4 + ", and " + int5 + " (int): " + result2);

        
        System.out.print("Enter first double: ");
        double num1 = sc.nextDouble();
        System.out.print("Enter second double: ");
        double num2 = sc.nextDouble();
        double result3 = calc.add(num1, num2);
        System.out.println("Sum of " + num1 + " and " + num2 + " (double): " + result3);

        // Closing scanner to avoid resource leak
        sc.close();
    }
}
