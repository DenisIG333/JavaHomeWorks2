package ru.geekbrains.lesson2;

public class Program {

    public static void main(String[] args) {
        Box<Apple> boxOfApples1 = new Box<>();
        boxOfApples1.addFruit(new Apple(2.2f));
        boxOfApples1.addFruit(new Apple(1.2f));

        Box<Apple> boxOfApples2 = new Box<>();
        boxOfApples2.addFruit(new Apple(3.5f));

        Box<Orange> boxOfOranges = new Box<>();
        boxOfOranges.addFruit(new Orange(1.5f));

        System.out.println("Вес коробки с яблоками 1: " + boxOfApples1.getWeight()); // Вес коробки с яблоками 1: 2.2
        System.out.println("Вес коробки с яблоками 2: " + boxOfApples2.getWeight()); // Вес коробки с яблоками 2: 0.8
        System.out.println("Вес коробки с апельсинами: " + boxOfOranges.getWeight()); // Вес коробки с апельсинами: 1.5

        System.out.println("Сравнение коробки с яблоками 1 и яблоками 2: " + boxOfApples1.compare(boxOfApples2)); // Сравнение коробки с яблоками 1 и яблоками 2: false
        Box<Apple> emptyBoxOfApples = new Box<>();
        boxOfApples1.transferFruitsTo(emptyBoxOfApples);

        System.out.println("Фрукты в коробке с яблоками 1: " + boxOfApples1.getFruits()); // Фрукты в коробке с яблоками 1: []
    }
    }

