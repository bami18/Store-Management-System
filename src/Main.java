import Model.*;
import enums.Sex;
import service.implementation.CustomerImplementation;
import service.implementation.ManagerImplementation;

import javax.naming.Name;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Bread", 100.00, true, 10));
        products.add(new Product("Milk", 2000.00, true, 4));
        products.add(new Product("Chocolate", 500, true, 9));

        Store store = new Store("Shop-rite", "Labaka",products , "09078768668", 18, 40, 8);
        Manager manager = new Manager("Ayo", 35, "08263738311", Sex.MALE, 8382);
        Customers customers = new Customers("Ola", 20, "0907867657", Sex.MALE);
        Cashier cashier1 = new Cashier("Princess", 23, "09078565656", Sex.FEMALE, 7879, 9, true);
        System.out.println("ENTER APPLICANT DETAILS ");
        System.out.println("NAME");
        String applicantName = scanner.next();
        System.out.println("AGE");
        int applicantAge = scanner.nextInt();
        System.out.println("PHONE NUMBER");
        String applicantPN = scanner.next();

        Applicant applicant1 = new Applicant(applicantName, applicantAge, applicantPN, enums.Sex.MALE);

        ManagerImplementation managerImplementation = new ManagerImplementation();
        managerImplementation.fireCashier(cashier1,store);

        System.out.println("ENTER PRODUCT NUMBER ");
        int productList = scanner.nextInt();
        System.out.println("THE NAME OF THE PRODUCT YOU CHOSE IS " + products.get(productList).getProductName());
        System.out.println("THE AMOUNT OF " + products.get(productList).getProductName() + " IS " + products.get(productList).getProductAmount());
        System.out.println("GET QUANTITY");
        int productQuantity = scanner.nextInt();
        System.out.println();
        System.out.println("THE TOTAL AMOUNT YOU HAVE TO PAY IS " + products.get(productList).getProductAmount()
        * productQuantity);
        System.out.println("ENTER YOUR MONEY TO PURCHASE THE PRODUCT");
        int myAmount = scanner.nextInt();

        CustomerImplementation customerImplementation = new CustomerImplementation();
        customerImplementation.buyProduct(products.get(productList), myAmount, productQuantity, customers);
        managerImplementation.hireApplicant(applicant1,store);
    }
}