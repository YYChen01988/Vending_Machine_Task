package product;

public abstract class Product {
    private String name;
    private int productCode;
    private double price;

    public Product(String name, int productCode, double price) {
        this.name = name;
        this.productCode = productCode;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public int getProductCode() {
        return productCode;
    }

    public double getPrice() {
        return price;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
