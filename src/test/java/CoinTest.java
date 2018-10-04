import coin.Coin;
import coin.CoinType;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class CoinTest {

    Coin coin1, coin2;

    @Before
    public void before() {
        coin1 = new Coin(CoinType.FIFTY);
        coin2 = new Coin(CoinType.ONEPOUND);
    }

    @Test
    public void hasType() {
        assertEquals(CoinType.ONEPOUND, coin2.getCoinType());
    }

    @Test
    public void FiftyHasValueOf50() {
        assertEquals(0.50, coin1.getValue(), 0.00);
    }


}
