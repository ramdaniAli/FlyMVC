package dogfight.view;

import java.awt.event.KeyEvent;
import java.io.IOException;

import dogfight.controller.IOrderPerformer;
import dogfight.controller.Order;
import dogfight.controller.UserOrder;
import dogfight.gameframe.IEventPerformer;

public class EventPerformer implements IEventPerformer{
	
	protected UserOrder userOrder ; 
	private IOrderPerformer orderPerformer ; 
	
	public EventPerformer(IOrderPerformer orderPerformer)	{
		
	}
	
	public void eventPerform(KeyEvent keyCode) throws IOException	{
		if (keyCode != null) {
			this.getOrderPerformer().orderPerform(this.KeyCodeToUserOrder(keyCode.getKeyCode()));
		}
		
	}
	
	public UserOrder KeyCodeToUserOrder(int keyCode)	{
		UserOrder userOrder ; 
		
		switch(keyCode) {
		case KeyEvent.VK_RIGHT :
			userOrder = new UserOrder(1, Order.RIGHT);
			break ;
		case KeyEvent.VK_LEFT:
			userOrder = new UserOrder(1,Order.LEFT) ; 
			break ; 
		case KeyEvent.VK_UP:
			userOrder = new UserOrder(1, Order.UP); 
			break ; 
		case KeyEvent.VK_DOWN:
			userOrder = new UserOrder(1,Order.DOWN);
			break ; 
		case KeyEvent.VK_SPACE:
			userOrder = new UserOrder(1,Order.SHOOT);
			break ; 
		case KeyEvent.VK_Z: 
			userOrder = new UserOrder(0,Order.UP);
			break;
		case KeyEvent.VK_S:
			userOrder = new UserOrder(0,Order.DOWN);
			break ; 
		case KeyEvent.VK_D:
			userOrder = new UserOrder(0,Order.RIGHT);
			break ; 
		case KeyEvent.VK_Q:
			userOrder = new UserOrder(0,Order.LEFT);
			break;
		case KeyEvent.VK_F:
			userOrder = new UserOrder(0,Order.SHOOT);
			break;
		default: 
			userOrder = new UserOrder(0,Order.NOP);
			break ; 
		}
		
		return userOrder ; 
	}

	/**
	 * @return the orderPerformer
	 */
	public IOrderPerformer getOrderPerformer() {
		return this.orderPerformer;
	}

	
}
