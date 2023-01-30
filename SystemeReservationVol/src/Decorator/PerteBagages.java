package Decorator;

import model.ReservationImpl;

public class PerteBagages  extends OptionAssurance {

	    public PerteBagages(ReservationImpl reservation) {
	        super(reservation);
	       
	    }
	    @Override
	    public double Price() {
	        return 250 + reservation.Price();
	    }
	    @Override
	    public String getDetailss() {
	        return super.getDetailss()  + " Assurance Perte Bagages ,";
	    }
}
