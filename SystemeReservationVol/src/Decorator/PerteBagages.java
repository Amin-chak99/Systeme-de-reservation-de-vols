package Decorator;

import reservation.Reservation;

public class PerteBagages  extends OptionAssurance {

	    public PerteBagages(Reservation reservation) {
	        super(reservation);
	       
	    }
	    @Override
	    public double Price() {
	        return 250 + reservation.Price();
	    }
	    @Override
	    public String getDetails() {
	        return super.getDetails() + ", " + "Assurance Perte Bagages ";
	    }
}
