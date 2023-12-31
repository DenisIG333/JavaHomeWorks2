package ru.geekbrains.lesson2.sample1;

public class Program {

    public static void main(String[] args) {


        Cat cat1 = new Cat("Персик");
        cat1.setColor("Рыжий");

        Dog dog1 = new Dog();

        Cat cat2 = new Cat("Тиграша");
        cat2.setColor("Серый");

        Object o1 = cat2;


        Animal dog2 = new Dog();

        Animal[] animals = new Animal[4];
        animals[0] = cat1;
        animals[1] = dog1;
        animals[2] = cat2;
        animals[3] = dog2;

        processVoice(animals);


    }

    public static void processVoice(Animal[] animals){
        for (Animal animal: animals) {
            animal.voice();
            if (animal instanceof Cat){
                Cat cat = (Cat)animal;
                System.out.println(cat.getColor());
            }

        }
    }


}
