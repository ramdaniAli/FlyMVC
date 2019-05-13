package dogfight.gameframe;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observable;

import javax.swing.JFrame;

import dogfight.model.IDogfightModel;
import dogfight.view.GraphicsBuilder;

public class GameFrame extends JFrame implements KeyListener{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1343450448208426723L;
	private IDogfightModel dogfightModel;


	public GameFrame (String title, IEventPerformer performer, IGraphicsBuilder graphicBuilder, Observable observable) {
		this.setTitle(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		final GamePanel gamepanel = new GamePanel(new GraphicsBuilder(dogfightModel)); 
		this.setContentPane(gamepanel);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}

	
	public void keyReleased(KeyEvent keyEvent) {
		
	}
	
	public void keyTyped(KeyEvent keyEvent) {
		
	}

	@Override
	public void keyPressed(KeyEvent KeyEvent) {
		// TODO Auto-generated method stub
		
	}

}
