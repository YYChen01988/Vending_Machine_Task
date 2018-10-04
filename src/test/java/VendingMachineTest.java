import org.junit.Before;
import org.junit.Test;
import product.Drink;
import product.Savoury;
import vendingMachine.CoinBox;
import vendingMachine.Till;
import vendingMachine.slot.DrinkSlot;
import vendingMachine.slot.SavourySlot;

import static org.junit.Assert.assertEquals;

public class VendingMachineTest {

    VendingMachine vendingMachine;
    DrinkSlot drinkSlot;
    SavourySlot savourySlot;
    Drink drink;
    Savoury savoury;
    Till till;
    CoinBox coinbox;

    @Before
    public void before() {
        drink = new Drink("Cola");
        savoury = new Savoury("Crisps");
        drinkSlot = new DrinkSlot(1.00, 22, 10);
        savourySlot = new SavourySlot(0.50, 33, 10);
        till = new Till(coinbox);
        vendingMachine = new VendingMachine(till);
    }

    @Test
    public void hasAValidDrinkCode() {
        vendingMachine.addSlot(drinkSlot);
        assertEquals(1, vendingMachine.drinkSlotCount());
        Boolean result = vendingMachine.checkDrinkProductCode(22);
        assertEquals(true, result);
    }

    @Test
    public void hasAnInvalidDrinkCode() {
        vendingMachine.addSlot(drinkSlot);
        Boolean result = vendingMachine.checkDrinkProductCode(10);
        assertEquals(false, result);
    }
}
