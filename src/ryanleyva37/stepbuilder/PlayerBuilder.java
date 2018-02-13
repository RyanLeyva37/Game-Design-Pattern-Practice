package ryanleyva37.stepbuilder;

import java.util.ArrayList;
import java.util.List;

/**
 * The Step Builder class.
 */
public final class PlayerBuilder {

	PlayerBuilder() {
	}

	public static NameStep newBuilder() {
		return new CharacterSteps();
	}

	public interface NameStep {
		ClassStep name(String name);
	}

	public interface ClassStep {
		SheildStep defenseClass(String defenseClass);

		WeaponStep offenseClass(String offenseClass);
	}

	public interface SheildStep {
		AbilityStep withSheild(String shield);

		BuildStep noSheild();
	}

	public interface WeaponStep {
		AbilityStep withSword(String sword);

		AbilityStep withGun(String gun);

		AbilityStep withLazer(String lazer);

		BuildStep noWeapon();
	}

	public interface AbilityStep {
		AbilityStep withAbility(String ability);

		BuildStep noMoreAbilities();

		BuildStep noAbilities();
	}

	public interface BuildStep {
		Player build();
	}

	private static class CharacterSteps implements NameStep, ClassStep, SheildStep, WeaponStep, AbilityStep, BuildStep {
		
		private final int WEAPON_SWORD = 0;
		private final int WEAPON_GUN = 1;
		private final int WEAPON_LAZER = 2;


		private String name;
		private String defenseClass;
		private String offenseClass;
		private int weaponType;
		private String sheild;
		private String weapon;
		private List<String> abilities = new ArrayList<>();

		@Override
		public ClassStep name(String name) {
			this.name = name;
			return this;
		}

		
		
		
		@Override
		public SheildStep defenseClass(String defenseClass) {
			this.defenseClass = defenseClass;
			return this;
		}

		@Override
		public WeaponStep offenseClass(String wizardClass) {
			this.offenseClass = wizardClass;
			return this;
		}

		
		
		
		@Override
		public AbilityStep withSheild(String sheild) {
			this.sheild = sheild;
			return this;
		}
		
		@Override
		public BuildStep noSheild() {
			// TODO Auto-generated method stub
			return this;
		}


		

		@Override
		public AbilityStep withSword(String weapon) {
			this.weaponType = WEAPON_SWORD;
			this.weapon = weapon;
			return this;
		}
		
		@Override
		public AbilityStep withGun(String weapon) {
			this.weaponType = WEAPON_GUN;
			this.weapon = weapon;
			return this;
		}

		@Override
		public AbilityStep withLazer(String spell) {
			// TODO Auto-generated method stub
			return null;
		}
		
		@Override
		public BuildStep noWeapon() {
			return this;
		}

		

		@Override
		public AbilityStep withAbility(String ability) {
			this.abilities.add(ability);
			return this;
		}

		@Override
		public BuildStep noMoreAbilities() {
			return this;
		}

		@Override
		public BuildStep noAbilities() {
			return this;
		}

		@Override
		public Player build() {
			Player player = new Player(name);

			if (defenseClass != null) {
				player.setDefenseClass(defenseClass);;
			} else {
				player.setOffenseClass(offenseClass);
			}

			if (weapon != null) {
				player.setWeapon(weapon);
				player.setWeaponType(weaponType);
			} else {
				player.setSheild(sheild);;
			}

			if (!abilities.isEmpty()) {
				player.setAbilities(abilities);
			}

			return player;
		}




	}
}