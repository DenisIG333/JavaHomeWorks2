package ru.geekbrains.lesson2;

import java.util.ArrayList;

public class Box <T extends Fruit> {
    private ArrayList<T> fruits; // Хранение фруктов внутри коробки

    public Box() {
        fruits = new ArrayList<>();
    }

    public void addFruit(T fruit) {
        fruits.add(fruit);
    }

    public float getWeight() {
        if (fruits.isEmpty()) {
            return 0.0f;
        }

        float weight = 0.0f;
        for (T fruit : fruits) {
            weight += fruit.getWeight();
        }
        return weight;
    }

    public boolean compare(Box<?> otherBox) {
        return Math.abs(getWeight() - otherBox.getWeight()) < 0.0001; // Сравнение с плавающей точкой
    }

    public void transferFruitsTo(Box<T> otherBox) {
        if (this == otherBox) {
            return; // Нет необходимости перемещать фрукты, если коробка одинаковая
        }

        if (!fruits.isEmpty() && (otherBox.getFruits().isEmpty() || fruits.get(0).getClass() == otherBox.getFruits().get(0).getClass())) {
            // Если текущая коробка и другая коробка пусты, или они содержат фрукты одного типа
            otherBox.getFruits().addAll(fruits);
            fruits.clear();
        }
    }

    public ArrayList<T> getFruits() {
        return fruits;
    }

        @Override
    public String toString() {
        return "Fruit{" +
                "orange=" + fruits +
                '}';
    }

}
