package model;

import reservation.Reservation;

public class ReservationImpl implements Reservation {
    private double price;
    private String details;


    public double Price() {
        return price;
    }

    public String getDetails() {
        return details;
    }
}
