package ru.geekbrains.lesson5.presenters;

import ru.geekbrains.lesson5.models.Table;

import java.util.Collection;
import java.util.Date;

public interface Model { //описывает контракт который должен соблюдаться при общении с моделями

    Collection<Table> loadTables(); //коллекция столиков в ресторане

    int reservationTable(Date reservationDate, int tableNo, String name); //бронирование столика

    int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name); //отмена бронирование столика


}
