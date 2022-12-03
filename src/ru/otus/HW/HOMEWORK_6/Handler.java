package ru.otus.HW.HOMEWORK_6;

public class Handler {

    public static void checkMilkBag(int milkBag, int needMilk)  throws NotMilkException {
        if (needMilk > milkBag){
            throw new NotMilkException();
        }
    }
    public static void checkCoffeeBag(int coffeeBag, int needCoffee)  throws NotCoffeeException {
        if (needCoffee > coffeeBag){
            throw new NotCoffeeException();
        }
    }

    public static void checkWaterBag(int waterBag, int needWater)  throws NotWaterException {
        if (needWater > waterBag){
            throw new NotWaterException();
        }
    }
}
