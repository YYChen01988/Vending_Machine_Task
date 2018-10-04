package coin;

public enum CoinValue {
    ONE(0.01),
    TWO(0.02),
    FIVE(0.05),
    TEN(0.10),
    TWENTY(0.20),
    FIFTY(0.50),
    ONEPOUND(1.00),
    TWOPOUNDS(2.00);

    private final double value;

    CoinValue(double value){
        this.value = value;
    }

    public double getValue() {
        return value;
    }




}
