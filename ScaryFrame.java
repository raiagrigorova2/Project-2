package main;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import resources.ResourceLoader;

public class ScaryFrame extends JFrame{

	ScaryFrame(){
		this.add(new JLabel(new ImageIcon(ResourceLoader.loadImage("possessed.jpg"))));
		ResourceLoader.PlaySound("possessed.wav");
		Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
		this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);
		this.setPreferredSize(new Dimension(1024, 640));
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		this.pack();
	}
}