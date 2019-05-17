package dogfight.controller;

import java.io.IOException;

import dogfight.model.Direction;
import dogfight.model.IDogfightModel;
import dogfight.model.IMobile;
import dogfight.model.Missile;
import dogfight.model.Position;
import dogfight.view.IViewSystem;

public class DogfightController implements IOrderPerformer {
	
	private int TIME_SLEEP = 30 ; 
	private IDogfightModel dogfightModel ; 
	private IViewSystem viewSystem;
	
	public DogfightController(final IDogfightModel dogfightModel) {
		this.dogfightModel = dogfightModel;
	}
	
	@Override
	public  void orderPerform (final UserOrder userOrder) throws IOException	{
		
		
		final int player = userOrder.getPlayer();
		final IMobile mobile = this.dogfightModel.getMobileByPlayer(player);
		
		switch (userOrder.getOrder()) {
		case UP:
			mobile.setDirection(Direction.UP);
			break;
		case RIGHT:
			mobile.setDirection(Direction.RIGHT);
			break;
		case DOWN:
			mobile.setDirection(Direction.DOWN);
			break;
		case LEFT:
			mobile.setDirection(Direction.LEFT);
			break;
		case SHOOT:
			this.launchMissile(player);
			break;
		case NOP:
		default:
			break ;
			
		
	}
}
	
	public void play ()  {
		this.gameLoop();
		this.viewSystem.displayMessage("end round !") ;
		
	}
	
	public void setViewSystem(final IViewSystem viewSystem)	{
		this.viewSystem = viewSystem ; 
		
	}
	
	public void launchMissile (final int player) throws IOException {
		final IMobile mobile = this.dogfightModel.getMobileByPlayer(player);
		double X = 0.0 ;
		double Y = 0.0; 
		
		switch(mobile.getDirection()) {
		case UP:
			X= mobile.getPosition().getX();
			Y = mobile.getPosition().getY() - 5.0 ;
			break ; 
		case DOWN :
			X = mobile.getPosition().getX();
			Y = mobile.getPosition().getY() + 5;
			break;
		case LEFT : 
			X = mobile.getPosition().getX() - 5;
			Y = mobile.getPosition().getY();
			break;
		case RIGHT:
			X = mobile.getPosition().getX() + 5;
			Y = mobile.getPosition().getY();
			break;
		}
		
		final Position pos = new Position(X, Y, this.dogfightModel.getArea().getDimension().getWidth(),
				this.dogfightModel.getArea().getDimension().getHeight());
		
		final Missile missile =  new Missile (null, pos, null, mobile.getDimension().getHeight(), null);
		this.dogfightModel.addMobile(missile);
	}
	
	public void gameLoop() 	{
	
	}
	
	private void manageCollision() {
		for (final IMobile weapon : this.dogfightModel.getMobiles()) {
			for (final IMobile mobile : this.dogfightModel.getMobiles()) {
				if (mobile != weapon) {
					if (weapon.isWeapon()) {
						if (this.isWeaponOnMobile(mobile, weapon)) {
							this.dogfightModel.getMobiles().remove(weapon);
							if (mobile.isWeapon()) {
								this.dogfightModel.getMobiles().remove(mobile);
							} else {
								mobile.hit();
							}
						}
					}
				}
			}
		}
	}

	private boolean isWeaponOnMobile(final IMobile mobile, final IMobile weapon) {
		if (((weapon.getPosition().getX() / weapon.getWidth()) >= (mobile.getPosition().getX() / weapon.getWidth()))
				&& ((weapon.getPosition().getX()
						/ weapon.getWidth()) <= ((mobile.getPosition().getX() + mobile.getWidth())
								/ weapon.getWidth()))) {
			if (((weapon.getPosition().getY() / weapon.getHeight()) >= (mobile.getPosition().getY()
					/ weapon.getHeight()))
					&& ((weapon.getPosition().getY()
							/ weapon.getHeight()) <= ((mobile.getPosition().getY() + mobile.getHeight())
									/ weapon.getHeight()))) {
				return true;
			}
		}
		return false;
	}

}
