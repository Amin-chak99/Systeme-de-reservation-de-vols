package vols;

import java.sql.Date;

public abstract  class Vol {
	private String numeroVol;
    private String aeroportDepart;
    private String aeroportArrivee;
    private String dateDepart;
    private String dateArrivee;
    private double prix;
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
