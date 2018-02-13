package ryanleyva37.game.enums;

public enum ClassType {
	
	  DEFENSE("defense"), OFFENSE("offense");

	  private String type;

	  ClassType(String type) {
	    this.type = type;
	  }

	  @Override
	  public String toString() {
	    return type;
	  }
}
