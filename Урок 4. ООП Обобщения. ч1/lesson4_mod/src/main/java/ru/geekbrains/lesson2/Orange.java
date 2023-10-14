package ru.geekbrains.lesson2;

public class Orange extends Fruit{
    private float weight;

    public Orange(float weight) {
        this.weight = weight;
    }

    @Override
    public float getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return String.format("вес апельсина: %.1f", weight);
    }
}
