package ru.geekbrains.lesson7.observer;

import java.util.Random;

public class Company {

    private Random random = new Random();

    private String name;

    private String vacancy;

    private int maxSalary;

    private Publisher jobAgency;


    public Company(String name, Publisher jobAgency, int maxSalary, String vacancy) {
        this.name = name;
        this.maxSalary = maxSalary;
        this.jobAgency = jobAgency;
        this.vacancy = vacancy;
    }

//    public void needEmployee(){
//        int salary = random.nextInt(maxSalary);
//        jobAgency.sendOffer(name, salary);
//    }

    public void needEmployee(){
        int salary = random.nextInt(maxSalary);
        jobAgency.sendOffer(name, salary, vacancy);
    }

}
