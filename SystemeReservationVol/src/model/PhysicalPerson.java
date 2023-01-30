package model;

public class PhysicalPerson implements Person {
	  private String name;

	  public PhysicalPerson(String name) {
	    this.name = name;
	  }

	  @Override
	  public String getName() {
	    return this.name;
	  }

	  @Override
	  public String getType() {
	    return "physique";
	  }
	}