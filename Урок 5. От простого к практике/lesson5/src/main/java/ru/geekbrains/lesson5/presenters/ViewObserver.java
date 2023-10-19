package ru.geekbrains.lesson5.presenters;

import java.util.Date;

public interface ViewObserver {

    void onReservationTable(Date orderDate, int tableNo, String name);

    void onChangeReservationTable(int reservationId, Date reservationDate,int tableNo, String name);

}
