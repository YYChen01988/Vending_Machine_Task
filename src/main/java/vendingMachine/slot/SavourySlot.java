package vendingMachine.slot;

import product.ProductType;

public class SavourySlot extends Slot {

    private ProductType productType;
    public SavourySlot(double price, int code, int capacity) {
        super(price, code, capacity);
        this.productType = ProductType.SAVOURY;
    }

    public ProductType getProductType() {
        return productType;
    }
}
