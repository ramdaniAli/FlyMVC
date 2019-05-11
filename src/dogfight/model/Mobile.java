package dogfight.model;

import java.awt.Color;
import java.awt.Image;

public class Mobile implements IMobile {
	
	private int speed ; 
	
	public Mobile (Direction diretion,Position position, Dimension dimension,int speed, String image ) {
		
		
	}

	public int getSpeed() {
		return speed;
	}
	

	public void move()	{
		
	}
	
	public void moveUp()	{
		
	}
	public void moveDown() {
		
	}
	public void moveLeft () {
		
	}


	@Override
	public Direction getDirection() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void setDirection(Direction direction) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Image getImage() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void placeInArea(IArea area) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isPlayer(int player) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public DogfightModel setDogfightModel(DogfightModel dogfightModel) {
		return dogfightModel;
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean hit() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isWeapon() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Position getPosition() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Dimension getDimension() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	// not void must return Color type 
	public Color getColor () {
		return null;
		
	}

	
	//not null must return IDogfightModel type 
	public IDogfightModel getDogfightModel() {
		return null;
		
	}


	


}
