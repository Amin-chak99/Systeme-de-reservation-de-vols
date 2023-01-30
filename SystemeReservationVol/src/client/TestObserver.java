package client;

import Decorator.PerteBagages;
import fabriques.FactoryVol;
import model.Client;
import model.Passager;
import model.ReservationImpl;
import vols.Vol;

public class TestObserver {

	public static void main(String[] args) {
		ReservationImpl r1 = new ReservationImpl();
		 FactoryVol factoryVols = new FactoryVol();

	        Vol volNational = factoryVols.getVols("NATIONAUX");
		Client cl = new Client("hedi"); 
		Passager pa= new Passager();
		r1=new PerteBagages(r1);
		
		
	
		cl.update(r1.getDetails(volNational));
		pa.update(r1.getDetails(volNational));
		
		
		

	}


}
