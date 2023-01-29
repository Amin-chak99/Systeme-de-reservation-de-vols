package Decorator;

import reservation.Reservation;

public class ProblemVol  extends OptionAssurance {

	    public ProblemVol(Reservation reservation) {
	        super(reservation);
	
	    }
	    @Override
	    public double Price() {
	        return 300 + reservation.Price();
	    }
	    @Override
	    public String getDetails() {
	        return super.getDetails() + ", " + "Assurance Problem Vol";
	    }

}
