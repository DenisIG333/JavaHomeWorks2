package ru.geekbrains.lesson2.sample1;

public abstract class Animal {

    private String name;


    public abstract void voice();

    public void jump(){
        System.out.println("Животное подпрыгнуло");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }
}
