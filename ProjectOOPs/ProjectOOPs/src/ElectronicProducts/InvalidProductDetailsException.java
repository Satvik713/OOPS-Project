package ElectronicProducts;

// Custom exception class for invalid product details
public class InvalidProductDetailsException extends Exception {
    // Serial version UID for serialization
    private static final long serialVersionUID = 1L;

    // Constructor to initialize an InvalidProductDetailsException with the specified message
    public InvalidProductDetailsException(String message) {
        super(message);
    } 
}
