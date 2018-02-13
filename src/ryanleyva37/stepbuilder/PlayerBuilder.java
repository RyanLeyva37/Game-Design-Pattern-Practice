package ryanleyva37.stepbuilder;

import java.util.ArrayList;
import java.util.List;

import ryanleyva37.game.Player;
import ryanleyva37.game.enums.Team;

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
		AbilityStep topTeam();

		AbilityStep bottomTeam();
	}



	public interface AbilityStep {
		AbilityStep withAbility(String ability);

		BuildStep noMoreAbilities();

		BuildStep noAbilities();
	}

	public interface BuildStep {
		Player build();
	}

	private static class CharacterSteps implements NameStep, ClassStep,  AbilityStep, BuildStep {

		private String name;
		private Team team;
		private List<String> abilities = new ArrayList<>();

		@Override
		public ClassStep name(String name) {
			this.name = name;
			return this;
		}
		
		@Override
		public AbilityStep topTeam() {
			this.team = Team.TOP;
			return this;
		}

		@Override
		public AbilityStep bottomTeam() {
			this.team = Team.BOTTOM;
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

			if (team != null) {
				player.setTeam(team);
			}

			if (!abilities.isEmpty()) {
				player.setAbilities(abilities);
			}

			return player;
		}

	}
}