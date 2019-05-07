package dogfight.model;

public class Missile extends Mobile{
	
	private int SPEED = 4 ; 
	private int WIDTH = 30 ;
	private int HEIGHT = 10 ; 
	
	private int MAX_DISTANCE_TRAVELED = 1400 ; 
	private String IMAGE = "missile" ; 
	private int distanceTraveled = 0 ;
	
	
	public Missile (Direction diretion,Position position, Dimension dimension,int speed, String image) {
		super(diretion, position, dimension, speed, image)	;
	}
	
	public int getWidhtWithADirection (Direction direction)	{
		return this.WIDTH ; 
	}
	
	public int getHeightWithADirection(Direction direction ) {
		return this.HEIGHT ; 
	}
	
	public void move()	{
		
	}
	
	public boolean isWeapon () {
		return false;
		
	}

}
