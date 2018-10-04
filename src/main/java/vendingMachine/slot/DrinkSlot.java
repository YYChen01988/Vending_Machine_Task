package vendingMachine.slot;

import product.ProductType;

public class DrinkSlot extends Slot {

    private ProductType productType;
    public DrinkSlot(double price, int code, int capacity) {
        super(price, code, capacity);
        this.productType = ProductType.DRINK;
    }

    public ProductType getProductType() {
        return productType;
    }
}
