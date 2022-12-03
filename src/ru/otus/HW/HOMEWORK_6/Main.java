package ru.otus.HW.HOMEWORK_6;

public class Main {
    public static void main(String[] args) throws NotWaterException {
        Breakfast breakfast1 = new Breakfast();
        Breakfast breakfast2 = new Breakfast();
        Breakfast breakfast3 = new Breakfast();
        Breakfast breakfast4 = new Breakfast();
        breakfast1.makeBreakfast(0,10, 10);  //Необходимо досыпать кофе
        breakfast2.makeBreakfast(10,0, 10);  //Нужно долить молоко
        breakfast3.makeBreakfast(10,10, 10); //Кофе готов
        breakfast4.makeBreakfast(10,10, 0); // Долей воды

    }
}