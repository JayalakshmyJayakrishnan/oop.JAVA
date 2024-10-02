import java.util.Scanner;

class Box {
    private double length;
    private double width;
    private double height;

    // No-argument constructor (creates a cube with side length 1)
    public Box() {
        this.length = 1;
        this.width = 1;
        this.height = 1;
    }

    // Constructor that takes one parameter to create a cube
    public Box(double side) {
        this.length = side;
        this.width = side;
        this.height = side;
    }

    // Constructor that takes three parameters to create a rectangular box
    public Box(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    // Method to calculate the volume of the box
    public double calculateVolume() {
        return length * width * height;
    }

    // Method to display the dimensions of the box
    public void displayDimensions() {
        System.out.println("Dimensions (L x W x H): " + length + " x " + width + " x " + height);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose the type of Box to create:");
        System.out.println("1. Default cube (side length 1)");
        System.out.println("2. Cube with specified side length");
        System.out.println("3. Rectangular box with specified dimensions");

        int choice = scanner.nextInt();
        Box box;

        switch (choice) {
            case 1:
                // Create a default cube
                box = new Box();
                break;

            case 2:
                // Create a cube with specified side length
                System.out.print("Enter the side length of the cube: ");
                double side = scanner.nextDouble();
                box = new Box(side);
                break;

            case 3:
                // Create a rectangular box with specified dimensions
                System.out.print("Enter the length of the box: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width of the box: ");
                double width = scanner.nextDouble();
                System.out.print("Enter the height of the box: ");
                double height = scanner.nextDouble();
                box = new Box(length, width, height);
                break;

            default:
                System.out.println("Invalid choice, creating default cube.");
                box = new Box();
                break;
        }

        // Display the dimensions and volume of the box
        box.displayDimensions();
        System.out.println("Volume of the box: " + box.calculateVolume());

        scanner.close();
    }
}
