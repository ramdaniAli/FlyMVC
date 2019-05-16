package dogfight.model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Observable;

public class DogfightModel extends Observable implements IDogfightModel{
	private Sky sky ;
	private final ArrayList<IMobile> mobiles ;
	
	public DogfightModel ()	{
		this.mobiles= new ArrayList<IMobile> ()	;
	}

	@Override
	public IArea getArea() {
		// TODO Auto-generated method stub
		return this.sky;
	}

	@Override
	public void buildArea(Dimension dimension) throws IOException {
		// TODO Auto-generated method stub
		this.sky=new Sky(dimension);
		
	}

	@Override
	public void addMobile(Mobile mobile) {
		// TODO Auto-generated method stub
		this.mobiles.add(mobile);
		
	}

	@Override
	public void removeMobile(Mobile mobile) {
		// TODO Auto-generated method stub
		this.mobiles.remove(mobile);
		
	}

	@Override
	public ArrayList<IMobile> getMobiles() {
		// TODO Auto-generated method stub
		return this.mobiles;
	}

	@Override
	public IMobile getMobileByPlayer(int player) {
		// TODO Auto-generated method stub
		for (final IMobile mobile : this.mobiles) {
			if(mobile.isPlayer(player)) {
				return mobile ;
			}
			
		}
		return null;
	}

	@Override
	public void setMobilesHavesMoved() {
		// TODO Auto-generated method stub
		this.setChanged();
		this.notifyObservers();
		
	}

}
