package ElectronicProducts;
// AirConditioner class, extends ElectronicProduct
public class AirConditioner extends ElectronicProduct {
    // Private field to store cooling capacity of the air conditioner
    private Double coolingCapacity;

    // Constructor to initialize an AirConditioner object with specified details
    // Throws InvalidProductDetailsException if cooling capacity is not greater than 0
    public AirConditioner(String productName, Double price, Integer quantity, Double coolingCapacity) throws InvalidProductDetailsException {
        // Calling the constructor of the superclass ElectronicProduct
        super(productName, price, quantity);
        // Checking if cooling capacity is valid
        if (coolingCapacity <= 0) {
            // Throwing an exception with a descriptive message
            throw new InvalidProductDetailsException("Cooling capacity must be greater than 0.");
        }
        // Assigning the cooling capacity
        this.coolingCapacity = coolingCapacity;
    }

    // Overloaded constructor to initialize an AirConditioner object with specified details including brand
    // Throws InvalidProductDetailsException if cooling capacity is not greater than 0
    public AirConditioner(String productName, Double price, Integer quantity, Double coolingCapacity, String brand) throws InvalidProductDetailsException {
        // Calling the constructor of the superclass ElectronicProduct with additional parameter brand
        super(productName, price, quantity, brand);
        // Checking if cooling capacity is valid
        if (coolingCapacity <= 0) {
            // Throwing an exception with a descriptive message
            throw new InvalidProductDetailsException("Cooling capacity must be greater than 0.");
        }
        // Assigning the cooling capacity
        this.coolingCapacity = coolingCapacity;
    }

    // Getter method to retrieve the cooling capacity of the air conditioner
    public Double getCoolingCapacity() {
        return coolingCapacity;
    }

    // Setter method to set the cooling capacity of the air conditioner
    public void setCoolingCapacity(Double coolingCapacity) {
        this.coolingCapacity = coolingCapacity;
    }

    // Method to calculate the total cost of the air conditioner based on price and quantity
    @Override
    public Double calculateTotalCost() {
        return getPrice() * getQuantity();
    }
}
