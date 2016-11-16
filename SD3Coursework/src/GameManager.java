import java.util.Vector;


public class GameManager
{
		Vector<Ship> ships = new Vector<Ship>();
		
		private MasterShip playerShip = new MasterShip();
		//private Vector<Ship> bcShips = new Vector<Ship>();
		//private Vector<Ship> bsShips = new Vector<Ship>();
		//private	Vector<Ship> BstShips = new Vector<Ship>();
		
		
		private GameGrid grid = new GameGrid();
		
		
		
		GameManager()
		{
			// Set top grid to prevent entry.
			grid.SetTileCondition(0, 0, false);
			
		
		}
		
		
		
		void Update()
		{
			
			System.out.println("New: " +playerShip.GetPosition().toString());
			System.out.println("Old: " + playerShip.GetPreviousPositions().lastElement().toString());
			playerShip.MakeMove();
			
			
			for(Ship ship : ships)
			{
				ship.MakeMove();
				
			}
		}
		
		void Undo()
		{
			System.out.println("Prev: " +playerShip.GetPosition().toString());
			System.out.println("New: " + playerShip.GetPreviousPositions().lastElement().toString());
			playerShip.UndoMove();
			
			
			
			for(Ship ship : ships)
			{
				ship.UndoMove();
				
			}
		}
		
		void SaveGame()
		{
			
		}
		
		void LoadGame()
		{
			
		}
		
		public MasterShip GetPlayerShip() {
			return playerShip;
		}

		public void SetPlayerShip(MasterShip playerShip) {
			this.playerShip = playerShip;
		}

/*		public Vector<Ship> GetBcShips() {
			return bcShips;
		}

		public void SetBcShips(Vector<Ship> bcShips) {
			this.bcShips = bcShips;
		}

		public Vector<Ship> GetBsShips() {
			return bsShips;
		}

		public void SetBsShips(Vector<Ship> bsShips)
		{
			this.bsShips = bsShips;
		}

		public Vector<Ship> GetBstShips() {
			return BstShips;
		}

		public void SetBstShips(Vector<Ship> bstShips)
		{
			BstShips = bstShips;
		}*/

		public GameGrid GetGrid() {
			return grid;
		}

		public void SetGrid(GameGrid grid) {
			this.grid = grid;
		}


}
