import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class NumberSorter {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(new File("input.txt"));
             FileWriter evenWriter = new FileWriter("EVEN.txt");
             FileWriter oddWriter = new FileWriter("ODD.txt")) {

            while (scanner.hasNextInt()) {
                int number = scanner.nextInt();
                
                if (number % 2 == 0) {
                    evenWriter.write(number + "\n"); // Write even number to even.txt
                } else {
                    oddWriter.write(number + "\n");  // Write odd number to odd.txt
                }
            }

        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
