package ru.geekbrains.lesson5.models;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Locale;

public class Table {


    private static int counter;

    private final int no;

    private final Collection<Reservation> reservations = new ArrayList<>(); //Коллекция резервов (история)
    //можем добавлять сюда резервы, в случае если
    // пользователь не пришёл, удаляем из этой коллекции бронирование

    public int getNo() {
        return no;
    }

    public Collection<Reservation> getReservations() { //геттер для коллекции
        return reservations;
    }


    {
        no = ++counter;
    }

    @Override
    public String toString() {
        return String.format(Locale.getDefault(), "Столик #%d", no);
    }

}
