package Model;

import enums.Sex;

public class Cashier extends Staff{
    private int workTime;
    private boolean goodCustomerRelationship;

    public Cashier(String name, int age, String phoneNumber, Sex sex, int idNumber, int workTime, boolean goodCustomerRelationship) {
        super(name, age, phoneNumber, sex, idNumber);
        this.workTime = workTime;
        this.goodCustomerRelationship = goodCustomerRelationship;
    }

    public int getWorkTime() {
        return workTime;
    }

    public void setWorkTime(int workTime) {
        this.workTime = workTime;
    }

    public boolean isGoodCustomerRelationship() {
        return goodCustomerRelationship;
    }

    public void setGoodCustomerRelationship(boolean goodCustomerRelationship) {
        this.goodCustomerRelationship = goodCustomerRelationship;
    }

    @Override
    public String toString() {
        return "Cashier{" +
                "workTime=" + workTime +
                ", goodCustomerRelationship=" + goodCustomerRelationship +
                '}';
    }
}
