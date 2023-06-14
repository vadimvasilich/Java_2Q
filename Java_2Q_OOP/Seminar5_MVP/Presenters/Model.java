package Seminar5_MVP.Presenters;

import Seminar5_MVP.Models.Table;

import java.util.Collection;
import java.util.Date;

public interface Model {
    Collection<Seminar5_MVP.Models.Table> loadTables();

    /**
     * Бронирование столика
     * @param reservationDate Дата бронирования
     * @param tableNo Номер столика
     * @param name Имя клиента
     */
    int reservationTable(Date reservationDate, int tableNo, String name);

    int changeReservationTable(int oldReservation, Date orderDate, int tableNo, String name);
}