package ElectronicProducts;

// Refrigerator class, extends ElectronicProduct
public class Refrigerator extends ElectronicProduct {
    // Private field to store capacity of the refrigerator
    private Double capacity;

    // Constructor to initialize a Refrigerator object with specified details
    // Throws InvalidProductDetailsException if capacity is not greater than 0
    public Refrigerator(String productName, Double price, Integer quantity, Double capacity) throws InvalidProductDetailsException {
        // Calling the constructor of the superclass ElectronicProduct
        super(productName, price, quantity);
        // Checking if capacity is valid
        if (capacity <= 0) {
            // Throwing an exception with a descriptive message
            throw new InvalidProductDetailsException("Capacity must be greater than 0.");
        }
        // Assigning the capacity
        this.capacity = capacity;
    }

    // Overloaded constructor to initialize a Refrigerator object with specified details including brand
    // Throws InvalidProductDetailsException if capacity is not greater than 0
    public Refrigerator(String productName, Double price, Integer quantity, Double capacity, String brand) throws InvalidProductDetailsException {
        // Calling the constructor of the superclass ElectronicProduct with additional parameter brand
        super(productName, price, quantity, brand);
        // Checking if capacity is valid
        if (capacity <= 0) {
            // Throwing an exception with a descriptive message
            throw new InvalidProductDetailsException("Capacity must be greater than 0.");
        }
        // Assigning the capacity
        this.capacity = capacity;
    }

    // Getter method to retrieve the capacity of the refrigerator
    public Double getCapacity() {
        return capacity;
    }

    // Setter method to set the capacity of the refrigerator
    public void setCapacity(Double capacity) {
        this.capacity = capacity;
    }

    // Method to calculate the total cost of the refrigerator based on price and quantity
    @Override
    public Double calculateTotalCost() {
        return getPrice() * getQuantity();
    }
}
