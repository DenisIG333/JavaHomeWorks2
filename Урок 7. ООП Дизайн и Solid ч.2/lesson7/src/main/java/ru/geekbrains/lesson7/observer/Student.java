package ru.geekbrains.lesson7.observer;

public class Student implements Observer{

    private String name;
    private int salary = 2000;
    private String vacancy;


    public Student(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary, String vacancy) {
        if(vacancy.equals("C# Developer")){
            if (this.salary <= salary){
                System.out.printf("Студент %s: Мне нужна эта работа! (компания: %s; заработная плата: %d)\n",
                        name, nameCompany, salary);
                this.salary = salary;
            }
            else {
                System.out.printf("Студент %s: Я найду работу получше! (компания: %s; заработная плата: %d)\n",
                        name, nameCompany, salary);
            }
        }
        else {
            System.out.printf("Студент - мне не подходит данная вакансия %s %s - \n", vacancy, nameCompany);
        }

    }


}
