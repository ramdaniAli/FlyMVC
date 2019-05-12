package dogfight.view;

import java.awt.event.KeyEvent;

import dogfight.controller.IOrderPerformer;
import dogfight.controller.UserOrder;
import dogfight.gameframe.IEventPerformer;

public class EventPerformer implements IEventPerformer{
	
	protected UserOrder userOrder ; 
	
	public EventPerformer(IOrderPerformer orderPerformer)	{
		
	}
	
	public void eventPerform(KeyEvent keyCode)	{
		
	}
	
	public UserOrder KeyCodeToUserOrder(int keyCode)	{
		return userOrder;
		
	}

}
