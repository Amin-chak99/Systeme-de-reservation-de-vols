package vols;

import java.sql.Date;

public abstract  class Vol {
	private String numeroVol;
    private String aeroportDepart;
    private String aeroportArrivee;
    private Date dateDepart;
    private Date dateArrivee;
    private double prix;
	public abstract void afficherInformation();

}
