package EmployeeManagement;

// Interface representing the functionality of an accountant in an electronics store
public interface Accountant {
    // Method to calculate the salary of an employee based on base salary and number of products sold
    Double calculateSalary(Double baseSalary, Integer... numberOfProductsSold);
}
