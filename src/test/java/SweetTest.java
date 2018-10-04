import org.junit.Before;
import org.junit.Test;
import product.ProductType;
import product.Sweet;

import static org.junit.Assert.assertEquals;

public class SweetTest {

    Sweet sweet;

    @Before
    public void before() {
        sweet = new Sweet("Chocolate");
    }

    @Test
    public void hasName() {
        assertEquals("Chocolate", sweet.getName());
    }

    @Test
    public void hasType() {
        assertEquals(ProductType.SWEET, sweet.getProductType());
    }
//
//    @Test
//    public void hasProductCode() {
//        assertEquals(34, sweet.getProductCode());
//    }
//
//    @Test
//    public void hasPrice() {
//        assertEquals(0.65, sweet.getPrice(), 0.00);
//    }
}
