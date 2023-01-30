package model;

import observer.ObservebaleCl;

public class Client implements ObservebaleCl {

	@Override
	public void update(String details) {
		System.out.println("je suis:"+details);

		
		// TODO Auto-generated method stub
		
	}

}
