package Model;

import enums.Sex;

public class Staff extends Person{
    private int idNumber;


    public Staff(String name, int age, String phoneNumber, Sex sex, int idNumber) {
        super(name, age, phoneNumber, sex);
        this.idNumber = idNumber;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "idNumber=" + idNumber +
                '}';
    }
}
