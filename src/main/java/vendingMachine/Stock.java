package vendingMachine;

import product.Product;

import java.util.ArrayList;

public class Stock {
    ArrayList<Product> products;

    public Stock() {
        this.products = new ArrayList<>();
    }


    public int productCount() {
        return this.products.size();
    }
}
