package java_proj1_drawSmiley;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class MyPanelPaint extends JPanel{
	private static final long serialVersionUID = 1L;
	public void paintComponent(Graphics g) {
		// draw circle
		g.fillOval(100, 100, 50, 50);
		g.setColor(Color.black);
		g.drawOval(100, 100, 50, 50);
		System.out.println("just got executed!");
	}
}
