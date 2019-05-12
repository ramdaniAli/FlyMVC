package dogfight.view;

import java.awt.Graphics;
import java.awt.image.ImageObserver;

import dogfight.gameframe.IGraphicsBuilder;
import dogfight.model.IDogfightModel;
import dogfight.model.IMobile;

public class GraphicsBuilder implements IGraphicsBuilder{
	
	public GraphicsBuilder (IDogfightModel dogfihgtModel)	{
		
	}

	@Override
	public void applyModelToGraphics(Graphics graphics, ImageObserver observer) {
		// TODO Auto-generated method stub
		
	}
	
	public void buildEmptySky() {
		
	}
	
	public void drawMobile(IMobile mobile, Graphics graphics, ImageObserver observer)	{
		
	}

	@Override
	public int getGlobalWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getGlobalHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

}
