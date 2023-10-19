package ru.geekbrains.lesson5.presenters;

import ru.geekbrains.lesson5.models.Table;

import java.util.Collection;
import java.util.Date;

public class BookingPresenter implements ViewObserver { //связующее звено модели и представления (не обращается напрямую
    // к представлению и моделям, а делает это через интерфейсы)

    private Model model;
    private View view;

    public BookingPresenter(Model model, View view) {
        this.model = model;
        this.view = view;
        view.setObserver(this);
    }

    /**
     * Получение списка всех столиков
     */
    private Collection<Table> loadTables(){ //получение коллекции столиков
        return model.loadTables(); //обращаемся к модели и просим у неё все столики
    }

    /**
     * Отобразить список столиков
     */

    /**
     * Далее следуя концепции мы должны обратиться к представлению и передать ему все данные для отображения
     */
    public void updateUIShowTables(){ //наполняет список, обновляет представление нашего приложения
        view.showTables(loadTables());
    }

    /**
     * Отобразить результат бронирования на представлении
     * @param reservationId результат бронирования
     */
    private void updateUIShowReservationResult(int reservationId){
        view.showReservationTableResult(reservationId);
    }

    private void updateUIShowCancelReservationResult(int reservationId){
        view.showChangeReservationTable(reservationId);
    }

    /**
     * Произошло событие, пользователь нажал на кнопку резерва столика
     * @param orderDate дата резерва
     * @param tableNo номер столика
     * @param name имя клиента
     */
    @Override
    public void onReservationTable(Date orderDate, int tableNo, String name) {
        try {
            int reservationNo = model.reservationTable(orderDate, tableNo, name);
            updateUIShowReservationResult(reservationNo);
        }
        catch (RuntimeException e){
            updateUIShowReservationResult(-1);
        }
    }

    @Override
    public void onChangeReservationTable(int oldReservation, Date reservationDate, int tableNo, String name) {
        try {
            int reservationNo = model.changeReservationTable(oldReservation, reservationDate, tableNo, name);
            updateUIShowCancelReservationResult(reservationNo);
        }
        catch (RuntimeException e){
            updateUIShowCancelReservationResult(-1);
        }
    }


}
