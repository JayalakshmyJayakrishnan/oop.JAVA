import java.util.Scanner;

class Shape {
    // Method to calculate the area of a square
    public double calculateArea(double side) {
        return side * side;
    }

    // Method to calculate the area of a rectangle
    public double calculateArea(double length, double width) {
        return length * width;
    }

    // Method to calculate the area of a circle
    public double calculateArea(double radius) {
        return 22/7 * radius * radius;
    }
}

public class AreaCalc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape shape = new Shape();
        int choice;

        // Start the loop to allow multiple choices
        while (true) {
            System.out.println("\nChoose the shape to calculate area:");
            System.out.println("1. Square");
            System.out.println("2. Rectangle");
            System.out.println("3. Circle");
            System.out.println("4. Exit");

            choice = scanner.nextInt();

            // If the user chooses to exit
            if (choice == 4) {
                System.out.println("Exiting the program. Goodbye!");
                break;
            }

            double area = 0;

            switch (choice) {
                case 1:
                    // Calculate area of a square
                    System.out.print("Enter the side length of the square: ");
                    double side = scanner.nextDouble();
                    area = shape.calculateArea(side);
                    System.out.println("The area of the square is: " + area);
                    break;

                case 2:
                    // Calculate area of a rectangle
                    System.out.print("Enter the length of the rectangle: ");
                    double length = scanner.nextDouble();
                    System.out.print("Enter the width of the rectangle: ");
                    double width = scanner.nextDouble();
                    area = shape.calculateArea(length, width);
                    System.out.println("The area of the rectangle is: " + area);
                    break;

                case 3:
                    // Calculate area of a circle
                    System.out.print("Enter the radius of the circle: ");
                    double radius = scanner.nextDouble();
                    area = shape.calculateArea(radius);
                    System.out.println("The area of the circle is: " + area);
                    break;

                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }

        scanner.close();
    }
}
