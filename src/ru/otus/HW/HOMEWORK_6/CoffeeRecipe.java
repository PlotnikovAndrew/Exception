package ru.otus.HW.HOMEWORK_6;

public enum CoffeeRecipe {
    CAPPUCCINO_RECIPE(4, 2);

    private int milk;
    private int coffee;
    private int water;
    private CoffeeRecipe(int milk, int coffee) {
        this.coffee = coffee;
        this.milk = milk;
        this.water = this.coffee + this.milk;
    }

    public int getHowMatchMilkNeed(){
        return this.milk;
    }

    public int getHowMatchCoffeeNeed(){
        return this.coffee;
    }

    public int getHowMatchWaterNeed(){
        return this.water;
    }
}
