package model;

 public class MoralPerson implements Person {
	  private String name;

	  public MoralPerson(String name) {
	    this.name = name;
	  }

	  @Override
	  public String getName() {
	    return this.name;
	  }

	  @Override
	  public String getType() {
	    return "morale";
	  }
	}
