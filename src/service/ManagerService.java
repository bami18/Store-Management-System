package service;

import Model.Applicant;
import Model.Cashier;
import Model.Product;
import Model.Store;

public interface ManagerService {
    void hireApplicant(Applicant applicant, Store store);
    void fireCashier(Cashier cashier, Store store);

    void addProduct(Store store, Product product);
    void removeProduct(Store store, Product product);
    void updatePrice(Store store, Product product, int amount);
}
