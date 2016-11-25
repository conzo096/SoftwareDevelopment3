import java.awt.Point;
import java.awt.geom.Point2D;
import java.util.Random;
import java.util.Vector;


public abstract class Ship extends Thread  implements java.io.Serializable
{
	// Current position.
	private Point2D position; 
	
	
	
	public Ship()
	{
		position = new Point(0,0);
	}
	
	public void MakeMove()
	{	
		// Add current position to list.
		Random numGen = new Random();
		boolean valid = false;
		int x=0,y=0;

		// Check to ensure valid move - move to seperate method.
		while(valid == false)
		{
			valid = true;
			x = numGen.nextInt(3) -1;
			y = numGen.nextInt(3) -1;
			// Check if ship has moved.
			if(x == 0 && y == 0)
				valid = false;
			
			if (valid == true)
			{
				x += GetPosition().getX();
				y += GetPosition().getY();
			}
			// Check if ship is in tile range.
			if(x < 0 || x >3 || y < 0 || y >3)
				valid = false;
			// Check it is not moving to top left corner.
			if(x == 0 && y == 0)
				valid = false;
			
		}
			// All positions valid. Set position.
			position.setLocation(x,y);
	}

	

	public Point2D GetPosition()
	{
		return position;
	}

	public void SetPosition(Point2D pos)
	{
		position = pos;
	}
}
