package ryanleyva37.game.enums;

public enum Team {
	
	  TOP("top"), BOTTOM("bottom");

	  private String team;

	  Team(String type) {
	    this.team = type;
	  }

	  @Override
	  public String toString() {
	    return team;
	  }
}
