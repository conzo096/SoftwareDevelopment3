
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Point;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

import javafx.geometry.Point2D;

import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
	public class GameWindow extends JFrame
	{
		private static final long serialVersionUID = 1L;
		private JPanel contentPane;
		private GameManager game;
		private JLabel[][] grid = new JLabel[4][4];
		
		/**
		 * Launch the application.
		 */
		public static void main(String[] args)
		{
			EventQueue.invokeLater(new Runnable()
			{
				public void run()
				{
					try
					{
						// Load game instance.
						GameWindow frame = new GameWindow();
						frame.setVisible(true);
					}
					catch (Exception e)
					{
						e.printStackTrace();
					}
				}
			});
		}
		
		/**
		 * Create the frame.
		 */
		public GameWindow()
		{
			
			// Load game manager.
			game = new GameManager(); 
			
			
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setBounds(100, 100, 936, 456);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			
			for(Integer col =0; col < 4;col++)
			{
				for(Integer row =0; row <4; row++)
				{

					JLabel tile = new JLabel();
					tile.setLocation(col*128,row*128);
					tile.setBounds(col*120, row*80, 120, 80);
					tile.setBorder( BorderFactory.createLineBorder(Color.black, 1));
					tile.setText(col.toString()+","+row.toString());
					tile.setOpaque(true);

					if(game.GetGrid().GetTile(col, row).IsAllowedToEnter() == true)
						tile.setBackground(Color.lightGray);
					else
						tile.setBackground(Color.white);
					grid[col][row] = tile;
					contentPane.add(grid[col][row]);
				}
				
			}
			JButton Move = new JButton("Move");
			Move.setBounds(521, 221, 200, 100);
			Move.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent arg0)
				{
					game.MakeMove();
					UpdateLabels();
				}
			}	);

			contentPane.add(Move);
			
			JButton btnUndo = new JButton("Undo");
			btnUndo.setToolTipText("you are a fool, undo your randomly generated move.");
			btnUndo.setBounds(720, 318, 200, 100);
			btnUndo.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent arg0)
				{
					game.UndoMove();
					UpdateLabels();
				}
			});
			contentPane.add(btnUndo);
			
			JButton btnSave = new JButton("Save");
			btnSave.addActionListener(new ActionListener() 
			{
				public void actionPerformed(ActionEvent e)
				{
					game.SaveGame();
					UpdateLabels();
				}
			});
			btnSave.setBounds(720, 221, 200, 100);
			contentPane.add(btnSave);
			
			JButton btnLoad = new JButton("Load");
			btnLoad.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent e)
				{
					game = GameManager.LoadGame();
					UpdateLabels();
				}
			});
			btnLoad.setBounds(521, 318, 200, 100);
			contentPane.add(btnLoad);
			
			final JButton btnMode = new JButton("Defensive Mode");
			btnMode.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e)
				{
					if(game.GetPlayerShip().GetMode().executeMode() == "Defensive")
					{
						btnMode.setText("OFFENSIVE");
						game.GetPlayerShip().SetMode(new Offensive());
					}
					else if(game.GetPlayerShip().GetMode().executeMode() == "Offensive")
					{
						btnMode.setText("DEFENSIVE");
						game.GetPlayerShip().SetMode(new Defensive());
					}
				}
			});
			btnMode.setBounds(720, 127, 200, 100);
			contentPane.add(btnMode);
		}

		private void UpdateLabels()
		{
			for(int col =0; col <4;col++)
			{
				for(int row =0; row < 4; row++)
				{
					grid[col][row].setText(game.GetGrid().UpdateVisualGrid(col, row));
				}
			}			

		}
	}
