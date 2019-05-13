package dogfight.view;

import java.awt.Graphics;
import java.awt.image.ImageObserver;

import dogfight.gameframe.IGraphicsBuilder;
import dogfight.model.IDogfightModel;
import dogfight.model.IMobile;

public class GraphicsBuilder implements IGraphicsBuilder{
	
	private IDogfightModel dogfihgtModel; 
	
	public GraphicsBuilder (IDogfightModel dogfihgtModel)	{
		this.dogfihgtModel = dogfihgtModel ; 
	}

	@Override
	public void applyModelToGraphics(Graphics graphics, ImageObserver observer) {
		// TODO Auto-generated method stub
		graphics.drawString("IdOnt Know", 80, 80);
	}
	
	public void buildEmptySky() {
		
	}
	
	public void drawMobile(IMobile mobile, Graphics graphics, ImageObserver observer)	{
		
	}

	@Override
	public int getGlobalWidth() {
		// TODO Auto-generated method stub
		return 1;
	}

	@Override
	public int getGlobalHeight() {
		// TODO Auto-generated method stub
		return 1;
	}

}
