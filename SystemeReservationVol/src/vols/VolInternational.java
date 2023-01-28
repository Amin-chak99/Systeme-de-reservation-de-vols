package vols;

public class VolInternational extends Vol {
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
		public void afficherInformation() {
        System.out.println( "Vol International");			
		}

}
