import coin.Coin;
import coin.CoinType;
import org.junit.Before;
import org.junit.Test;
import vendingMachine.CoinBox;

import static org.junit.Assert.assertEquals;

public class CoinBoxTest {

    CoinBox coinBox;
    Coin coin, coin2, coin3, coin4;

    @Before
    public void before() {
        coinBox = new CoinBox();
        coin = new Coin(CoinType.FIFTY);
        coin2 = new Coin(CoinType.TWENTY);
        coin3 = new Coin(CoinType.ONE);
        coin4 = new Coin(CoinType.TWO);
    }

    @Test
    public void getStartTotal() {
        assertEquals(0, coinBox.getTotal(),0.00);
    }

    @Test
    public void coinBoxStartEmpty() {
        assertEquals(0, coinBox.coinCount());
    }

    @Test
    public void canAddCoin() {
        coinBox.addCoin(coin);
        coinBox.addCoin(coin2);
        assertEquals(2, coinBox.coinCount());
        assertEquals(0.70, coinBox.totalCoinValue(), 0.00);
    }

    @Test
    public void canNotAcceptOneOrTwoP() {
        coinBox.addCoin(coin);
        coinBox.addCoin(coin2);
        coinBox.addCoin(coin3);
        coinBox.addCoin(coin4);
        assertEquals(2, coinBox.coinCount());
        assertEquals(0.70, coinBox.totalCoinValue(), 0.00);

    }
}
