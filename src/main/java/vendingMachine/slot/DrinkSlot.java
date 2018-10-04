package vendingMachine.slot;

import product.Drink;
import product.Product;
import product.ProductType;

import java.util.ArrayList;

public class DrinkSlot extends Slot {

    private ArrayList<Drink> drinks;

    private ProductType productType;
    public DrinkSlot(double price, int code, int capacity) {
        super(price, code, capacity);
        this.productType = ProductType.DRINK;

        this.drinks = new ArrayList<>();
    }

    public ProductType getProductType() {
        return productType;
    }

    public void addDrinks(Drink drink) {
        if(drinks.size() < this.getCapacity()){
            drinks.add(drink);
        }
    }
    public void removeDrink(){
        drinks.remove(0);
    }

    public int getDrinkCount() {
        return this.drinks.size();
    }


}
