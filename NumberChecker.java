import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class NumberChecker {
 public static void main(String[] args) {
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter the number to search for: ");
 int key = sc.nextInt();
 String file = "Number.txt"; // Path to your file

  
 int rep = 0;
 try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
 String line;
 while ((line = reader.readLine()) != null)
{
 // Split each line into tokens based on spaces or other delimiters
 
 String[] numbers = line.split("\\s+");
 for (String num : numbers) {
 try {
 if (Integer.parseInt(num) ==
key) {
 rep++;
 }
 } catch (NumberFormatException e) {
 // Skip any non-integer tokens
 }
 }
 }
 if (key > 0) 
 {
 System.out.println("The number " + key + " is found " + rep + " time(s) in the file.");
 } 
 else {
  System.out.println("The number " + key + " is not found in the file.");
 }
 } catch (IOException e) {
 System.out.println("An error occurred while reading the file: " + e.getMessage());
 }
 }
}
