package dogfight.gameframe;

import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.util.Observable;
import java.util.Observer;

import javax.swing.JPanel;

public class GamePanel extends JPanel implements Observer  {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = -5640156723062425792L;
	private IGraphicsBuilder graphicBuilder;
	private ImageObserver observer;

	public GamePanel(IGraphicsBuilder graphicBuilder) {
		this.graphicBuilder = graphicBuilder ; 
	}
	
	@Override
	public void update(Observable arg0, Object arg1) {
		// TODO Auto-generated method stub
		this.repaint();
		
	}
	
	public void paintComponent(Graphics graphics)	{
		this.graphicBuilder.applyModelToGraphics(graphics, observer);
		
	}
	
	

}
