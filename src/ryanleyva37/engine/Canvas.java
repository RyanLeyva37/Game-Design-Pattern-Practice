package ryanleyva37.engine;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import ryanleyva37.game.LineTennis;
import ryanleyva37.game.Player;
import ryanleyva37.stepbuilder.PlayerBuilder;

public class Canvas extends Applet {
	
	LineTennis lineTennis = LineTennis.getLineTennis();
    Graphics bufferGraphics; 
    Image offscreen; 
    Dimension dim; 
	
	public void init() {
		this.setSize(500, 500);
        dim = getSize();
        offscreen = createImage(dim.width,dim.height); 
        bufferGraphics = offscreen.getGraphics();
        initGame();
        startGame();
	}
	
	private void initGame() {
		Player playerDefense = 
				PlayerBuilder.newBuilder()
				.name("John")
				.topTeam()
				.noAbilities().build();
		
		LineTennis.getLineTennis().addPlayer(playerDefense);
	}
	
	private void startGame() {
		Clock clock = new Clock(this);
		Thread t = new Thread(clock);
		t.start();
	}

	public void paint(Graphics graphics) {
	        bufferGraphics.clearRect(0,0,dim.width,dim.width); 
	        bufferGraphics.setColor(Color.red); 
			lineTennis.playerRenderUpdate(bufferGraphics);
	        graphics.drawImage(offscreen,0,0,this); 
	}
	
    public void update(Graphics g) 
    { 
         paint(g); 
    } 

}
