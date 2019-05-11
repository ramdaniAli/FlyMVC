package dogfight.model;

import java.util.ArrayList;

public interface IDogfightModel {

	public IArea getArea()	;
	
	public void buildArea(Dimension dimension)	;
	
	public void addMobile (Mobile mobile);
	
	public void removeMobile(Mobile mobile)	;
	
	public ArrayList<IMobile> getMobiles()	;
	
	public IMobile getMobileByPlayer(int player);
	
	public void setMobilesHavesMoved()	;
	
}
