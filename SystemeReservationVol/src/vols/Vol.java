package vols;

import java.sql.Date;

public abstract  class Vol {
	protected String numeroVol;
	protected String aeroportDepart;
	protected String aeroportArrivee;
	protected String dateDepart;
	protected String dateArrivee;
	protected double prix;
	public Vol(String numeroVol, String aeroportDepart, String aeroportArrivee, String dateDepart, String dateArrivee) {
		super();
		this.numeroVol = numeroVol;
		this.aeroportDepart = aeroportDepart;
		this.aeroportArrivee = aeroportArrivee;
		this.dateDepart = dateDepart;
		this.dateArrivee = dateArrivee;
	}
	public abstract String afficherInformation();

}
