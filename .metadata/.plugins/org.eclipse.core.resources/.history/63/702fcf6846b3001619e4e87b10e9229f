import java.util.Random;


public class MasterShip extends Ship implements ShipMode
{
	// Change mode to interface to allow more options. currently 0 = defensive.
	//ShipMode mode = new DefensiveMode();
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

	public void SetMode() {
		// TODO Auto-generated method stub
		
	}

	public void GetMode() {
		// TODO Auto-generated method stub
		
	}
	
//	void SetMode(String mode);
//	ShipMode GetMode();
}
