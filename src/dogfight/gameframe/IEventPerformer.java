package dogfight.gameframe;

import java.awt.event.KeyEvent;
import java.io.IOException;

public interface IEventPerformer {
	
	public void eventPerform(KeyEvent keyCode) throws IOException;

}
