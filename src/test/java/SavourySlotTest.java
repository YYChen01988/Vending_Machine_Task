import org.junit.Before;
import org.junit.Test;
import product.ProductType;
import product.Savoury;
import vendingMachine.slot.DrinkSlot;
import vendingMachine.slot.SavourySlot;
import vendingMachine.slot.Slot;

import static org.junit.Assert.assertEquals;

public class SavourySlotTest {

    SavourySlot savourySlot;
    Savoury crisps;

    @Before
    public void before() {
        savourySlot = new SavourySlot(0.50, 22, 2);
        crisps = new Savoury("Crisps");
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
        assertEquals(2, savourySlot.getCapacity());
    }

    @Test
    public void hasType() {
        assertEquals(ProductType.SAVOURY, savourySlot.getProductType());
    }

    @Test
    public void canAddDrink() {
        savourySlot.addSavoury(crisps);
        savourySlot.addSavoury(crisps);
        savourySlot.addSavoury(crisps);
        assertEquals(2, savourySlot.getSavouryCount());
    }

    @Test
    public void canRemoveDrink() {
        savourySlot.addSavoury(crisps);
        savourySlot.removeSavoury();
        assertEquals(0, savourySlot.getSavouryCount());
    }
}
