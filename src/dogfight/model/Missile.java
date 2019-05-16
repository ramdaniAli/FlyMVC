package dogfight.model;

import java.io.IOException;

public class Missile extends Mobile{
	
	private static int SPEED = 4 ; 
	private static int WIDTH = 30 ;
	private static int HEIGHT = 10 ; 
	
	private static  int MAX_DISTANCE_TRAVELED = 1400 ; 
	private static String IMAGE = "missile" ; 
	private int distanceTraveled = 0 ;
	
	
	public Missile (Direction diretion,Position position, Dimension dimension,int speed, String image) throws IOException {
		super(diretion, position, new Dimension (HEIGHT, WIDTH), SPEED, IMAGE)	;
	}
	
	public int getWidhtWithADirection (Direction direction)	{
		switch( direction ) {
		case UP :
		case DOWN :
			return HEIGHT ;
			
		case LEFT :
		case RIGHT :
		default :
			return WIDTH ;
		}
	}
	
	public int getHeightWithADirection(Direction direction ) {
		
		switch(direction) {
		case UP :
		case DOWN :
			return WIDTH ;
		
		case LEFT :
		case RIGHT :
		default :
			return HEIGHT ;
		}

	}
	
	public void move()	{
		
		this.distanceTraveled = +SPEED ;
		if(this.distanceTraveled >= MAX_DISTANCE_TRAVELED ) {
			this.getDogfightModel().removeMobile(this);
		}
		
	}
	
	public boolean isWeapon () {
		return true;
		
	}

}
