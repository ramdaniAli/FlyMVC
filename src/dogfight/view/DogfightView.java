package dogfight.view;

import java.util.Observable;

public class DogfightView implements Runnable,IViewSystem {
	
	
	public DogfightView(IOrderPerformer orderPerformer, IDogfightModel dogfightModel, Observable observable)	{
		
	}

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
	
	public String DisplayMessage(String message)	{
		return message;
		
	}
	
	public void closeAll() {
		
	}

}