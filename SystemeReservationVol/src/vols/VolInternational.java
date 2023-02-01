package vols;

import java.sql.Date;

public class VolInternational extends Vol {

    
   
	   public VolInternational(String numeroVol, String aeroportDepart, String aeroportArrivee, String dateDepart,
			   String dateArrivee) {
		super(numeroVol, aeroportDepart, aeroportArrivee, dateDepart, dateArrivee);
		
		// TODO Auto-generated constructor stub
	}
	private String depart;
	    private String destination;
	    private String visa;
	    public void setDepart(String depart){
	      this.depart = depart;
	    }
	    public void setDestination(String destination){
	      this.destination = destination;
	    }
	    public void setVisa(String visa){
	      this.visa = visa;
	    }
	    public String getDepart(){
	      return this.depart;
	    }
	    public String getDestination(){
	      return this.destination;
	    }
	    public String getVisa(){
	      return this.visa;
	    }
		@Override
		public String afficherInformation() {
			   return ("Vol International\n"+
				         "numeroVol :"+numeroVol+"\n"+
				         "aeroportDepart :"+aeroportDepart+"\n"+
				        "aeroportArrivee :"+aeroportArrivee+"\n"+
				         "dateDepart :"+dateDepart+"\n"+
				       "dateArrivee :"+dateArrivee);

		}

}
