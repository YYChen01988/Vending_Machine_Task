package product;

public class Drink extends Product {

    private ProductType productType;
    public Drink(String name) {
        super(name);
        this.productType = ProductType.DRINK;
    }

    public ProductType getProductType() {
        return productType;
    }
}
