package dogfight.model;

public class Cloud extends Mobile{
	
	private int SPEED = 1 ; 
	private int WIDTH = 300 ; 
	private static int HEIGHT = 150 ; 
	
	private static String IMAGE = "cloud" ; 
	
	
	public Cloud (Direction direction, Dimension dimension)	{
		super(direction, null, dimension, HEIGHT, IMAGE); 
		
	}

}
