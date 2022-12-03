package ru.otus.HW.HOMEWORK_6;

public class NotCoffeeException extends Exception{
    public NotCoffeeException(){
        super("Нужно досыпать кофе");
    }
}
