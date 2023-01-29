package Decorator;

import model.ReservationImpl;

public abstract class OptionAssurance extends ReservationImpl {
	
    protected ReservationImpl reservation;
    
    
    public OptionAssurance(ReservationImpl reservation  ){
        this.reservation = reservation;
    }
    public abstract double Price();
    public String getDetails() {
        return reservation.getDetails();
    }
}

	