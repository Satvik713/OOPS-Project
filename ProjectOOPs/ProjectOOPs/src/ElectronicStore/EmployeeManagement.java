package ElectronicStore;

// Importing the Date class from java.util package
import java.util.Date;

// Importing the Employee class from EmployeeManagement package
import EmployeeManagement.Employee;

// Class responsible for managing employees
public class EmployeeManagement {
    // Array to store the employees
    private Employee[] employees;
    // Variable to keep track of the number of employees
    private int employeeCount;

    // Constructor to initialize the EmployeeManagement object with a specified maximum number of employees
    public EmployeeManagement(int maxEmployees) {
        this.employees = new Employee[maxEmployees];
        this.employeeCount = 0;
    }

    // Method to hire an employee
    public void hireEmployee(Employee employee) {
        if (employeeCount < employees.length) {
            employees[employeeCount] = employee;
            employee.setJoiningDate(new Date()); // Set joining date for the employee
            employeeCount++;
            System.out.println("Employee " + employee.getName() + " hired.");
        } else {
            System.out.println("Maximum employee limit reached. Cannot hire more employees.");
        }
    }

    // Method to fire an employee
    public void fireEmployee(Employee employee) {
        for (int i = 0; i < employeeCount; i++) {
            if (employees[i].equals(employee)) {
                employees[i].setExitDate(); // Set exit date for the employee
                employees[i] = null;
                for (int j = i; j < employeeCount - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employeeCount--;
                System.out.println("Employee " + employee.getName() + " fired.");
                return;
            }
        }
        System.out.println("Employee not found.");
    }

    // Method to display the list of employees
    public void displayEmployees() {
        System.out.println("Employees:");
        for (int i = 0; i < employeeCount; i++) {
            if (employees[i] != null) {
                employees[i].displayEmployeeDetails();
                System.out.println("---------------------------");
            }
        }
    }
}
