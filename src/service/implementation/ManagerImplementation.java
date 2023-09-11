package service.implementation;

import Model.*;
import service.ManagerService;

import java.util.Scanner;

public class ManagerImplementation implements ManagerService {
    Store store = new Store();

    @Override
    public void hireApplicant(Applicant applicant, Store store) {
        if (applicant.getAge() < store.getMinAge() || applicant.getAge() > store.getMaxAge()) {
            System.out.println("SORRY YOU'RE NOT HIRED");
        } else {
            System.out.println("CONGRATULATION!!! YOU ARE HIRED");
        }
    }

    @Override
    public void fireCashier(Cashier cashier, Store store) {
        if (cashier.getWorkTime() < store.getMinWorkTime() || !cashier.isGoodCustomerRelationship()) {
            System.out.println("GET THE FUCK OUT");
        }
        else{
            System.out.println("YOU ARE PROMOTED");
        }
    }

    @Override
    public void addProduct(Store store, Product product) {
    }

    @Override
    public void removeProduct(Store store, Product product) {
    }

    @Override
    public void updatePrice(Store store, Product product, int amount) {
    }

    public void setStore(Store store) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ENTER STORE DETAILS");
        System.out.println("NAME OF STORE");
        String storeName = scanner.next();
        store.setStoreName(storeName);
        store.getStoreName();
        System.out.println("ENTER STORE ADDRESS");
        String storeAddress = scanner.next();
        store.setAddress(storeAddress);
        store.getStoreName();
        System.out.println("");
    }
}