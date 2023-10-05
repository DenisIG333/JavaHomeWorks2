package ru.geekbrains.lesson3;

/**
 * TODO: Реализовать тип фрилансера в рамках домашней работы
 * Фрилансер (работник с почасовой оплатой)
 */


public class Freelancer extends Employee {
    public Freelancer(String surName, String name, double salary, int age) {
        super(surName, name, salary, age);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public int age() {
        return age;
    }

    @Override
    public String toString() {
        return String.format("%s %s; Фрилансер; Среднемесячная заработная плата (почасовая ставка): %.2f (руб.); Возраст: %d;",
                surName, name, calculateSalary(), age);
    }
}
