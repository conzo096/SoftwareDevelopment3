import java.util.Vector;

public class Undo implements Command
{

	private History prevMove;
	
	 public Undo(History abcStock)
	 {
	      this.prevMove = abcStock;
	   }
	
	public Vector<Ship> execute()
	{
		return prevMove.UndoMove();
	}

}
