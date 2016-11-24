import java.util.Vector;


public class Tile
{
	// Hold a list of ships in this square.
	private Vector<Ship> currentShips;
	// Hold a path to an image to texture grid tile.
	private String filePath;
	// Condition to check if allowed visit tile.
	private boolean allowedToEnter;
	
	
	Tile()
	{
		 allowedToEnter = true;
		 currentShips = new Vector<Ship>();
	}
	
	
	public void AddShip(Ship ship)
	{
		currentShips.add(ship);
		
	}
	public Vector<Ship> GetCurrentShips()
	{
		return currentShips;
	}
	public void SetCurrentShips(Vector<Ship> currentShips)
	{
		this.currentShips = currentShips;
	}
	public String GetFilePath()
	{
		return filePath;
	}
	public void SetFilePath(String filePath)
	{
		this.filePath = filePath;
	}
	public boolean IsAllowedToEnter()
	{
		return allowedToEnter;
	}
	public void SetAllowedToEnter(boolean condition)
	{
		allowedToEnter = condition;
	}
	
	
	
}
