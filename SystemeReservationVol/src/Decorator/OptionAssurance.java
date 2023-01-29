package Decorator;

import reservation.Reservation;

public abstract class OptionAssurance implements Reservation {
    protected Reservation reservation;
    public OptionAssurance(Reservation reservation){
        this.reservation = reservation;
    }
    public abstract double Price();
    public String getDetails() {
        return reservation.getDetails();
    }
}

	