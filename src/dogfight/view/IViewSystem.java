package dogfight.view;

public interface IViewSystem {
	
	public default String displayMessage (String message)	{
		return message;	
	}
	
	public default void closeAll()	{
		
	}

}
