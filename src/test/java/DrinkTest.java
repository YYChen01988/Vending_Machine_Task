import org.junit.Before;
import org.junit.Test;
import product.Drink;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class DrinkTest {
    Drink drink;

    @Before
    public void before() {
        drink = new Drink("Cola",01, 1.00);
    }

    @Test
    public void hasName() {
        assertEquals("Cola", drink.getName());
    }

    @Test
    public void hasProductCode() {
        assertEquals(01, drink.getProductCode());
    }

    @Test
    public void hasPrice() {
        assertEquals(1.00, drink.getPrice(), 0.00);
    }
}
