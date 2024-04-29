package ElectronicStore;

import ElectronicProducts.ElectronicProduct;

// Class responsible for managing the inventory of electronic products
public class ProductManagement {
    // Array to store the inventory of electronic products
    private ElectronicProduct[] inventory;
    // Variable to keep track of the size of the inventory
    private int inventorySize;

    // Constructor to initialize the ProductManagement object with a specified maximum inventory size
    public ProductManagement(int maxInventorySize) {
        this.inventory = new ElectronicProduct[maxInventorySize];
        this.inventorySize = 0;
    }

    // Method to add a product to the inventory
    public void addProduct(ElectronicProduct product) {
        if (product != null) {
            if (inventorySize < inventory.length) {
                inventory[inventorySize] = product;
                inventorySize++;
                System.out.println(product.getProductName() + " added to inventory.");
            } else {
                System.out.println("Inventory is full. Cannot add more products.");
            }
        }
    }

    // Overloaded method to add products to the inventory based on name and brand
    public void addProduct(String name, String brand) {
        ElectronicProduct product = findProductByName(name, brand);
        if (product != null) {
            if (inventorySize < inventory.length) {
                inventory[inventorySize] = product;
                inventorySize++;
                System.out.println(product.getProductName() + " added to inventory.");
            }
        } else {
            System.out.println("Product not found in inventory.");
        }
    }

    // Method to remove a product from the inventory
    public void removeProduct(ElectronicProduct product) {
        for (int i = 0; i < inventorySize; i++) {
            if (inventory[i].equals(product)) {
                inventory[i] = null;
                for (int j = i; j < inventorySize - 1; j++) {
                    inventory[j] = inventory[j + 1];
                }
                inventorySize--;
                System.out.println(product.getProductName() + " removed from inventory.");
                return;
            }
        }
        System.out.println("Product not found in inventory.");
    }

    // Varargs overloaded method to remove multiple products from the inventory
    public void removeProduct(ElectronicProduct... products) {
        for (ElectronicProduct product : products) {
            removeProduct(product);
        }
    }

    // Method to display the inventory
    public void displayInventory() {
        System.out.println("Inventory:");
        for (int i = 0; i < inventorySize; i++) {
            if (inventory[i] != null) {
                inventory[i].displayProductDetails();
                System.out.println("---------------------------");
            }
        }
    }

    // Method to add products to the inventory (incoming products)
    public void purchaseProduct(String productName, int quantity, double purchasePrice) {
        ElectronicProduct product = findProductByName(productName);
        if (product != null) {
            product.setQuantity(product.getQuantity() + quantity);
            product.setPrice(purchasePrice);
            System.out.println(quantity + " " + productName + " purchased and added to inventory.");
        } else {
            System.out.println("Product not found in inventory.");
        }
    }

    // Method to sell products from the inventory (outgoing products)
    public void sellProduct(String productName, int quantity, double sellingPrice) {
        ElectronicProduct product = findProductByName(productName);
        if (product != null && product.getQuantity() >= quantity) {
            product.setQuantity(product.getQuantity() - quantity);
            System.out.println(quantity + " " + productName + " sold from inventory.");
        } else {
            System.out.println("Insufficient quantity of " + productName + " in inventory.");
        }
    }

    // Method to find a product in the inventory by name
    private ElectronicProduct findProductByName(String name) {
        for (ElectronicProduct product : inventory) {
            if (product != null && product.getProductName().equals(name)) {
                return product;
            }
        }
        return null;
    }

    // Overloaded method to find a product in the inventory by name and brand
    private ElectronicProduct findProductByName(String name, String brand) {
        for (ElectronicProduct product : inventory) {
            if (product != null && product.getProductName().equals(name) && product.getBrandName().equals(brand)) {
                return product;
            }
        }
        return null;
    }
}
