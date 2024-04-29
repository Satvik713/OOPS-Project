package EmployeeManagement;

// Interface representing employee incentives
public interface EmployeeIncentives {
    // Method to calculate incentives based on the number of products sold
    Double calculateIncentives(Integer... numberOfProductsSold);
}
