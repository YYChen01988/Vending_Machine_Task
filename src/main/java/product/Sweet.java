package product;

public class Sweet extends Product {

    private ProductType productType;
    public Sweet(String name) {
        super(name);
        this.productType = ProductType.SWEET;
    }

    public ProductType getProductType() {
        return productType;
    }
}
