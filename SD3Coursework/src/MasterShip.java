import java.util.Random;


public class MasterShip extends Ship
{
	// Strategy pattern;
	private Mode mode;
	
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
		mode = new Mode(new Defensive());
	}

	public void PrintPosition()
	{
		String position = GetPosition().toString();
		System.out.println("Pos: "+ position);
	}
	
	public void SetMode(Strategy newMode)
	{
		mode = new Mode(newMode);
	}
	public Mode GetMode()
	{
		return mode;
	}
	
}
