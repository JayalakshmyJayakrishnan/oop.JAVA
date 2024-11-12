import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class Employee {
    private String empName;
    private int empAge;
    private String empAddress;
    private String empPhone;
    private String empDesignation;
    private String department;

    public void readEmployeeDetails(Scanner scanner) {
        System.out.print("Enter employee name: ");
        empName = sc.nextLine();
        System.out.print("Enter employee age: ");
        empAge = sc.nextInt();
        scanner.nextLine(); 
        System.out.print("Enter employee address: ");
        empAddress = sc.nextLine();
        System.out.print("Enter employee phone: ");
        empPhone = sc.nextLine();
        System.out.print("Enter employee designation: ");
        empDesignation = sc.nextLine();
        System.out.print("Enter employee department: ");
        department = sc.nextLine();
    }

    public void writeToFile() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("employee_details.txt", true));
            writer.write(empName + "," + empAge + "," + empAddress + "," + empPhone + "," + empDesignation + "," + department);
            writer.newLine();
            writer.close();
            System.out.println("Employee details written to file.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();

        try {
            employee.readEmployeeDetails(scanner);
            if (employee.empAge < 18 || employee.empAge > 60) {
                throw new InvalidAgeException("Employee age must be between 18 and 60.");
            }
            employee.writeToFile();
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
