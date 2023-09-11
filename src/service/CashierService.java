package service;

import Model.Customers;
import Model.Product;

public interface CashierService {
    void sellProduct (Product product, int amount, Customers customers);

}
