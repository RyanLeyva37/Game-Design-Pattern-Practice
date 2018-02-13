package ryanleyva37.game.enums;

public enum Team {
	
	  TOP("top", 50), BOTTOM("bottom", 450);

	  private String team;
	  private int posY;

	  Team(String type, int posY) {
	    this.team = type;
	    this.posY = posY;
	    
	  }
	  
	  public int getPosY() {
		return posY;
	}

	  @Override
	  public String toString() {
	    return team;
	  }
}
