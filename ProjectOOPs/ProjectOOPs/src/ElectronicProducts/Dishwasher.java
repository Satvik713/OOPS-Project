package ElectronicProducts;

// Dishwasher class, extends ElectronicProduct
public class Dishwasher extends ElectronicProduct {
    // Private field to store the number of racks of the dishwasher
    private Integer numberOfRacks;

    // Constructor to initialize a Dishwasher object with specified details
    // Throws InvalidProductDetailsException if the number of racks is not greater than 0
    public Dishwasher(String productName, Double price, Integer quantity, Integer numberOfRacks) throws InvalidProductDetailsException {
        // Calling the constructor of the superclass ElectronicProduct
        super(productName, price, quantity);
        // Checking if the number of racks is valid
        if (numberOfRacks <= 0) {
            // Throwing an exception with a descriptive message
            throw new InvalidProductDetailsException("Number of racks must be greater than 0.");
        }
        // Assigning the number of racks
        this.numberOfRacks = numberOfRacks;
    }

    // Overloaded constructor to initialize a Dishwasher object with specified details including brand
    // Throws InvalidProductDetailsException if the number of racks is not greater than 0
    public Dishwasher(String productName, Double price, Integer quantity, Integer numberOfRacks, String brand) throws InvalidProductDetailsException {
        // Calling the constructor of the superclass ElectronicProduct with additional parameter brand
        super(productName, price, quantity, brand);
        // Checking if the number of racks is valid
        if (numberOfRacks <= 0) {
            // Throwing an exception with a descriptive message
            throw new InvalidProductDetailsException("Number of racks must be greater than 0.");
        }
        // Assigning the number of racks
        this.numberOfRacks = numberOfRacks;
    }

    // Getter method to retrieve the number of racks of the dishwasher
    public Integer getNumberOfRacks() {
        return numberOfRacks;
    }

    // Setter method to set the number of racks of the dishwasher
    public void setNumberOfRacks(Integer numberOfRacks) {
        this.numberOfRacks = numberOfRacks;
    }

    // Method to calculate the total cost of the dishwasher based on price and quantity
    @Override
    public Double calculateTotalCost() {
        return getPrice() * getQuantity();
    }
}
