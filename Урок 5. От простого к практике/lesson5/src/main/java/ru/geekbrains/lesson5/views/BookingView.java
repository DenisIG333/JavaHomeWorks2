package ru.geekbrains.lesson5.views;

import ru.geekbrains.lesson5.models.Table;
import ru.geekbrains.lesson5.presenters.View;
import ru.geekbrains.lesson5.presenters.ViewObserver;

import java.util.Collection;
import java.util.Date;

public class BookingView implements View { // представление данных

    private ViewObserver observer;

    public void setObserver(ViewObserver observer) {
        this.observer = observer;
    }

    public void showTables(Collection<Table> tables) { //отображение коллекции столиков
        for (Table table : tables) {
            System.out.println(table);// распечатать столики на экран
        }
    }

    @Override
    public void showReservationTableResult(int reservationId) {
        if (reservationId > 0){
            System.out.printf("Столик успешно забронирован. Номер вашей брони: #%d\n", reservationId);
        }
        else {
            System.out.println("Не удалось забронировать столик. Попробуйте повторить операцию позже.");
        }
    }

    @Override
    public void showChangeReservationTable(int reservationId) {
        if (reservationId > 0){
            System.out.printf("Ваша бронь успешно перенесена. Номер вашей брони: #%d\n", reservationId);
        }
        else {
            System.out.println("Не_удалось забронировать столик. Попробуйте повторить операцию позже.");
        }
    }

    /**
     * Действие клиента (пользователь нажал на кнопку бронирования), бронирование столика
     * @param orderDate дата бронирования
     * @param tableNo номер столика
     * @param name Имя
     */
    public void reservationTable(Date orderDate, int tableNo, String name){ //использование шаблона проектирования наблюдателя
        observer.onReservationTable(orderDate, tableNo, name);
    }


    /**
     * TODO: Реализовать в рамках домашней работы
     * Действие клиента (пользователь нажал на кнопку отмены бронирования)
     * Отменить резерв столика, забронировать на другое время
     * @param oldReservation старый номер брони
     * @param reservationDate дата бронирования
     * @param tableNo номер столика
     * @param name имя
     */
    public void changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name){
        observer.onChangeReservationTable(oldReservation, reservationDate, tableNo, name);
    }


}
