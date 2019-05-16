package dogfight.model;

public class Position {

	private double x ; 
	private double y ; 
	private double  maxX =1 ; 
	private double maxY=1 ; 
	
	
	public Position (final double x, final double y, final double maxX, final double maxY) {
		this.x = x ; 
		this.y = y ; 
		this.maxX= maxX ; 
		this.maxY = maxY ;
		
	}
	
	public Position (Position position)	{
		
	}

	public double getX() {
		return this.x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return this.y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public void setMaxX(double maxX) {
		this.maxX = maxX;
	}

	public void setMaxY(double maxY) {
		this.maxY = maxY;
	}
	
}
