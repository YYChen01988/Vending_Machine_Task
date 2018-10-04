import org.junit.Before;
import org.junit.Test;
import product.ProductType;
import product.Sweet;


import vendingMachine.slot.SweetSlot;

import static org.junit.Assert.assertEquals;

public class SweetSlotTest {

    SweetSlot sweetSlot;
    Sweet chocolate;

    @Before
    public void before() {
        sweetSlot = new SweetSlot(0.65, 55, 2);
        chocolate = new Sweet("Chocolate");
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
        assertEquals(2, sweetSlot.getCapacity());
    }

    @Test
    public void hasType() {
        assertEquals(ProductType.SWEET, sweetSlot.getProductType());
    }

    @Test
    public void canAddDrink() {
        sweetSlot.addSweets(chocolate);
        sweetSlot.addSweets(chocolate);
        sweetSlot.addSweets(chocolate);
        assertEquals(2, sweetSlot.getSweetCount());
    }

    @Test
    public void canRemoveDrink() {
        sweetSlot.addSweets(chocolate);
        sweetSlot.removeSweet();
        assertEquals(0, sweetSlot.getSweetCount());
    }
}
