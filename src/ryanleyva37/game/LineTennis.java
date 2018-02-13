package ryanleyva37.game;

import java.awt.Graphics;
import java.awt.List;
import java.util.ArrayList;

public class LineTennis {
	
	private static LineTennis lineTennis= new LineTennis();
	
	ArrayList<Player> players;
	
	public LineTennis() {
		players = new ArrayList<Player>();
	}
	
	public void addPlayer(Player p) {
		players.add(p);
	}
	
	public void playerMovementUpdate() {
		for(Player player: players) {
			player.onPlayerAbilityUpdate();
		}
	}
	
	public void playerRenderUpdate(Graphics g) {
		for(Player player : players)
		{
			player.onPlayerRender(g);
		}
	}
	
	public static LineTennis getLineTennis() {
		return lineTennis;
	}

}
