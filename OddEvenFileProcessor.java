import java.io.*;

public class OddEvenFileProcessor {
    public static void main(String[] args) {
        String sourceFile = "input.txt"; // Input file with numbers
        String evenFile = "even.txt";    // Output file for even numbers
        String oddFile = "odd.txt";      // Output file for odd numbers

        try (FileReader reader = new FileReader(sourceFile);
             FileWriter evenWriter = new FileWriter(evenFile);
             FileWriter oddWriter = new FileWriter(oddFile)) {

            BufferedReader bufferedReader = new BufferedReader(reader);
            String line;
            System.out.println("Reading numbers from input file and writing to even/odd files:");

            // Read each line from the input file
            while ((line = bufferedReader.readLine()) != null) {
                // Split each line into tokens (numbers separated by whitespace)
                String[] numbers = line.split("\\s+");
                
                for (String num : numbers) {
                    try {
                        int number = Integer.parseInt(num.trim());
                        if (number % 2 == 0) {
                            evenWriter.write(number + " ");
                            System.out.print(number + " (even) ");
                        } else {
                            oddWriter.write(number + " ");
                            System.out.print(number + " (odd) ");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Skipping non-integer token: " + num);
                    }
                }
            }

            System.out.println("\nNumbers successfully written to even and odd files.");

        } catch (FileNotFoundException e) {
            System.out.println("Error: Input file not found - " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: I/O Exception while reading or writing file - " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: An unexpected error occurred - " + e.getMessage());
        }
    }
}
