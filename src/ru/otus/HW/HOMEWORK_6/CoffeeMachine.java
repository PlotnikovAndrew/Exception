package ru.otus.HW.HOMEWORK_6;

import static ru.otus.HW.HOMEWORK_6.Handler.*;
import static ru.otus.HW.HOMEWORK_6.Writer.*;

public class CoffeeMachine {
    private int coffeeBag;
    private int milkBag;
    private int waterBag;
    private boolean readySystemStatus = true;

    public CoffeeMachine(int coffeeBag, int milkBag, int waterBag) {
        this.coffeeBag = coffeeBag;
        this.milkBag = milkBag;
        this.waterBag = waterBag;
    }

    public void checkSystemMilk(CoffeeRecipe coffeeRecipe) {
        int needMilk = coffeeRecipe.getHowMatchMilkNeed();
        try{
            checkMilkBag(this.milkBag, needMilk);
        }catch (NotMilkException e){
            System.err.println(e.getMessage());
            this.readySystemStatus = false;
            writer();
        }
    }

    public void checkSystemCoffee(CoffeeRecipe coffeeRecipe) throws NotCoffeeException{
        int needCoffee = coffeeRecipe.getHowMatchCoffeeNeed();
        checkCoffeeBag(this.coffeeBag, needCoffee);
    }

    public void checkSystemWater(CoffeeRecipe coffeeRecipe) throws NotWaterException {
       int needWater = coffeeRecipe.getHowMatchWaterNeed();
        checkWaterBag(this.waterBag, needWater);
    }

    public void changeStatus(){
        this.readySystemStatus = false;
    }

    public boolean getStatus(){
        return this.readySystemStatus;
    }

    public void makeCoffee(){
        System.out.println("Ваш кофе");
    }
}

