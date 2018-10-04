package product;

public class Savoury extends Product {

    private ProductType productType;
    public Savoury(String name) {
        super(name);
        this.productType = ProductType.SAVOURY;
    }

    public ProductType getProductType() {
        return productType;
    }
}
