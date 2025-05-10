package game.view;

import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;


public class CardAreaPanel extends JPanel{
	
	public CardAreaPanel() {
		super();
		this.setPreferredSize(new Dimension(600, 300));
		this.setLayout(new GridLayout(2,3));
		CardButton[][] cardButtons= new CardButton[2][3];
		String[][] buttonsLabels= {{"Champion 1","Champion 2","Champion  3"},
									{"Ability 1","Ability 2","Ability 3"}};
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				cardButtons[i][j]= new CardButton(buttonsLabels[i][j]);
				this.add(cardButtons[i][j]);
			}
		}
	}
	
	public static void main(String[] args) {
		JFrame frame= new JFrame();
		frame.setSize(600,300);
		frame.setVisible(true);
		CardAreaPanel panel= new CardAreaPanel();
		frame.add(panel);
		frame.validate();
	}
}
