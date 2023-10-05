package ru.geekbrains.lesson3;

import java.util.Arrays;
import java.util.Random;

public class Task2 {

    private static Random random = new Random();

    static Worker generateWorker(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surNames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };

        int salary = random.nextInt(50000, 120000);
        int age = random.nextInt(18, 65);

        Worker worker = new Worker(surNames[random.nextInt(surNames.length)], names[random.nextInt(names.length)], salary, age);
        return worker;
    }

    static Freelancer generateFreelancer(){
        String[] names = new String[] { "Виктор", "Василий", "Пётр", "Сергей", "Иван", "Максим", "Дмитрий", "Олег", "Александр", "Алексей" };
        String[] surNames = new String[] { "Соболев", "Крылов", "Булгаков", "Фадеев", "Кузин", "Нечаев", "Андрианов", "Добрынин", "Егоров", "Бычков" };

        double salary = 20.8 * 8 * 2500;
        int age = random.nextInt(18, 65);
        //System.out.println(age);
        Freelancer freelancer = new Freelancer(surNames[random.nextInt(surNames.length)], names[random.nextInt(names.length)], salary, age);

        return freelancer;
    }

    /**
     * TODO: Метод generateEmployees должен быть универсальным, возвращать некоторое кол-во
     *  сотрудников различных типов
     * @param count
     * @return
     */


    static Employee[] generateEmployees(int count, int random_employee){

        Worker[] array_worker = new Worker[count];
        for (int i = 0; i < array_worker.length; i++)
            array_worker[i] = generateWorker();

        Freelancer[] array_freelancer = new Freelancer[count];
        for (int i = 0; i < array_freelancer.length; i++)
            array_freelancer[i] = generateFreelancer();




        if (random_employee == 1){
            return array_freelancer;
        }else {
            return array_worker;
        }

    }

    public static void main(String[] args) {

        int random_employee = random.nextInt(1, 3);
        Employee[] employees = generateEmployees(15, random_employee);

        Arrays.sort(employees, new SalaryComparator(SortType.Ascending));
        Arrays.sort(employees, new AgeComparator(SortType.Ascending));

        for (Employee employee: employees) {
            System.out.println(employee);
        }

        System.out.println();

        Arrays.sort(employees, new SalaryComparator(SortType.Descending));
        Arrays.sort(employees, new AgeComparator(SortType.Descending));

        for (Employee employee: employees) {
            System.out.println(employee);
        }

    }

}
