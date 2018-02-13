package ryanleyva37.stepbuilder;

import java.util.ArrayList;
import java.util.List;

import ryanleyva37.game.Player;
import ryanleyva37.game.enums.ClassType;

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
		SheildStep defenseClass();

		WeaponStep offenseClass();
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
		private ClassType classType;
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
		public SheildStep defenseClass() {
			this.classType = ClassType.DEFENSE;
			return this;
		}

		@Override
		public WeaponStep offenseClass() {
			this.classType = ClassType.OFFENSE;
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

			if (classType != null) {
				player.setDefenseClass(classType);;
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