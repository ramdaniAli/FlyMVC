package dogfight.model;

public class Cloud extends Mobile{
	
	private static int SPEED = 1 ; 
	private static int WIDTH = 300 ; 
	private static int HEIGHT = 150 ; 
	
	private static String IMAGE = "cloud" ; 
	
	
	public Cloud (Direction direction, Dimension dimension, Position position)	{

		super(direction, position, new Dimension(WIDTH, HEIGHT), SPEED, IMAGE);
		
	}

}
