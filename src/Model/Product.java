package Model;

import java.util.ArrayList;

public class Product {
    private String productName;
    private double productAmount;
    private boolean availability;
    private int quantity;

    public Product() {
    }

    public Product(String productName, double productAmount, boolean availability, int quantity) {
        this.productName = productName;
        this.productAmount = productAmount;
        this.availability = availability;
        this.quantity = quantity;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getProductAmount() {
        return productAmount;
    }

    public void setProductAmount(double productAmount) {
        this.productAmount = productAmount;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }


    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productAmount=" + productAmount +
                ", availability=" + availability +
                ", quantity=" + quantity +
                '}';
    }
}
