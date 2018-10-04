package vendingMachine;

public class Till {
    private double amount;
    private CoinBox coinBox;

    public Till(CoinBox coinBox) {
        this.amount = 0;
        this.coinBox = coinBox;
    }

    public double getAmount() {
        return amount;
    }

    public void addAmount(double addAmount) {
        this.amount += addAmount;
    }

    public void bankMoney(double total) {
        total = coinBox.getTotal();
        this.amount += total;
        coinBox.clear();
    }
}
