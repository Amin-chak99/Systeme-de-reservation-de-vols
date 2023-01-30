package vols;

import java.sql.Date;

public class VolNational extends Vol {
	private String numeroVol;
    private String aeroportDepart;
    private String aeroportArrivee;
    private String dateDepart;
    private String dateArrivee;
	  public VolNational(String numeroVol, String aeroportDepart, String aeroportArrivee, String dateDepart,
			  String dateArrivee) {
		super(numeroVol, aeroportDepart, aeroportArrivee, dateDepart, dateArrivee);
		this.numeroVol=numeroVol;
		this.aeroportDepart=aeroportDepart;
		this.aeroportArrivee=aeroportArrivee;
		this.dateDepart=dateDepart;
		this.dateArrivee=dateArrivee;
		// TODO Auto-generated constructor stub
	}
	private String depart;
	    private String destination;
	    public void setDepart(String depart){
	      this.depart = depart;
	    }
	    public void setDestination(String destination){
	      this.destination = destination;
	    }
	    public String getDepart(){
	      return this.depart;
	    }
	    public String getDestination(){
	      return this.destination;
	    }
		@Override
		public String afficherInformation() {
	        return ("Vol National\n"+
	         "numeroVol :"+numeroVol+"\n"+
	         "aeroportDepart :"+aeroportDepart+"\n"+
	        "aeroportArrivee :"+aeroportArrivee+"\n"+
	         "dateDepart :"+dateDepart+"\n"+
	       "dateArrivee :"+dateArrivee);

		}
	}


