package model;

import java.util.ArrayList;

import observer.ObservebaleCl;
import reservation.Reservation;

public class ReservationImpl implements Reservation {
    private double price;
    private String details;
    
    private ArrayList<ObservebaleCl> list = new ArrayList<ObservebaleCl>();
    public void setX (String details) {
    	this.details = details ;
    	notifier();
    }
    private void notifier() {
    	for(ObservebaleCl a : list) {
    		a.update(details);	
    	}
    }
    


   
	public double getPrice() {
		return price;
	}
	
	public double Price() {
        return price;
    }

    public String getDetails() {
        return details;
    }
}
