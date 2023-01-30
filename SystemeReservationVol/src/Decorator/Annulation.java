package Decorator;

import model.ReservationImpl;


public class Annulation extends OptionAssurance  {


	    public Annulation(ReservationImpl reservation) {
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
