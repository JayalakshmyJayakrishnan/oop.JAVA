import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class PrimeChecker {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide a number as a command line argument.");
            return;
        }

        int number = Integer.parseInt(args[0]);
        boolean isPrime = checkPrime(number);

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("prime_result.txt"));
            writer.write(number + " is " + (isPrime ? "prime" : "not prime"));
            writer.close();
            System.out.println("Result written to prime_result.txt");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    private static boolean checkPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
