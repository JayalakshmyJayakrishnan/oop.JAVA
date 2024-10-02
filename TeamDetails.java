import java.util.Scanner;

// Base class
class Staff {
    String name;
    int id;
    double salary;

    // Constructor
    Staff(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    // Method to display staff details
    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
    }
}

// Subclass Teamhead
class Teamhead extends Staff {
    String departmentName;

    // Constructor
    Teamhead(String name, int id, double salary, String departmentName) {
        super(name, id, salary);
        this.departmentName = departmentName;
    }

    // Method to calculate bonus (15% of salary)
    double calculateBonus() {
        return salary * 0.15;
    }

    // Method to display team head details
    void displayDetails() {
        super.displayDetails();
        System.out.println("Department Name: " + departmentName);
        System.out.printf("Bonus: %.2f%n", calculateBonus());
        System.out.println();
    }
}

// Subclass Developer
class Developer extends Staff {
    String programmingLanguage;

    // Constructor
    Developer(String name, int id, double salary, String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }

    // Method to calculate bonus (10% of salary)
    double calculateBonus() {
        return salary * 0.10;
    }

    // Method to display developer details
    void displayDetails() {
        super.displayDetails();
        System.out.println("Programming Language: " + programmingLanguage);
        System.out.printf("Bonus: %.2f%n", calculateBonus());
        System.out.println();
    }
}

// Main class
public class TeamDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Teamhead
        System.out.println("Enter Teamhead's details:");
        System.out.print("Name: ");
        String teamheadName = scanner.nextLine();
        System.out.print("ID: ");
        int teamheadId = scanner.nextInt();
        System.out.print("Salary: ");
        double teamheadSalary = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.print("Department Name: ");
        String teamheadDepartmentName = scanner.nextLine();

        // Create Teamhead object
        Teamhead teamhead = new Teamhead(teamheadName, teamheadId, teamheadSalary, teamheadDepartmentName);

        // Input for Developer
        System.out.println("Enter Developer's details:");
        System.out.print("Name: ");
        String developerName = scanner.nextLine();
        System.out.print("ID: ");
        int developerId = scanner.nextInt();
        System.out.print("Salary: ");
        double developerSalary = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.print("Programming Language: ");
        String developerProgrammingLanguage = scanner.nextLine();

        // Create Developer object
        Developer developer = new Developer(developerName, developerId, developerSalary, developerProgrammingLanguage);

        // Display information
        teamhead.displayDetails();
        developer.displayDetails();

        scanner.close();
    }
}
