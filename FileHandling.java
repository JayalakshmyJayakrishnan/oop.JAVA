import java.io.*;
public class FileHandling {
 public static void main(String[] args) {
 BufferedReader reader = null;
 BufferedWriter writer = null;
 try {
 File inputFile = new File("Input.txt");
 File outputFile = new File("output.txt");
 if (!inputFile.exists()) {
 throw new FileNotFoundException("The input file does not
exist.");
 }
 reader = new BufferedReader(new FileReader(inputFile));
 writer = new BufferedWriter(new FileWriter(outputFile));
 String line;
 while ((line = reader.readLine()) != null) {
 writer.write(line);
 writer.newLine();
 }
 System.out.println("File has been copied successfully.");
 } catch (FileNotFoundException e) {
 System.err.println("File not found: " + e.getMessage());
 } catch (IOException e) {
 System.err.println("I/O Error: " + e.getMessage());
 } finally {
 try {
 if (reader != null) {
 reader.close();
 }
 if (writer != null) {
 writer.close();
 }
 } catch (IOException e) {
 System.err.println("Error while closing resources: " +
e.getMessage());
 }
 }
 }
}
