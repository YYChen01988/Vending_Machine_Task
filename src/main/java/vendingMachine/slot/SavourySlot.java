package vendingMachine.slot;

import product.Drink;
import product.ProductType;
import product.Savoury;

import java.util.ArrayList;

public class SavourySlot extends Slot {

    private ArrayList<Savoury> crisps;

    private ProductType productType;
    public SavourySlot(double price, int code, int capacity) {
        super(price, code, capacity);
        this.productType = ProductType.SAVOURY;
        this.crisps = new ArrayList<>();
    }

    public ProductType getProductType() {
        return productType;
    }

    public void addSavoury(Savoury crisp) {
        if(crisps.size() < this.getCapacity()){
            crisps.add(crisp);
        }
    }
    public void removeSavoury(){
        crisps.remove(0);
    }

    public int getSavouryCount() {
        return this.crisps.size();
    }
}
