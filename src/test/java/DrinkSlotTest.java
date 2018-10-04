import org.junit.Before;
import org.junit.Test;
import product.ProductType;
import vendingMachine.slot.DrinkSlot;

import static org.junit.Assert.assertEquals;

public class DrinkSlotTest {

    DrinkSlot drinkSlot;

    @Before
    public void before() {
        drinkSlot = new DrinkSlot(1.00, 43, 10);
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
        assertEquals(10, drinkSlot.getCapacity());
    }

    @Test
    public void hasType() {
        assertEquals(ProductType.DRINK, drinkSlot.getProductType());
    }
}
