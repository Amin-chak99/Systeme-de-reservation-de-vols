package fabriques;

import model.MoralPerson;
import model.Person;
import model.PhysicalPerson;
 public class PersonFactory {
	 
	  public static Person getPerson(String type, String name) {
	    if (type.equals("physique")) {
	      return new PhysicalPerson(name);
	    } else if (type.equals("morale")) {
	      return new MoralPerson(name);
	    } else {
	      return null;
	    }
	  }
	}
