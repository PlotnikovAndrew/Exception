package ru.otus.HW.HOMEWORK_6;

import static ru.otus.HW.HOMEWORK_6.Writer.writer;

public class Breakfast {

    public void makeBreakfast(int a, int b, int c) throws NotWaterException {

        CoffeeMachine coffeeMachine1 = new CoffeeMachine(a,b,c);

        coffeeMachine1.checkSystemMilk(CoffeeRecipe.CAPPUCCINO_RECIPE);

        try {
            coffeeMachine1.checkSystemCoffee(CoffeeRecipe.CAPPUCCINO_RECIPE);
        } catch (NotCoffeeException e) {
            System.err.println("Необходимо досыпать кофе");
            coffeeMachine1.changeStatus();
            writer();
        }

        coffeeMachine1.checkSystemWater(CoffeeRecipe.CAPPUCCINO_RECIPE);


        boolean readySystemStatus = coffeeMachine1.getStatus();
        if (readySystemStatus == true){
            coffeeMachine1.makeCoffee();
        }
    }
}
