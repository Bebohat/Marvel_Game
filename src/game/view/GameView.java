package game.view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Panel;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import engine.Game;

public class GameView extends JFrame {
	private JPanel pnlChampions;
	
	
	
	public GameView() throws IOException {
		setTitle("Marvel");
		
		//setBounds(600, 200, 900, 600);
		//BoardFrame board= new BoardFrame();
		//board.setTitle("Marvel");
		//board.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		
		
	}
	public void addChampion(JButton champion) {
		pnlChampions.add(champion);
	}
	
		
		
		

		
	
}
