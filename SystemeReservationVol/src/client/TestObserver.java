package client;

import model.Client;
import model.Passager;

public class TestObserver {

	public static void main(String[] args) {
		Client cl = new Client(); 
		Passager pa= new Passager();
		
	
		cl.update("client");
		pa.update("passager");
		
		

	}


}
