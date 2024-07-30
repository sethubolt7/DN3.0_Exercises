import java.util.HashMap;

public class InventoryManagementSystem {
    private HashMap<String, Product> inventory;

    public InventoryManagementSystem() {
        this.inventory = new HashMap<>();
    }

    // Add a new product
    public void addProduct(Product product) {
        if (!inventory.containsKey(product.getProductId())) {
            inventory.put(product.getProductId(), product);
        } else {
            System.out.println("Product with this ID already exists.");
        }
    }

    // Update an existing product
    public void updateProduct(Product product) {
        if (inventory.containsKey(product.getProductId())) {
            inventory.put(product.getProductId(), product);
        } else {
            System.out.println("Product with this ID does not exist.");
        }
    }

    // Delete a product
    public void deleteProduct(String productId) {
        if (inventory.containsKey(productId)) {
            inventory.remove(productId);
        } else {
            System.out.println("Product with this ID does not exist.");
        }
    }

    // Display all products
    public void displayProducts() {
        for (Product product : inventory.values()) {
            System.out.println(product);
        }
    }

    public static void main(String[] args) {
        InventoryManagementSystem ims = new InventoryManagementSystem();
        
        Product product1 = new Product("P001", "Laptop", 10, 1000.00);
        Product product2 = new Product("P002", "Smartphone", 20, 500.00);
        
        ims.addProduct(product1);
        ims.addProduct(product2);
        
        ims.displayProducts();
        
        product1.setPrice(950.00);
        ims.updateProduct(product1);
        
        ims.displayProducts();
        
        ims.deleteProduct("P002");
        
        ims.displayProducts();
    }
}
