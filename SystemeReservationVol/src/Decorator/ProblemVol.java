package Decorator;

import model.ReservationImpl;


public class ProblemVol  extends OptionAssurance {

	    public ProblemVol(ReservationImpl reservation) {
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
