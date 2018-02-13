package ryanleyva37.command;

import ryanleyva37.game.Player;

public abstract class Command {

	  public abstract void execute(Player player);

	  public abstract void undo();

	  public abstract void redo();

	  @Override
	  public abstract String toString();

}