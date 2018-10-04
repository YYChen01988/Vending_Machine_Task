import org.junit.Before;
import org.junit.Test;
import product.ProductType;
import product.Savoury;

import static org.junit.Assert.assertEquals;

public class SavouryTest {

    Savoury savoury;

    @Before
    public void before() {
        savoury = new Savoury("Crisps");
    }

    @Test
    public void hasName() {
        assertEquals("Crisps", savoury.getName());
    }

    @Test
    public void hasType() {
        assertEquals(ProductType.SAVOURY, savoury.getProductType());
    }

    //    @Test
//    public void hasProductCode() {
//        assertEquals(11, savoury.getProductCode());
//    }
//
//    @Test
//    public void hasPrice() {
//        assertEquals(0.50, savoury.getPrice(), 0.00);
//    }
}
