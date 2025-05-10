package game.controller;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.table.AbstractTableModel;

import engine.Game;
import engine.GameListener;
import engine.Player;
import engine.PlayerListener;
import game.*;
import game.view.GameView;
import model.world.*;
import model.abilities.*;
import model.effects.*;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
public class GameGUI extends JPanel implements GameListener,PlayerListener, ChampionListener,ActionListener {

	private Game game;
	private GameView gameview;
	private  ArrayList<JButton> btnsChampions;
	private final ArrayList<String[]> Rs = new ArrayList<String[]>();
    private String[] OneRow;
    private JButton champion1= new JButton("youssef");
    private JButton champion2= new JButton("youssef");
    private JButton champion3= new JButton("youssef");
    private JButton champion4= new JButton("youssef");
    private JButton champion5= new JButton("youssef");
    private JButton champion6= new JButton("youssef");
    private JButton champion7= new JButton("youssef");
    private JButton champion8= new JButton("youssef");
    private JButton champion9= new JButton("youssef");
    private JButton champion10= new JButton("youssef");
    private JButton champion11= new JButton("youssef");
    private JButton champion12= new JButton("youssef");
    private JButton champion13= new JButton("youssef");
    private JButton champion14= new JButton("youssef");
    private JButton champion15= new JButton("youssef");
	
 public GameGUI() throws IOException  {
	 CSVFile Rd = new CSVFile();
     
     File DataFile = new File("Champions.csv");
      ReadCSVfile(DataFile);
		
		
		
		
		//gameview= new GameView(); 
		//gameview.setVisible(true);
	    //gameview.setDefaultCloseOperation(0);
	}
	     
     

     public ArrayList<String[]> ReadCSVfile(File DataFile) {
         try {
        	 String s = "";
        	 ArrayList<String> x= new ArrayList<>();
             BufferedReader brd = new BufferedReader(new FileReader(DataFile));
             while (brd.ready()) {
                 String st = brd.readLine();
                 OneRow = st.split(",|\\s|;");
                 Rs.add(OneRow);
                 JButton champion1= new JButton(OneRow[1]);
                 x.add(OneRow[1]);
                
                 System.out.println(s);
                 
                 //System.out.println(Arrays.toString(OneRow));
                
                
             } // end of while
             champion1.setPreferredSize(new Dimension(125, 150));
             this.add(champion1);
             champion1.setText(x.get(0));
             champion2.setPreferredSize(new Dimension(125, 150));
             this.add(champion2);
             champion2.setText(x.get(1));
             champion2.setPreferredSize(new Dimension(125, 150));
             this.add(champion3);
             champion3.setText(x.get(2)+" Strange");
             champion3.setPreferredSize(new Dimension(125, 150));
             this.add(champion4);
             champion4.setText(x.get(3));
             this.add(champion5);
             champion5.setText(x.get(4));
             this.add(champion6);
             champion6.setText(x.get(5));
             this.add(champion7);
             champion7.setText(x.get(6));
             this.add(champion8);
             champion8.setText(x.get(7));
             this.add(champion9);
             champion9.setText(x.get(8));
             this.add(champion10);
             champion10.setText(x.get(9));
             this.add(champion11);
             champion11.setText(x.get(10));
             this.add(champion12);
             champion12.setText(x.get(11));
             this.add(champion13);
             champion13.setText(x.get(12));
             this.add(champion14);
             champion14.setText(x.get(13));
             this.add(champion15);
             champion15.setText(x.get(14)+" Jacket");
             String g = JOptionPane.showInputDialog("Player 1 enter your name");
             champion1.addActionListener(this); 
             champion2.addActionListener(this); 
             champion3.addActionListener(this); 
             champion4.addActionListener(this); 
             champion5.addActionListener(this); 
             champion6.addActionListener(this); 
             champion7.addActionListener(this); 
             champion8.addActionListener(this); 
             champion9.addActionListener(this); 
             champion10.addActionListener(this); 
             champion11.addActionListener(this); 
             champion12.addActionListener(this); 
             champion13.addActionListener(this); 
             champion14.addActionListener(this); 
             champion15.addActionListener(this); 
             
           
             
             
             
             
         } // end of try
         catch (Exception e) {
             String errmsg = e.getMessage();
             System.out.println("File not found:" + errmsg);
         } // end of Catch
         return Rs;
     }// end of ReadFile method
     
	
	public static void main(String[] args) throws IOException {
		// initialize the Game GUI
		//new GameGUI();
		JFrame frame = new JFrame("Champions List");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Create and set up the content pane.
        GameGUI newContentPane = new GameGUI();
        frame.setContentPane(newContentPane);
        // Display the window.
        frame.pack();
        frame.setVisible(true);
	}

	@Override
	public void onChampionUpdated() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onPlayerUpdated(Player player1, Player player2) {
		// TODO Auto-generated method stub
		
	}
	int x=3;
	@Override
	
	public void actionPerformed(ActionEvent e) {
		//JOptionPane.showMessageDialog(null,"You clicked on "); 
		
		//while(x>0) {
		  if (e.getSource() == champion1)
	      {
	        this.remove(champion1);
	      x--;
	        System.out.println(x);
	      }
	      
		  else if (e.getSource() == champion2)
	      {
	        this.remove(champion2);
	        x--;
	        System.out.println(x);
	      }
		  else if (e.getSource() == champion3)
	      {
	    	  this.remove(champion3);
	    	  x--;
	    	  System.out.println(x);
	      }
		  else if (e.getSource() == champion4)
	      {
	    	  this.remove(champion4);
	    	  x--;
	      }
		  else if (e.getSource() == champion5)
	      {
	    	  this.remove(champion5);
	    	  x--;
	      }
		  else if (e.getSource() == champion6)
	      {
	    	  this.remove(champion6);
	    	  x--;
	      }
		  else if (e.getSource() == champion7)
	      {
	    	  this.remove(champion7);
	    	  x--;
	      }
		  else if (e.getSource() == champion8)
	      {
	    	  this.remove(champion8);
	    	  x--;
	      }
		  else if (e.getSource() == champion9)
	      {
	    	  this.remove(champion9);
	    	  x--;
	      }
		  else if (e.getSource() == champion10)
	      {
	    	  this.remove(champion10);
	    	  x--;
	      }
		  else if (e.getSource() == champion11)
	      {
	    	  this.remove(champion11);
	    	  x--;
	      }
		  else if (e.getSource() == champion12)
	      {
	    	  this.remove(champion12);
	    	  x--;
	      }
		  else if (e.getSource() == champion13)
	      {
	    	  this.remove(champion13);
	    	  x--;
	      }
		  else if (e.getSource() == champion14)
	      {
	    	  this.remove(champion14);
	    	  x--;
	      }
		  else if (e.getSource() == champion15)
	      {
	    	  this.remove(champion15);
	    	  x--;
	      }
		  
		  
	    }
		
		
	//}
		


	public class CSVFile {
       
    }// end of CSVFile class
	  public class MyModel extends AbstractTableModel {
	        private final String[] columnNames = { "1", "2", "3", "4", "5", "6", "7", "8" , "9" , "10" , "11" , "12", "13"};
	        private ArrayList<String[]> Data = new ArrayList<String[]>();

	        public void AddCSVData(ArrayList<String[]> DataIn) {
	            this.Data = DataIn;
	            this.fireTableDataChanged();
	        }

	        @Override
	        public int getColumnCount() {
	            return columnNames.length;// length;
	        }

	        @Override
	        public int getRowCount() {
	            return Data.size();
	        }

	        @Override
	        public String getColumnName(int col) {
	            return columnNames[col];
	        }

	        @Override
	        public Object getValueAt(int row, int col) {
	            return Data.get(row)[col];
	        }
	    }

}
