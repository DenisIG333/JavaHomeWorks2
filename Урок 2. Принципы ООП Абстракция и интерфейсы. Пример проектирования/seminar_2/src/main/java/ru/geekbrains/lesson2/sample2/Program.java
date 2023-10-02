package ru.geekbrains.lesson2.sample2;

public class Program {

    public static void main(String[] args) {

        BaseCat cat2 = new Cat();
        Animal cat3 = new Cat();
        Cat cat1 = new Cat();
        Dog dog1 = new Dog();

        Animal[] animals = new Animal[2];
        animals[0] = cat1;
        animals[1] = dog1;
    }

    public static void processVoice(Animal[] animals){
        for (Animal animal: animals) {
            animal.voice();
            animal.jump();

        }
    }

}
