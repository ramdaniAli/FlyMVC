package dogfight.view;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Transparency;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

import dogfight.gameframe.IGraphicsBuilder;
import dogfight.model.IDogfightModel;
import dogfight.model.IMobile;

public class GraphicsBuilder implements IGraphicsBuilder{
	
	private IDogfightModel dogfihgtModel; 
	private BufferedImage emptySky ; 
	
	public GraphicsBuilder (IDogfightModel dogfihgtModel)	{
		this.dogfihgtModel = dogfihgtModel ; 
		this.buildEmptySky();
	}

	@Override
	public void applyModelToGraphics(Graphics graphics, ImageObserver observer) {
		// TODO Auto-generated method stub
		graphics.drawImage(this.emptySky, 0, 0, observer);
		for (IMobile mobile : this.dogfihgtModel.getMobiles()) {
			this.drawMobile(mobile, graphics, observer);
		}
	}
	
	public void buildEmptySky() {
		this.emptySky = new BufferedImage(this.dogfihgtModel.getArea().getDimension().getWidth(), 
				this.dogfihgtModel.getArea().getDimension().getHeight(), BufferedImage.TYPE_INT_BGR);
		
		final Graphics2D graphics =(Graphics2D) this.emptySky.getGraphics()	;
		
		graphics.drawImage(this.dogfihgtModel.getArea().getImage(),0,0,this.dogfihgtModel.getArea().getDimension().getWidth(), 
				this.dogfihgtModel.getArea().getDimension().getHeight(), null);
		
	}
	
	public void drawMobile(final IMobile mobile, final Graphics graphics,final  ImageObserver observer)	{
		final BufferedImage imageMobile = new BufferedImage(mobile.getWidth(), mobile.getHeight(),Transparency.TRANSLUCENT);
		final Graphics graphicsMobile = imageMobile.getGraphics()	;
		graphicsMobile.drawImage(mobile.getImage(), 0, 0, mobile.getWidth(), mobile.getHeight(), observer) ; 
		graphics.drawImage(imageMobile, (int) mobile.getPosition().getX(), (int) mobile.getPosition().getY(),observer);
		final boolean isHorizontalOut = (mobile.getPosition().getX() + mobile.getWidth()) > this.dogfihgtModel.getArea().getDimension().getWidth()	;
		final boolean isVerticalOut =(mobile.getPosition().getY() + mobile.getHeight()) > this.dogfihgtModel.getArea().getDimension().getHeight()	; 
		
		if (isHorizontalOut) {
			final BufferedImage imageMobileH = imageMobile.getSubimage(
					(int) this.dogfihgtModel.getArea().getDimension().getWidth() - (int) mobile.getPosition().getX(), 0,
					(int) (mobile.getWidth() - (int) this.dogfihgtModel.getArea().getDimension().getWidth()) + (int) mobile.getPosition().getX(),
					mobile.getHeight());
			graphics.drawImage(imageMobileH, 0, (int) mobile.getPosition().getY(), observer);
		}
		
		if (isVerticalOut) {
			final BufferedImage imageMobileV = imageMobile.getSubimage(0,
					(int) this.dogfihgtModel.getArea().getDimension().getHeight() - (int) mobile.getPosition().getY(), mobile.getWidth(),
					(int) ((mobile.getHeight() - this.dogfihgtModel.getArea().getDimension().getHeight()) + mobile.getPosition().getY()));
			graphics.drawImage(imageMobileV, (int) mobile.getPosition().getX(), 0, observer);
		}
		
		if (isHorizontalOut && isVerticalOut) {
			final BufferedImage imageMobileHV = imageMobile.getSubimage(
					(int) this.dogfihgtModel.getArea().getDimension().getWidth() - (int) mobile.getPosition().getX(),
					(int) this.dogfihgtModel.getArea().getDimension().getHeight() - (int) mobile.getPosition().getY(),
					(int) (mobile.getWidth() - this.dogfihgtModel.getArea().getDimension().getWidth()) + (int) mobile.getPosition().getX(),
					(int) (mobile.getHeight() - this.dogfihgtModel.getArea().getDimension().getHeight()) + (int) mobile.getPosition().getY());
			graphics.drawImage(imageMobileHV, 0, 0, observer);
		}
		
	}

	@Override
	public int getGlobalWidth() {
		// TODO Auto-generated method stub
		return this.dogfihgtModel.getArea().getDimension().getWidth();
	}

	@Override
	public int getGlobalHeight() {
		// TODO Auto-generated method stub
		return this.dogfihgtModel.getArea().getDimension().getHeight()	;
	}

}
