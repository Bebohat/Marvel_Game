package game.view;

import java.awt.BorderLayout;
import java.awt.Panel;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class BoardFrame extends JFrame{
	
	public BoardFrame() {
		super();
		setSize(1000,660);
		this.setLayout(new BorderLayout());
		this.setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		
		String g = JOptionPane.showInputDialog("Player 1 enter your name");
         FieldPanel panel1 = new FieldPanel(g);
         this.add(panel1,BorderLayout.NORTH);
         
        String t = JOptionPane.showInputDialog("Player 2 enter your name");
		FieldPanel panel2 = new FieldPanel(t);
        this.add(panel2,BorderLayout.SOUTH);
		
		this.validate();
	}

	public static void main(String[] args) {
		new BoardFrame();
	}
}