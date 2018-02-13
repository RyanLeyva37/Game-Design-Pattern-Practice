package ryanleyva37.game;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import ryanleyva37.game.enums.Team;

public class Player {
	
	private String name;
	private Team team;
	private List<String> abilities = new ArrayList<>();
	private int posX;
	private int posY;
	private int size;
	

	public Player(String name) {
		this.name = name;
		size = 50;
		posX = 25;
		posY = 50;
	}
	
	
	
	
	public void onPlayerAbilityUpdate() {
		posX++;
	}
	
	public void onPlayerRender(Graphics g) {
		int renderStartPointX = posX - (size/2);
		g.drawString(getName(), renderStartPointX, posY-5);
		g.fillRect(renderStartPointX, posY, size, 3);
	}
	


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Team getTeamType() {
		return team;
	}


	public void setTeam(Team team) {
		this.team = team;
		this.posY = team.getPosY();
	}

	public List<String> getAbilities() {
		return abilities;
	}


	public void setAbilities(List<String> abilities) {
		this.abilities = abilities;
	}


	public int getPosX() {
		return posX;
	}


	public void setPosX(int posX) {
		this.posX = posX;
	}

	
	

	

	

}
