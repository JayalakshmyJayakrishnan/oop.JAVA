import java.util.Scanner;

// Base class
class Employee {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;

    // Method to print salary
    void printSalary() {
        System.out.println("Salary: " + salary);
    }
}

// Derived class for Officer
class Officer extends Employee {
    String specialization;

    Officer(String name, int age, String phoneNumber, String address, double salary, String specialization) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
        this.specialization = specialization;
    }

    void displayInfo() {
        System.out.println("Officer Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        printSalary();
        System.out.println("Specialization: " + specialization);
        System.out.println();
    }
}

// Derived class for Manager
class Manager extends Employee {
    String department;

    Manager(String name, int age, String phoneNumber, String address, double salary, String department) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.salary = salary;
        this.department = department;
    }

    void displayInfo() {
        System.out.println("Manager Information:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("Address: " + address);
        printSalary();
        System.out.println("Department: " + department);
        System.out.println();
    }
}

// Main class
public class Details {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for Officer
        System.out.println("Enter Officer's details:");
        System.out.print("Name: ");
        String officerName = scanner.nextLine();
        System.out.print("Age: ");
        int officerAge = scanner.nextInt();
        System.out.print("Phone Number: ");
        String officerPhoneNumber = scanner.next();
        scanner.nextLine(); // Consume newline
        System.out.print("Address: ");
        String officerAddress = scanner.nextLine();
        System.out.print("Salary: ");
        double officerSalary = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.print("Specialization: ");
        String officerSpecialization = scanner.nextLine();

        // Create Officer object
        Officer officer = new Officer(officerName, officerAge, officerPhoneNumber, officerAddress, officerSalary, officerSpecialization);

        // Input for Manager
        System.out.println("Enter Manager's details:");
        System.out.print("Name: ");
        String managerName = scanner.nextLine();
        System.out.print("Age: ");
        int managerAge = scanner.nextInt();
        System.out.print("Phone Number: ");
        String managerPhoneNumber = scanner.next();
        scanner.nextLine(); // Consume newline
        System.out.print("Address: ");
        String managerAddress = scanner.nextLine();
        System.out.print("Salary: ");
        double managerSalary = scanner.nextDouble();
        scanner.nextLine(); // Consume newline
        System.out.print("Department: ");
        String managerDepartment = scanner.nextLine();

        // Create Manager object
        Manager manager = new Manager(managerName, managerAge, managerPhoneNumber, managerAddress, managerSalary, managerDepartment);

        // Display information
        officer.displayInfo();
        manager.displayInfo();

        scanner.close();
    }
}
