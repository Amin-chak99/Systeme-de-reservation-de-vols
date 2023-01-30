package client;

import Decorator.Annulation;
import Decorator.Billet;
import Decorator.PerteBagages;
import model.ReservationImpl;

public class testReservation {

	public static void main(String[] args) {
		ReservationImpl R1 = new Billet();
		System.out.println(R1.getDetails());
		System.out.println(R1.Price());
		R1 = new Annulation(R1);
		System.out.println(R1.getDetails());
		System.out.println(R1.Price());
		R1 = new PerteBagages(R1);
		System.out.println(R1.getDetails());
		System.out.println(R1.Price());
		



	}

}
