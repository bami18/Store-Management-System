package service.implementation;

import Model.Customers;
import Model.Product;

public class CashierService implements service.CashierService {

    @Override
    public void sellProduct(Product product, int amount, Customers customers) {
        if (product.isAvailability() && product.getQuantity() >= 1 && product.getProductAmount() <=amount){
            System.out.println("SOLD SUCCESSFULLY");
        }
        else {
            System.out.println("NOT SUCCESSFULLY SOLD");
        }
    }
}
