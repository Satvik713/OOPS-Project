package EmployeeManagement;

import java.util.Date;

// Class representing an employee in the electronic store
public class Employee implements EmployeeIncentives, Accountant {
    private String name;
    private String role;
    private Double salary;
    private Date joiningDate;
    private Date exitDate;
    private ContactInfo contactInfo;
    private String email;
    private String phoneNumber;

    public Employee(String name, String role, Double salary) {
        this.name = name;
        this.role = role;
        this.salary = salary;
        this.contactInfo = new ContactInfo(email, phoneNumber);
    }

    // Getter and setter methods for name
    public String getName() {
        return name;
    }

    // Getter and setter methods for joining date and exit date
    public Date getJoiningDate() {
        return joiningDate;
    }

    public Date getExitDate() {
        return exitDate;
    }

    public void setExitDate(Date joiningDate) {
        this.exitDate = new Date();
    }

    public void setJoiningDate(Date joiningDate) {
        this.joiningDate = joiningDate;
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Name: " + name);
        System.out.println("Role: " + role);
        System.out.println("Salary: $" + salary);
        System.out.println("Joining Date: " + joiningDate);
            System.out.println("Exit Date: " + exitDate);
        }
    

    // Method to calculate salary incorporating incentives
    public Double calculateSalary(Double baseSalary, Integer... numberOfProductsSold) {
        // Calculate total incentives
        Double totalIncentives = calculateIncentives(numberOfProductsSold);

        // Increment salary only if incentives are earned
        if (totalIncentives > 0) {
            // Increase base salary by 10% and add incentives
            return baseSalary * 1.1 + totalIncentives;
        } else {
            // Return base salary if no incentives are earned
            return baseSalary;
        }
    }

    // Nested class for contact information
    private class ContactInfo {
        private String email;
        private String phoneNumber;

        public ContactInfo(String email, String phoneNumber) {
            this.email = email;
            this.phoneNumber = phoneNumber;
        }

        // Getter and setter methods for email and phoneNumber
        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }
    }

    // Method to set email using nested ContactInfo class
    public void setEmail(String email) {
        contactInfo.setEmail(email);
    }

    // Method to set phone number using nested ContactInfo class
    public void setPhoneNumber(String phoneNumber) {
        contactInfo.setPhoneNumber(phoneNumber);
    }

    // Method to display contact information
    public void displayContactInfo() {
        System.out.println("Name: " + name);
        System.out.println("Email: " + contactInfo.getEmail());
        System.out.println("Phone Number: " + contactInfo.getPhoneNumber());
    }

    // Method to calculate incentives based on the number of products sold
    @Override
    public Double calculateIncentives(Integer... numberOfProductsSold) {
        double totalIncentives = 0;
        for (Integer productsSold : numberOfProductsSold) {
            totalIncentives += productsSold * 10.0; // Assuming $10 incentive per product sold
        }
        return totalIncentives;
    }

    // Varargs overloading for calculating incentives with a custom base incentive value
    public Double calculateIncentives(Double baseIncentive, Integer... numberOfProductsSold) {
        double totalIncentives = 0;
        for (Integer productsSold : numberOfProductsSold) {
            totalIncentives += productsSold * baseIncentive;
        }
        return totalIncentives;
    }
}
