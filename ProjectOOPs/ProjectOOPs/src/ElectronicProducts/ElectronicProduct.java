package ElectronicProducts;

// Abstract class representing an electronic product
public abstract class ElectronicProduct {
    // Private fields to store product details
    private String productName;
    private Double price;
    private Integer quantity;
    private String brand;

    // Constructor to initialize an ElectronicProduct object with specified details
    public ElectronicProduct(String productName, Double price, Integer quantity) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }
    
    // Overloaded constructor to initialize an ElectronicProduct object with specified details including brand
    public ElectronicProduct(String productName, Double price, Integer quantity, String brand) {
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
        this.brand = brand;
    }

    // Getter method to retrieve the product name
    public String getProductName() {
        return productName;
    }

    // Setter method to set the product name
    public void setProductName(String productName) {
        this.productName = productName;
    }

    // Getter method to retrieve the brand name
    public String getBrandName() {
        return brand;
    }

    // Setter method to set the brand name
    public void setBrandName(String brand) {
        this.brand = brand;
    }

    // Getter method to retrieve the price
    public Double getPrice() {
        return price;
    }

    // Setter method to set the price
    public void setPrice(Double price) {
        this.price = price;
    }

    // Getter method to retrieve the quantity
    public Integer getQuantity() {
        return quantity;
    }

    // Setter method to set the quantity
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    // Abstract method to calculate total cost, implementation will be provided by subclasses
    public abstract Double calculateTotalCost();

    // Method to display product details
    public void displayProductDetails() {
        System.out.println("Product Name: " + productName);
        System.out.println("Price: $" + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Cost: $" + calculateTotalCost());
    }
}
