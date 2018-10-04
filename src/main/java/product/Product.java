package product;

public abstract class Product {
    private String name;
//    private ProductType type;

    public Product(String name) {
        this.name = name;
//        this.type = type;
    }

    public String getName() {
        return name;
    }

//    public ProductType getType() {
//        return type;
//    }
}
