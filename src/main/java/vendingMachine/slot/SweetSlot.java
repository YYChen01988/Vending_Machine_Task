package vendingMachine.slot;

import product.Drink;
import product.ProductType;
import product.Sweet;

import java.util.ArrayList;

public class SweetSlot extends Slot {

    private ArrayList<Sweet> sweets;
    private ProductType productType;
    public SweetSlot(double price, int code, int capacity) {
        super(price, code, capacity);
        this.productType = ProductType.SWEET;
        this.sweets = new ArrayList<>();
    }

    public ProductType getProductType() {
        return productType;
    }

    public void addSweets(Sweet sweet) {
        if(sweets.size() < this.getCapacity()){
            sweets.add(sweet);
        }
    }
    public void removeSweet(){
        sweets.remove(0);
    }

    public int getSweetCount() {
        return this.sweets.size();
    }
}
