package java_proj1_drawSmiley;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class MyPanelPaint extends JPanel{
	private static final long serialVersionUID = 1L;
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		// draw circle
		// stroke draw of the circle
		g2.setStroke(new BasicStroke(2));
		g.setColor(Color.black);
		g.drawOval(100, 100, 50, 50);
		g.setColor(Color.yellow);
		g.fillOval(100, 100, 50, 50);
		System.out.println("just got executed!");
	}
}
