package client;

import fabriques.PersonFactory;
import model.Person;

public class PersonTest {
	  public static void main(String[] args) {
	    Person p1 = PersonFactory.getPerson("physique", "John Doe");
	    Person p2 = PersonFactory.getPerson("morale", "Acme Inc");

	    System.out.println("Person 1: " + p1.getName() + " (" + p1.getType() + ")");
	    System.out.println("Person 2: " + p2.getName() + " (" + p2.getType() + ")");
	  }
	}