package dogfight.gameframe;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.IOException;
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
	private final IEventPerformer eventPerformer;


	public GameFrame (String title, IEventPerformer performer, IGraphicsBuilder graphicBuilder, Observable observable) {
		
		
		this.eventPerformer = performer ; 
		
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

	@Override
	public void keyPressed(KeyEvent KeyEvent) {
		// TODO Auto-generated method stub
		
	}
	public void keyTyped(KeyEvent keyEvent) {
		try {
			this.eventPerformer.eventPerform(keyEvent);
		} catch (final IOException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.exit(-1);
		}
	}


}
