package model;

import java.util.ArrayList;

import observer.ObservebaleCl;
import reservation.Reservation;
import vols.Vol;

public class ReservationImpl implements Reservation {
    private double price;
    private String details;
    public Vol vol;
    
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

   
	@Override
	public String getDetails(Vol vol) {
		// TODO Auto-generated method stub
		return vol.afficherInformation();
	}
	public String getDetailss() {
		// TODO Auto-generated method stub
		return "Billet : ";
	}
}
