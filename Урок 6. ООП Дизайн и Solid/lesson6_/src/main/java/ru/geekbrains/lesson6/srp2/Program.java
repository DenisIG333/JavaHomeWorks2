package ru.geekbrains.lesson6.srp2;

import java.util.Scanner;

public class Program {

    /**
     * TODO: Переработать структуру приложения Order, приложение должно соответствовать
     *  принципу SRP.
     * @param args
     */
    public static void main(String[] args) {

//        Order order = new Order();
//        order.inputFromConsole();
//        order.saveToJson();
//        System.out.println("Информация по заказу успешно сохранена в файл.");

        OrderView orderView = new OrderViewImpl(); // Создание представления
        OrderPresenter orderPresenter = new OrderPresenterImpl(null, orderView); // Создание презентера

        Scanner scanner = new Scanner(System.in);
        System.out.print("Имя клиента: ");
        String clientName = scanner.nextLine();
        System.out.print("Продукт: ");
        String product = scanner.nextLine();
        System.out.print("Кол-во: ");
        int quantity = scanner.nextInt();
        System.out.print("Цена: ");
        double price = scanner.nextDouble();

        orderPresenter.processOrder(clientName, product, quantity, price);

    }

}
