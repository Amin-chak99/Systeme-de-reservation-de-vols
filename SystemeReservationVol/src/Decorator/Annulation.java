package Decorator;

import reservation.Reservation;

public class Annulation extends OptionAssurance  {


	    public Annulation(Reservation reservation) {
	        super(reservation);
	      
	    }
	    @Override
	    public double Price() {
	        return 200 + reservation.Price();
	    }
	    @Override
	    public String getDetails() {
	        return super.getDetails() + ", " + "Assurance d'Annulation";
	    }

}
