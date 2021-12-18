package java_proj1_drawSmiley;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class MyPanelPaint extends JPanel{
	private static final long serialVersionUID = 1L;
	public void paintComponent(Graphics g) {
		int x, y;
		int scale;
		x = 100;
		y = 100;
		scale = 2;
		Graphics2D g2 = (Graphics2D) g;
		// draw circle
		drawOutline(g, g2, x, y, scale);
		drawMouth(g,g2, x, y, scale);
		drawEyes(g, x, y, scale);
	}
	
	static void drawOutline(Graphics g, Graphics2D g2, int x, int y, int scale) {
		// stroke draw of the circle
		g2.setStroke(new BasicStroke(2));
		g.setColor(Color.black);
		g.drawOval(x, y, 50*scale, 50*scale);
		g.setColor(Color.yellow);
		g.fillOval(x, y, 50*scale, 50*scale);
		System.out.println("just got executed!");				
	}
	static void drawMouth(Graphics g, Graphics2D g2, int x, int y, int scale) {
		// draw the mouth
		g2.setStroke(new BasicStroke(1));
		g.setColor(Color.black);
		g.drawOval(x + 10*scale, y + 10*scale, 30*scale, 30*scale);
		// rectangle to cover circle of mouth
		g2.setStroke(new BasicStroke(2));
		g.setColor(Color.yellow);
		g.fillRect(x + 7*scale, y + 10*scale, 36*scale, 20*scale);		
	}
	static void drawEyes(Graphics g, int x, int y, int scale) {
		// draw the eyes
		g.setColor(Color.black);
		g.fillOval(x + 15*scale, y + 15*scale, 5*scale,5*scale);		
		g.setColor(Color.black);
		g.fillOval(x + 30*scale, y + 15*scale, 5*scale,5*scale);		
	}
	
	
}
