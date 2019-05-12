package dogfight.view;

import java.util.Observable;

import dogfight.controller.IOrderPerformer;
import dogfight.model.IDogfightModel;

public class DogfightView implements Runnable,IViewSystem {
	
	
	public DogfightView(IOrderPerformer orderPerformer, IDogfightModel dogfightModel, Observable observable)	{
		
	}

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	

	
	public void closeAll() {
		
	}


	@Override
	public void displayMessage(String message) {
		// TODO Auto-generated method stub
		
	}

}
