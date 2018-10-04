import org.junit.Before;
import org.junit.Test;
import product.ProductType;
import vendingMachine.slot.DrinkSlot;
import vendingMachine.slot.SweetSlot;

import static org.junit.Assert.assertEquals;

public class SweetSlotTest {

    SweetSlot sweetSlot;

    @Before
    public void before() {
        sweetSlot = new SweetSlot(0.65, 55, 10);
    }

    @Test
    public void hasPrice() {
        assertEquals(0.65, sweetSlot.getPrice(), 0.00);
    }

    @Test
    public void hasCode() {
        assertEquals(55, sweetSlot.getCode());
    }

    @Test
    public void hasCapacity() {
        assertEquals(10, sweetSlot.getCapacity());
    }

    @Test
    public void hasType() {
        assertEquals(ProductType.SWEET, sweetSlot.getProductType());
    }
}
