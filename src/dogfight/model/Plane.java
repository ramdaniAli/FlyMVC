package dogfight.model;

import java.io.IOException;

public class Plane extends Mobile {

	private int SPEED = 2 ; 
	private int WIDTH = 100 ; 
	private int HEIGHT = 30 ; 
	
	private int player ; 
	
	public Plane (final Direction diretion,final Position position, final Dimension dimension,final int speed,final String image, final int player) throws IOException {
		super(diretion, position, dimension, speed, image);
		this.player=player;
	}
	
	public boolean isPlayer (final int player) {
		return this.player == player;
		
	}
	
	public boolean hit ()	{
		this.getDogfightModel().removeMobile(this);
		return true ; 
	}
	
	
}
