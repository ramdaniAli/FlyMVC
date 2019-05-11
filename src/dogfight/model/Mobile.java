package dogfight.model;

import java.awt.Color;
import java.awt.Image;

public class Mobile implements IMobile {
	
	private int speed ; 
	protected Position position ; 
	protected Dimension dimension ;
	protected Direction direction ; 
	protected IDogfightModel dogfightModel; 
	protected Image[] images ; 
	
	public Mobile (Direction direction,Position position, Dimension dimension,int speed, String image ) {
		this.dimension=dimension ; 
		this.direction=direction ; 
		this.position=position;
		dogfightModel = null ;
		images = new Image[3];
		
	}

	public int getSpeed() {
		return speed;
	}
	

	public void move()	{
		switch (direction) {
		case UP : 
			moveUp();
			break;
		case DOWN :
			moveDown();
			break;
		case RIGHT:
			moveRight()	;
			break;
		case LEFT : 
			moveLeft()	;
			break;
		}
	}
	
	public void moveUp()	{
		position.setY(position.getY() + speed);
	}
	public void moveDown() {
		position.setY(position.getY() - speed);
	}
	
	public void moveRight () {
		position.setX(position.getX() + speed);
	}
	public void moveLeft () {
		position.setX(position.getX() - speed);
	}


	@Override
	public Direction getDirection() {
		// TODO Auto-generated method stub
		return direction;
	}

	@Override
	public void setDirection(Direction direction) {
		// TODO Auto-generated method stub
		this.direction = direction ;
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		return dimension.getWidth()	;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		return dimension.getHeight();
	}

	@Override
	public Image getImage() {
		// TODO Auto-generated method stub //return direction ?
		switch (direction) {
		case UP :
			return images[0];
		case RIGHT :
			return images[1];
		case DOWN :
			return images[2];
		case LEFT :
			return images[3];
		default:
			return images[0];
		}
	}

	@Override
	public void placeInArea(IArea area) {
		// TODO Auto-generated method stub
		//non complet
	}

	@Override
	public boolean isPlayer(int player) {
		// TODO Auto-generated method stub
		return false;
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
		return position;
	}

	@Override
	public Dimension getDimension() {
		// TODO Auto-generated method stub
		return dimension;
	}
	
	
	// not void must return Color type 
	public Color getColor () {
		return new Color (255, 255, 255);
		//non comlet
	}

	
	//not null must return IDogfightModel type 
	public IDogfightModel getDogfightModel() {
		return dogfightModel;
		
	}
	
	public void setDogfightModel(IDogfightModel dogfightModel) {
		this.dogfightModel = dogfightModel;
		// TODO Auto-generated method stub
		
	}



	
	


	


}
