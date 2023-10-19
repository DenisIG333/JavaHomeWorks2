package ru.geekbrains.lesson5;

import ru.geekbrains.lesson5.models.TableModel;
import ru.geekbrains.lesson5.presenters.BookingPresenter;
import ru.geekbrains.lesson5.presenters.Model;
import ru.geekbrains.lesson5.presenters.View;
import ru.geekbrains.lesson5.views.BookingView;

import java.util.Date;

public class Program {

    /**
     * TODO: ДОМАШНЯЯ РАБОТА
     *  метод changeReservationTable должен заработать!
     * @param args
     */
    public static void main(String[] args) {

        Model tableModel = new TableModel();
        View bookingView = new BookingView();
        BookingPresenter presenter = new BookingPresenter(tableModel, bookingView);//Передаём в презентер компоненты
        // tableModel и bookingView тем самым проинициализировав приложение
        presenter.updateUIShowTables();
        bookingView.reservationTable(new Date(), 2, "Станислав");//резервируем столик (триггер бронирования)
        // далее по условием нашей схемы представление должно передать сигнал этого триггера на презентер


        bookingView.changeReservationTable(1001, new Date(), 2,"Станислав");

    }

}

