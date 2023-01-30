package client;

import Decorator.Annulation;
import Decorator.Billet;
import Decorator.PerteBagages;
import Decorator.ProblemVol;
import fabriques.FactoryVol;
import model.Client;
import model.Passager;
import model.ReservationImpl;
import vols.Vol;

public class TestObserver {

	public static void main(String[] args) {
		ReservationImpl r1 = new ReservationImpl();
		 FactoryVol factoryVols = new FactoryVol();
		 ReservationImpl ri1= new Billet();
		 ReservationImpl ri2= new Billet();
		

	        Vol volNational = factoryVols.getVols("NATIONAUX");
	        Vol volInternational = factoryVols.getVols("INTERNATIONAUX");

		Client cl = new Client("hedi"); 
		Passager pa= new Passager("amin");
		r1=new PerteBagages(r1);
			ri1 = new Annulation(ri1);
			ri2 = new Annulation(ri2);
			ri2=new PerteBagages(ri2);
			ri2=new ProblemVol(ri2);
		cl.update(r1.getDetails(volNational));
		System.out.println("Price Billet ="+ri1.Price()+ " DT TTC ");
		System.out.println("Details Price :"+ri1.getDetailss());
		System.out.println("***********************************");
		pa.update(r1.getDetails(volInternational));
		System.out.println("Price Billet ="+ri2.Price()+ "DT TTC ");
		System.out.println("Details Price :"+ri2.getDetailss());
	}

}
