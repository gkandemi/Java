package Test;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.util.Timer;
import java.util.TimerTask;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.LayoutStyle;
import java.util.*;

import Operations.Word;

public class Pencere extends JFrame{

	public Pencere(){

		setLayout(null);
		Word objWord =  new Word("Balık",10,100,100,80);
		objWord.setBounds(objWord.getX_position(),  objWord.getY_position(), 50, 50);
		add(objWord);
		
		Timer timer = new Timer();
		
		timer.schedule(new TimerTask() {
			  @Override
			  public void run() {
			    // Your database code here
				  System.out.println("ok");
			  }
			}, 1);
		
	}
	
}
