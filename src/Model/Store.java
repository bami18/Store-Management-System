package Model;

import java.util.ArrayList;

public class Store {
    private String storeName;
    private String address;
    private ArrayList<Product> product;
    private String storePhoneNumber;
    private int minAge;
    private int maxAge;
    private int minWorkTime;

    public Store() {
    }

    public Store(String storeName, String address, ArrayList<Product> product, String storePhoneNumber, int minAge, int maxAge, int minWorkTime) {
        this.storeName = storeName;
        this.address = address;
        this.product = product;
        this.storePhoneNumber = storePhoneNumber;
        this.minAge = minAge;
        this.maxAge = maxAge;
        this.minWorkTime = minWorkTime;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Product> getProduct() {
        return product;
    }

    public void setProduct(ArrayList<Product> product) {
        this.product = product;
    }

    public String getStorePhoneNumber() {
        return storePhoneNumber;
    }

    public void setStorePhoneNumber(String storePhoneNumber) {
        this.storePhoneNumber = storePhoneNumber;
    }

    public int getMinAge() {
        return minAge;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    public int getMaxAge() {
        return maxAge;
    }

    public void setMaxAge(int maxAge) {
        this.maxAge = maxAge;
    }

    public int getMinWorkTime() {
        return minWorkTime;
    }

    public void setMinWorkTime(int minWorkTime) {
        this.minWorkTime = minWorkTime;
    }

    @Override
    public String toString() {
        return "Store{" +
                "storeName='" + storeName + '\'' +
                ", address='" + address + '\'' +
                ", product=" + product +
                ", storePhoneNumber='" + storePhoneNumber + '\'' +
                ", minAge=" + minAge +
                ", maxAge=" + maxAge +
                ", minWorkTime=" + minWorkTime +
                '}';
    }
}
