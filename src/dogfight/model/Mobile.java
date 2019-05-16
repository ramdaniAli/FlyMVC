package dogfight.model;

import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class Mobile implements IMobile {
	
	protected Position position ; 
	protected Dimension dimension ;
	protected Direction direction ; 
	protected IDogfightModel dogfightModel; 
	protected Image[] images ; 
	private int speed ; 

	
	public Mobile (final Direction direction,final Position position,final Dimension dimension,final int speed,final String image ) throws IOException {
		images = new Image[4];
		this.images[Direction.UP.ordinal()] = ImageIO.read(new File("images/Dog_UP.png"));
		this.images[Direction.DOWN.ordinal()] = ImageIO.read(new File("images/Dog_DOWN.png"));
		this.images[Direction.LEFT.ordinal()] = ImageIO.read(new File("images/Dog_LEFT.png"));
		this.images[Direction.RIGHT.ordinal()] = ImageIO.read(new File("images/Dog_RIGHT.png"));
		this.buildAllImages(image);
		
		this.dimension=dimension ; 
		this.direction=direction ; 
		this.position=position;
		dogfightModel = null ;
		
	}

	public int getSpeed() {
		return this.speed;
	}
	

	public void move()	{
		switch (direction) {
		case UP : 
			this.moveUp();
			break;
		case DOWN :
			this.moveDown();
			break;
		case RIGHT:
			this.moveRight()	;
			break;
		case LEFT : 
			this.moveLeft()	;
			break;
		default :
			break ;
		}
	}
	
	public void moveUp()	{
		this.position.setY(position.getY() + speed);
	}
	public void moveDown() {
		this.position.setY(position.getY() - speed);
	}
	
	public void moveRight () {
		this.position.setX(position.getX() + speed);
	}
	public void moveLeft () {
		this.position.setX(position.getX() - speed);
	}


	@Override
	public Direction getDirection() {
		// TODO Auto-generated method stub
		return this.direction;
	}

	@Override
	public void setDirection(Direction direction) {
		// TODO Auto-generated method stub
		this.direction = direction ;
	}

	@Override
	public int getWidth() {
		// TODO Auto-generated method stub
		//return dimension.getWidth()	;
		return 1 ;
	}

	@Override
	public int getHeight() {
		// TODO Auto-generated method stub
		//return dimension.getHeight();
		return 1 ;
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
		return this.dimension;
	}
	
	
	// not void must return Color type 
	public Color getColor () {
		//return new Color (255, 255, 255);
		//non comlet
		return  null ;
	}

	
	//not null must return IDogfightModel type 
	public IDogfightModel getDogfightModel() {
		return this.dogfightModel;
		
	}
	
	public void setDogfightModel(IDogfightModel dogfightModel) {
		this.dogfightModel = dogfightModel;
		// TODO Auto-generated method stub
		
	}

	public void buildAllImages(final String image	) throws IOException {
		this.images = new Image [4] ;
		this.images[Direction.UP.ordinal()] = ImageIO.read(new File("images/" + image + "_UP.png")) ;
		this.images[Direction.DOWN.ordinal()] = ImageIO.read(new File("images/" + image + "_DOWN.png"));
		this.images[Direction.LEFT.ordinal()] = ImageIO.read(new File("images/" + image + "_LEFT.png"));
		this.images[Direction.RIGHT.ordinal()] = ImageIO.read(new File("images/" + image + "_RIGHT.png"));

	}


	
	


	


}
