import java.util.Vector;


public class GameGrid
{
	private Tile[][] sky = new Tile[4][4];
	
	
	GameGrid()
	{
		
	}
	
	GameGrid(Vector<Ship> ships)
	{
		
		
	}
	
	
	void SetSky (Tile tiles[][])
	{
		sky = tiles;
		
	}
	void SetTileCondition(int x, int y, boolean condition)
	{
		//if (x >-1 && y > -1 && x < 4 && y < 4)
			//sky[x][y].SetAllowedToEnter(condition);
		
	}
	
	Tile[][] GetSky()
	{
		return sky;
	}
	
}
