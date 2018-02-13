package ryanleyva37.engine;

import java.awt.Dimension;

import javax.swing.JFrame;

import ryanleyva37.game.LineTennis;
import ryanleyva37.game.Player;
import ryanleyva37.stepbuilder.PlayerBuilder;

public class EntryPoint {
	
	private static final int XLOCATION = 100;
	private static final int YLOCATION = 200;
	protected static final int WW = 500;
	protected static final int WH = 700;

	public static void main(String[] args) {
		
		Player playerDefense = 
				PlayerBuilder.newBuilder()
				.name("John")
				.defenseClass()
				.withSheild("Best-Sheild")
				.noAbilities().build();
		
		LineTennis.getLineTennis().addPlayer(playerDefense);
		
		
		
		JFrame jFrame = new JFrame();
		Canvas canvas = new Canvas();
		

		
		jFrame.setTitle("Calculator");
		jFrame.setLocation(XLOCATION,YLOCATION);
		jFrame.setPreferredSize(new Dimension(WW,WH));
		jFrame.setResizable(false);
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.add(canvas);
		jFrame.pack();
		jFrame.setVisible(true);

		
		

	}

}
