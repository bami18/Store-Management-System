package service;

import Model.Customers;
import Model.Product;

public interface CustomerService {
    void buyProduct (Product product, int amount, int productQuantity, Customers customers);
}
