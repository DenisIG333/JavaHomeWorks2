package ru.geekbrains.lesson7.observer;

public class Freelancer implements Observer{
    private String name;
    private int salary = 3000;


    public Freelancer(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary, String vacancy) {
        if(vacancy.equals("Java Developer")){
            if (this.salary <= salary){
                System.out.printf("Фрилансер %s: Мне нужна эта работа! (компания: %s; заработная плата: %d)\n",
                        name, nameCompany, salary);
                this.salary = salary;
            }
            else {
                System.out.printf("Фрилансер %s: Я найду работу получше! (компания: %s; заработная плата: %d)\n",
                        name, nameCompany, salary);
            }
        }
        else {
            System.out.printf("Фрилансер - мне не подходит данная вакансия  %s %s - \n", vacancy, nameCompany);
        }
    }
}
