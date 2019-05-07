package dogfight.model;

public class Plane extends Mobile {

	private int SPEED = 2 ; 
	private int WIDTH = 100 ; 
	private int HEIGHT = 30 ; 
	
	private int player ; 
	
	public Plane (Direction diretion,Position position, Dimension dimension,int speed, String image) {
		super(diretion, position, dimension, speed, image);
	}
	
	public boolean isPlayer (int player) {
		return false;
		
	}
	
	public boolean hit ()	{
		return false;
	}
	
	
}
