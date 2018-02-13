package ryanleyva37.engine;

import ryanleyva37.game.LineTennis;

public class Clock implements Runnable {
	
	Canvas canvas;
	LineTennis lineTennis;
	
	public Clock(Canvas canvas) {
		this.canvas = canvas;
		lineTennis = LineTennis.getLineTennis();
	}

	@Override
	public void run() {
		
		while(true) {
			lineTennis.playerMovementUpdate();
			canvas.repaint();
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
