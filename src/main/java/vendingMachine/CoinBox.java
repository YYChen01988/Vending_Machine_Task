package vendingMachine;


import coin.Coin;
import coin.CoinType;

import java.util.ArrayList;

public class CoinBox {

    private double total;
    private ArrayList<Coin> coins;

    public CoinBox() {
        this.total = total;
        this.coins = new ArrayList<>();
    }

    public double getTotal() {
        return total;
    }

    public void addCoin(Coin coin){
        if(coin.getCoinType() != CoinType.ONE && coin.getCoinType() != CoinType.TWO){
            coins.add(coin);
        }
    }

    public int coinCount() {
        return this.coins.size();
    }

    public double totalCoinValue() {
        for (Coin coin : coins){
            total += coin.getValue();
        }
        return total;
    }

    public void clear() {
        total = 0;
    }
}
