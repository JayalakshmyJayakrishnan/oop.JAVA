import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

class File {
    public static void main(String[] args) {
        int c;
       
        try (FileReader fr = new FileReader("even.txt");
             FileWriter fw = new FileWriter("odd.txt")) {
             
            // Read each character from the file and write to the new file
            while ((c = fr.read()) != -1) {
                System.out.println((char) c); // Print the character to the console
                fw.write((char) c);           // Write the character to odd.txt
            }
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
