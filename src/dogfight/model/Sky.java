package dogfight.model;

import java.awt.Image;

public class Sky implements IArea{

	private Dimension dimension ;
	private Image image ; 
	
	public Sky (Dimension dimension) {
		
	}

	public Dimension getDimension() {
		return dimension;
	}

	public Image getImage() {
		return image;
	}
	
	
}
