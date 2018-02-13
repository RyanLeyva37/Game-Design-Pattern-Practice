package ryanleyva37.stepbuilder;

public class EntryPoint {

	public static void main(String[] args) {
		
		Player playerDefense = 
				PlayerBuilder.newBuilder()
				.name		 ("John")
				.defenseClass("Ultra-Defensive")
				.withSheild	 ("Best-Sheild")
				.noAbilities().build();
		
		Player playerOffense = 
				PlayerBuilder.newBuilder()
				.name		 ("Ryan")
				.offenseClass("Master")
				.withSword	 ("Diamond Sword")
				.withAbility ("Dash")
				.noMoreAbilities().build();

	}

}
