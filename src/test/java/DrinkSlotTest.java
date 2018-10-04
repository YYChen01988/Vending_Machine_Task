import org.junit.Before;
import org.junit.Test;
import product.Drink;
import product.Product;
import product.ProductType;
import vendingMachine.slot.DrinkSlot;

import static org.junit.Assert.assertEquals;

public class DrinkSlotTest {

    DrinkSlot drinkSlot;
    Drink drink;

    @Before
    public void before() {
        drinkSlot = new DrinkSlot(1.00, 43, 2);
        drink = new Drink("Cola");
    }

    @Test
    public void hasPrice() {
        assertEquals(1.00, drinkSlot.getPrice(), 0.00);
    }

    @Test
    public void hasCode() {
        assertEquals(43, drinkSlot.getCode());
    }

    @Test
    public void hasCapacity() {
        assertEquals(2, drinkSlot.getCapacity());
    }

    @Test
    public void hasType() {
        assertEquals(ProductType.DRINK, drinkSlot.getProductType());
    }

    @Test
    public void canAddDrink() {
        drinkSlot.addDrinks(drink);
        drinkSlot.addDrinks(drink);
        drinkSlot.addDrinks(drink);
        assertEquals(2, drinkSlot.getDrinkCount());
    }

    @Test
    public void canRemoveDrink() {
        drinkSlot.addDrinks(drink);
        drinkSlot.removeDrink();
        assertEquals(0, drinkSlot.getDrinkCount());
    }


}
