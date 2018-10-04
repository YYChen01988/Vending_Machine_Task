import coin.Coin;
import product.Drink;
import product.Savoury;
import vendingMachine.CoinBox;
import vendingMachine.Till;
import vendingMachine.slot.DrinkSlot;
import vendingMachine.slot.SavourySlot;
import vendingMachine.slot.Slot;

import java.util.ArrayList;

public class VendingMachine {
//    CoinBox coinBox;
 //   Coin coin;
//    Savoury savoury;
//    Drink drink;
    Till till;
    ArrayList<SavourySlot> savourySlots;
    ArrayList<DrinkSlot> drinkSlots;

    public VendingMachine(Till till) {
//        this.coinBox = coinBox;
//        this.coin = coin;
//        this.savoury = savoury;
        this.savourySlots = new ArrayList<>();
//        this.drink = drink;
        this.drinkSlots = new ArrayList<>();
        this.till = till;

    }

    public boolean checkSavouryProductCode(int code){
        for (SavourySlot savourySlot : savourySlots){
            if(savourySlot.getCode() == code){
                return true;
            }
        }
        return false;
    }

    public boolean checkDrinkProductCode(int code){
        for (DrinkSlot drinkSlot : drinkSlots){
            if(drinkSlot.getCode() == code){
                return true;
            }
        }
        return false;
    }





    public void addSlot(DrinkSlot drinkSlot) {
        this.drinkSlots.add(drinkSlot);
    }

    public int drinkSlotCount() {
        return this.drinkSlots.size();
    }


}
