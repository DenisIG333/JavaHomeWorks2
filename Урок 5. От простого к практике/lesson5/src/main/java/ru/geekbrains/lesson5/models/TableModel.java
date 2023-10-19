package ru.geekbrains.lesson5.models;

import ru.geekbrains.lesson5.presenters.Model;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

public class TableModel implements Model { //получение данных

    private Collection<Table> tables;


    /**
     * Получение списка всех столиков
     */
    @Override
    public Collection<Table> loadTables() {
        //каждый раз при обращении к методу loadTables() происходит проверка проинициализирован ли объект tables
        //если нет, тогда создаётся новый объект коллекции и заполняется пятью столиками, если tables проинициализирован
        //тогда возвращается 5 столиков
        if (tables == null){
            tables = new ArrayList<>();

            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
            tables.add(new Table());
        }

        return tables;
    }

    /**
     * Бронирование столика
     * @param reservationDate Дата бронирования
     * @param name Имя
     */
    @Override
    public int reservationTable(Date reservationDate, int tableNo, String name) {
        for (Table table: loadTables()) { //проходимся по всем столикам
            if (table.getNo() == tableNo){ //находим столик с заданым номером
                Reservation reservation = new Reservation(reservationDate, name);//если находим столик обращаемся
                // к коллекции бронирования на уровне этого столика
                table.getReservations().add(reservation);// и добавляем к этой коллекции новый объект бронирования
                return reservation.getId(); //возвращаем идентификатор
            }
        }
        throw new RuntimeException("Некорректный номер столика.");
    }

    @Override
    public int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
        for (Table table: loadTables()) { //проходимся по всем столикам
            if (table.getNo() == tableNo){ //находим столик с заданым номером
                Reservation reservation = new Reservation(reservationDate, name);//если находим столик обращаемся
                // к коллекции бронирования на уровне этого столика
                table.getReservations().add(reservation);// и добавляем к этой коллекции новый объект бронирования
                return reservation.getId(); //возвращаем идентификатор
            }
        }
        throw new RuntimeException("Некорректный номер столика.");
    }


    /**
     * TODO: Доработать в рамках домашней работы
     * Отменить бронирование по номеру
     * @param oldReservation
     * @param reservationDate
     * @param tableNo
     * @param name
     * @return
     */
//    public int changeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name){
//        return -1;
//    }

}
