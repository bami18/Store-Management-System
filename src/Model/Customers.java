package Model;

import enums.Sex;

public class Customers extends Person{
    public Customers() {
    }

    public Customers(String name, int age, String phoneNumber, Sex sex) {
        super(name, age, phoneNumber, sex);
    }
}
