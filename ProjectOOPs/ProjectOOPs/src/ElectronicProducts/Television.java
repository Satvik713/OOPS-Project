package ElectronicProducts;
// Television class, extends ElectronicProduct
public class Television extends ElectronicProduct {
    // Private field to store the resolution of the television
    private String resolution;

    // Constructor to initialize a Television object with specified details
    // Throws InvalidProductDetailsException if resolution is not valid
    public Television(String productName, Double price, Integer quantity, String resolution) throws InvalidProductDetailsException {
        // Calling the constructor of the superclass ElectronicProduct
        super(productName, price, quantity);
        // Checking if resolution is valid
        if (!resolution.equals("HD") && !resolution.equals("Full HD") && !resolution.equals("4K")) {
            // Throwing an exception with a descriptive message
            throw new InvalidProductDetailsException("Invalid resolution specified.");
        }
        // Assigning the resolution
        this.resolution = resolution;
    }

    // Overloaded constructor to initialize a Television object with specified details including brand
    // Throws InvalidProductDetailsException if resolution is not valid
    public Television(String productName, Double price, Integer quantity, String resolution, String brand) throws InvalidProductDetailsException {
        // Calling the constructor of the superclass ElectronicProduct with additional parameter brand
        super(productName, price, quantity, brand);
        // Checking if resolution is valid
        if (!resolution.equals("HD") && !resolution.equals("Full HD") && !resolution.equals("4K")) {
            // Throwing an exception with a descriptive message
            throw new InvalidProductDetailsException("Invalid resolution specified.");
        }
        // Assigning the resolution
        this.resolution = resolution;
    }

    // Getter method to retrieve the resolution of the television
    public String getResolution() {
        return resolution;
    }

    // Setter method to set the resolution of the television
    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    // Method to calculate the total cost of the television based on price and quantity
    @Override
    public Double calculateTotalCost() {
        return getPrice() * getQuantity();
    }
}
