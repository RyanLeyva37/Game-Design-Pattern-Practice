package ryanleyva37.game;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;

import ryanleyva37.game.enums.ClassType;

public class Player {
	
	private String name;
	private ClassType classType;
	private int weaponType;
	private String sheild;
	private String weapon;
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

		g.fillRect(renderStartPointX, posY, size, 3);
	}
	


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public ClassType getClassType() {
		return classType;
	}


	public void setDefenseClass(ClassType defenseClass) {
		this.classType = defenseClass;
	}

	public void setOffenseClass(ClassType wizardClass) {
		this.classType = wizardClass;
	}


	public int getWeaponType() {
		return weaponType;
	}


	public void setWeaponType(int weaponType) {
		this.weaponType = weaponType;
	}


	public String getSheild() {
		return sheild;
	}


	public void setSheild(String sheild) {
		this.sheild = sheild;
	}


	public String getWeapon() {
		return weapon;
	}


	public void setWeapon(String weapon) {
		this.weapon = weapon;
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