package EmployeeManagement;

// Class representing a thread for employee meetings
public class MeetingThread implements Runnable {
    private Employee employee;

    // Constructor to initialize the thread with an employee
    public MeetingThread(Employee employee) {
        this.employee = employee;
    }

    // Run method to simulate attending a meeting
    @Override
    public void run() {
        // Simulate attending a meeting
        System.out.println(employee.getName() + " is attending a meeting...");
        try {
            Thread.sleep(3000); // Simulate time taken to attend a meeting (3 seconds)
        } catch (InterruptedException e) {
            System.out.println("Interrupted while attending a meeting.");
        }
        System.out.println(employee.getName() + " has attended the meeting.");
    }
}
