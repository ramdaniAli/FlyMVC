package dogfight.controller;

public class UserOrder implements IUserOrder {

	private final int player ;
	private final Order order;
	
	public UserOrder (final int player,final Order order) {
		this.player = player;
		this.order = order;
	}

	@Override
	public Order getOrder() {
		// TODO Auto-generated method stub
		return this.order;
	}

	@Override
	public int getPlayer() {
		// TODO Auto-generated method stub
		return this.player;
	}
	
}
