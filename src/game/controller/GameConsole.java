package game.controller;

import java.io.IOException;
import java.util.Scanner;

import javax.swing.JTextField;

import engine.Game;
import engine.Player;
import game.view.GameView;
import model.abilities.Ability;
import model.world.Champion;


public class GameConsole {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Scanner s = new Scanner(System.in);
		System.out.print("Enter first player name : /n" );  
		Player p1= new Player(s.nextLine());
		System.out.print("Enter second plaeyer name: ");  
		Player p2= new Player(s.nextLine()); 
		
		
		Game game= new Game(p1, p2);
		Game.loadAbilities("Abilities.csv");
		Game.loadChampions("Champions.csv");
		game.checkGameOver();
		/*for(Ability a: Game.getAvailableAbilities()) {
			System.out.println("- " + a);
		}
		for(Champion c : Game.getAvailableChampions()) {
			System.out.println("- " + c);
		}
		
	}
*/
}
}
