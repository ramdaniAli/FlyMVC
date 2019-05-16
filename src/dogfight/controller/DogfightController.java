package dogfight.controller;

import java.io.IOException;

import dogfight.model.IDogfightModel;
import dogfight.view.IViewSystem;

public class DogfightController implements IOrderPerformer {
	
	private int TIME_SLEEP = 30 ; 
	private final IDogfightModel dogfightModel ; 
	private IViewSystem viewSystem;
	
	public DogfightController (IDogfightModel dogfightModel)	{
		this.dogfightModel = dogfightModel ; 
	}
	
	public void orderPerform (final UserOrder userOrder)throws IOException	{
	}
	
	public void play () {
		
	}
	
	public void setViewSystem(IViewSystem viewSystem)	{
	}
	
	public void launchMissile (int player) {
		
	}
	
	public void gameLoop()	{
		
	}

}
