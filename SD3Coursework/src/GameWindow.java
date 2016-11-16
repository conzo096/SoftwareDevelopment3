	import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridLayout;

	import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

	public class GameWindow extends JFrame
	{
		private static final long serialVersionUID = 1L;
		private JPanel contentPane;
		private GameManager game;
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
			setBounds(100, 100, 634, 449);
			contentPane = new JPanel();
			// Have 4x4 layout.		(0,0) (0,1) (0,2) (0,3)			
			//						(1,0) (1,1) (1,2) (1,3)
			//						(2,0) (2,1) (2,2) (2,3)
			//						(3,0) (3,1) (3,2) (3,3)
			contentPane.setLayout(new GridLayout(4,4));
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			
			JButton Move = new JButton("Move");
			Move.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent arg0)
				{
					game.Update();
				}
			}	);
			contentPane.add(Move);
			
			JButton btnUndo = new JButton("Undo");
			btnUndo.addActionListener(new ActionListener()
			{
				public void actionPerformed(ActionEvent arg0)
				{
					
				}
			});
			btnUndo.setToolTipText("you are a fool, undo your randomly generated move.");
			contentPane.add(btnUndo);
			
			JButton btnSave = new JButton("Save");
			contentPane.add(btnSave);
			
			JButton btnLoad = new JButton("Load");
			contentPane.add(btnLoad);

		}
		

	}
