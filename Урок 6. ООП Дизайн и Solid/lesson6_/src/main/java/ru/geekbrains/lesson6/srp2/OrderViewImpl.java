package ru.geekbrains.lesson6.srp2;

public class OrderViewImpl implements OrderView{
    @Override
    public void showConfirmation() {
        System.out.println("Информация по заказу успешно сохранена в файл.");
    }
}
