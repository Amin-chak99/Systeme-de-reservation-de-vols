package vols;

public class VolNational extends Vol {
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
		public void afficherInformation() {
	        System.out.println( "Vol National");			

		}
	}


