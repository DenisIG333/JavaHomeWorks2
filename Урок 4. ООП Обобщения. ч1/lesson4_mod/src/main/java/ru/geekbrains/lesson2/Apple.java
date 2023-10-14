package ru.geekbrains.lesson2;

public class Apple extends Fruit{
    private float weight;

    public Apple(float weight) {
        this.weight = weight;
    }

    @Override
    public float getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return String.format("Вес яблока: %.1f", weight);
    }
}
