package First;

import dogfight.controller.DogfightController;
import dogfight.model.DogfightModel;
import dogfight.view.DogfightView;

public class dogfightMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final DogfightModel dogfightModel = new DogfightModel()	;
		final DogfightController dogfightController = new DogfightController(dogfightModel)	;
		final DogfightView dogfightView = new DogfightView (dogfightController, dogfightModel, dogfightModel)	;
		dogfightController.setViewSystem(dogfightView);
		dogfightController.play();
		
	}

}
