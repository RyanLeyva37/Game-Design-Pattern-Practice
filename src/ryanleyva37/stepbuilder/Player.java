package ryanleyva37.stepbuilder;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	private String name;
	private String defenseClass;
	private String offenseClass;
	private int weaponType;
	private String sheild;
	private String weapon;
	private List<String> abilities = new ArrayList<>();
	

	public Player(String name) {
		this.name = name;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDefenseClass() {
		return defenseClass;
	}


	public void setDefenseClass(String defenseClass) {
		this.defenseClass = defenseClass;
	}


	public String getOffenseClass() {
		return offenseClass;
	}


	public void setOffenseClass(String wizardClass) {
		this.offenseClass = wizardClass;
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


	

	

}
