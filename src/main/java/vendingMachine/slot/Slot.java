package vendingMachine.slot;

import product.Product;
import product.ProductType;

import java.util.ArrayList;

public abstract class Slot {
    private double price;
    private int code;
    private int capacity;
    ArrayList<Product> products;

    public Slot(double price, int code, int capacity) {
        this.price = price;
        this.code = code;
        this.capacity = capacity;
        this.products = new ArrayList<>();
    }

    public double getPrice() {
        return price;
    }

    public int getCode() {
        return code;
    }

    public int getCapacity() {
        return capacity;
    }

    public int productCount() {
        return products.size();
    }
}
