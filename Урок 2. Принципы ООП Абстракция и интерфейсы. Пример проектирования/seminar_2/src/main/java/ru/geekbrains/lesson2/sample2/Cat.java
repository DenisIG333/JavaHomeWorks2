package ru.geekbrains.lesson2.sample2;

public class Cat extends BaseCat implements Animal{
    @Override
    public void jump() {
        System.out.println("Кот прыгает.");
    }

    @Override
    public void voice() {
        System.out.println("Кот мяукает.");
    }
}
