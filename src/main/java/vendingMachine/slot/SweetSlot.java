package vendingMachine.slot;

import product.ProductType;

public class SweetSlot extends Slot {

    private ProductType productType;
    public SweetSlot(double price, int code, int capacity) {
        super(price, code, capacity);
        this.productType = ProductType.SWEET;
    }

    public ProductType getProductType() {
        return productType;
    }
}
