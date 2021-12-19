package java_proj1_drawSmiley;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

import javax.swing.JPanel;

public class MyPanelPaint extends JPanel{
	private static final long serialVersionUID = 1L;
	private int x;
	private int y;
	private int scale;
	private String event;
	
	// Default constructor
	public MyPanelPaint() {
		// we must define the default values
		this.x = 100;
		this.y = 100;
		this.scale = 2;
	}
	
	// Parameterized constructor
	public MyPanelPaint(int x, int y, int scale) {
		// the arguments are used as values
		this.x = x;
		this.y = y;
		this.scale = scale;
	}
	
	// Calling a constructor from a constructor
	// Parameterized constructor
	public MyPanelPaint(int x, int y, int scale, String event) {
		this(x, y, scale); // calling the constructor
		this.event = event;
	}	
	
	public void paintComponent(Graphics g) {
		Graphics2D g2 = (Graphics2D) g;
		// draw circle
		drawOutline(g, g2, this.x, this.y, this.scale);
		drawMouth(g,g2, this.x, this.y, this.scale);
		drawEyes(g, this.x, this.y, this.scale);
		if(this.event != null) {
			System.out.println("Event: " + this.event);
		}
		
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
