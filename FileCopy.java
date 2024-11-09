mport java.io.*;

class FileCopy {
    public static void main(String[] args) {
     
        try (FileReader reader = new FileReader("input.txt");
             FileWriter writer = new FileWriter("output.txt")) {

            int character;
            System.out.println("Reading from input file and writing to output file:");
            
           
            while ((character = reader.read()) != -1) {
                writer.write(character);
                System.out.print((char) character);  
            }

            System.out.println("\nFile content written successfully to output file.");
            
        } catch (FileNotFoundException e) {
            System.out.println("Error: Input file not found - " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error: I/O Exception while reading or writing file - " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: An unexpected error occurred - " + e.getMessage());
        }
    }
}
