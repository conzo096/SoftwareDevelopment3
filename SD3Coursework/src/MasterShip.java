import java.util.Random;


public class MasterShip extends Ship
{
	// Change mode to interface to allow more options. currently 0 = defensive.
	Boolean mode;
	public MasterShip()
	{
		// Chose a random tile (Other than 0,0) to start one.
		int x =0,y=0;
		Random numGen = new Random();
		while( x == 0 && y ==0)
		{
			x = numGen.nextInt(4);
			y = numGen.nextInt(4);
			GetPosition().setLocation(x,y);
		}
	}
	
	void SetMode(Boolean b)
	{
		mode = b;
	}
	Boolean GetMode()
	{
		return mode;
	}
}
