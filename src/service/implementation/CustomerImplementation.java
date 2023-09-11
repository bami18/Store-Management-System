package service.implementation;

import Model.Customers;
import Model.Product;
import Model.Store;
import service.CustomerService;

import java.util.Scanner;

public class CustomerImplementation implements CustomerService {
    @Override
    public void buyProduct(Product product, int amount, int productQuantity, Customers customers) {
        double totalAmount = product.getProductAmount() * productQuantity;
        if (product.isAvailability() &&
                amount >= totalAmount &&
                product.getQuantity() >= productQuantity) {
            System.out.println("PRODUCT SUCCESSFULLY PURCHASED BY " + customers.getName());
        } else if (amount < totalAmount) {
            System.out.println("INSUFFICIENT FUNDS");
        } else if (!product.isAvailability()) {
            System.out.println("out of stock");
        } else if (product.getQuantity() < productQuantity) {
            System.out.println("WE ONLY HAVE " + product.getQuantity() + " AVAILABLE");

        }

    }
}