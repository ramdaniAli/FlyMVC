package dogfight.model;

import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Sky implements IArea{

	private Dimension dimension ;
	private Image image ; 
	
	public Sky (Dimension dimension) throws IOException {
		
		this.dimension = dimension ; 
		this.image = ImageIO.read(new File("images/sky.png"));
		
	}

	public Dimension getDimension() {
		return this.dimension;
	}

	public Image getImage() {
		return this.image;
	}
	
	
}
