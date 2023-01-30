package model;

import observer.ObservebaleCl;

public class Passager implements ObservebaleCl {
	private String nom;

	public Passager(String nom) {
		super();
		this.nom = nom;
	}

	@Override
	public void update(String details) {
		System.out.println(nom +":"+details);

		
		// TODO Auto-generated method stub
		
	}
	public ReservationImpl Reserver() {
		return new ReservationImpl();
		
	}

}
