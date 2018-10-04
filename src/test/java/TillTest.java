import coin.Coin;
import coin.CoinType;
import org.junit.Before;
import org.junit.Test;
import vendingMachine.CoinBox;
import vendingMachine.Till;

import static org.junit.Assert.assertEquals;

public class TillTest {
    Till till;
    CoinBox coinBox;
    Coin coin1;

    @Before
    public void before() {
        coinBox = new CoinBox();
        coin1 = new Coin(CoinType.FIFTY);
        till = new Till(coinBox);

    }

    @Test
    public void startEmpty() {
        assertEquals(0, till.getAmount(), 0.00);
    }

    @Test
    public void canAddAmount() {
        till.addAmount(10);
        assertEquals(10.00, till.getAmount(), 0.00);
    }

    @Test
    public void canTakeAmountFrom() {
        coinBox.addCoin(coin1);
        double coinValue = coinBox.totalCoinValue();
        assertEquals(0.50, coinBox.getTotal(), 0.00);
        till.bankMoney(coinValue);
        assertEquals(0.50, till.getAmount(),0.00);
        assertEquals(0.00, coinBox.getTotal(), 0.00);
    }
}
