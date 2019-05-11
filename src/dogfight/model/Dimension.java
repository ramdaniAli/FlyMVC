package dogfight.model;

public class Dimension {
	
	private int width ; 
	private int height ; 
	
	public Dimension (int width, int height)	{
		
	}
	
	public Dimension(Dimension dimension) {
		this.width=dimension.width;
		this.height=dimension.height ; 
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	

}
