import org.junit.Before;
import org.junit.Test;
import product.ProductType;
import vendingMachine.slot.DrinkSlot;
import vendingMachine.slot.SavourySlot;
import vendingMachine.slot.Slot;

import static org.junit.Assert.assertEquals;

public class SavourySlotTest {

    SavourySlot savourySlot;

    @Before
    public void before() {
        savourySlot = new SavourySlot(0.50, 22, 10);
    }

    @Test
    public void hasPrice() {
        assertEquals(0.50, savourySlot.getPrice(), 0.00);
    }

    @Test
    public void hasCode() {
        assertEquals(22, savourySlot.getCode());
    }

    @Test
    public void hasCapacity() {
        assertEquals(10, savourySlot.getCapacity());
    }

    @Test
    public void hasType() {
        assertEquals(ProductType.SAVOURY, savourySlot.getProductType());
    }
}
